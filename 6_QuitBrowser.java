import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitBrowser {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  // Create a new ChromeDriver instance
        driver.get("https://www.google.com");   // Navigate to Google website
        driver.quit();  // Close all windows and end the WebDriver session
    }
}
// Create a new ChromeDriver instance - Start the browser.

// Navigate to Google website - Open Google homepage.

// Close all windows and end the WebDriver session - This closes the browser completely, including all tabs and windows.

