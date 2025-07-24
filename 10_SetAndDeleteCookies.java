

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Cookie;

public class SetAndDeleteCookies {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  // Create a new ChromeDriver instance
        driver.get("https://www.google.com");   // Navigate to Google

        // Create a new cookie
        Cookie cookie = new Cookie("user", "JohnDoe");  // Create a cookie with the name "user" and value "JohnDoe"

        // Add the cookie to the browser
        driver.manage().addCookie(cookie);  // Add the cookie to the current session

        // Verify if the cookie is set by retrieving it
        Cookie retrievedCookie = driver.manage().getCookieNamed("user");  // Get the cookie by its name
        System.out.println("Cookie Set: " + retrievedCookie.getName() + " = " + retrievedCookie.getValue());  // Print the cookie details

        // Now delete all cookies
        driver.manage().deleteAllCookies();  // Delete all cookies from the current session

        // Verify if the cookies were deleted
        Cookie deletedCookie = driver.manage().getCookieNamed("user");  // Try to retrieve the cookie again
        if (deletedCookie == null) {
            System.out.println("Cookie has been deleted.");  // Print confirmation if the cookie is deleted
        }

        // Close the browser session
        driver.quit();  // Close the browser
    }
}

