import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrowser {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  // Create a new ChromeDriver instance
        driver.get("https://www.google.com");   // Navigate to Google website
        driver.close();  // Close the current tab
    }
}
// Create a new ChromeDriver instance - Launch the browser.

// Navigate to Google website - Open the Google homepage.

// Close the current tab - Close the current tab in the browser (not the entire browser, just the active tab).
