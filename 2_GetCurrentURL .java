import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class 2_GetCurrentURL {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  // Create a new ChromeDriver instance
        driver.get("https://www.google.com");   // Navigate to the Google website
        String currentURL = driver.getCurrentUrl();  // Get the current URL of the page
        System.out.println("Current URL: " + currentURL);  // Print the current URL to the console
    }
}
// Create a new ChromeDriver instance - Initialize the browser driver.

// Navigate to the Google website - Open the Google homepage.

// Get the current URL of the page - Store the URL of the page in currentURL.

// Print the current URL to the console - Print out the current URL to check the URL that the driver is currently on.