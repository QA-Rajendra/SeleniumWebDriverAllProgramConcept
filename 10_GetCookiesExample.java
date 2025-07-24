import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class GetCookiesExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  // Create a new ChromeDriver instance
        driver.get("https://www.google.com");   // Navigate to Google

        // Retrieve all cookies
        Set<Cookie> allCookies = driver.manage().getCookies();  // Get a set of all cookies

        // Print all cookies
        System.out.println("All Cookies:");
        for (Cookie cookie : allCookies) {
            System.out.println(cookie.getName() + ": " + cookie.getValue());  // Print cookie name and value
        }

        // Retrieve a specific cookie by name
        Cookie specificCookie = driver.manage().getCookieNamed("NID");  // Get cookie by name (for example, "NID" on Google)
        
        if (specificCookie != null) {
            System.out.println("\nSpecific Cookie:");
            System.out.println(specificCookie.getName() + ": " + specificCookie.getValue());  // Print specific cookie
        } else {
            System.out.println("\nCookie with the name 'NID' not found.");
        }

        // Close the browser
        driver.quit();  // Close the browser session
    }
}
