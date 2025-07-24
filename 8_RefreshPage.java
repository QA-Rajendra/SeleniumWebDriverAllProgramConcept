import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshPage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  // Create a new ChromeDriver instance
        driver.get("https://www.google.com");   // Navigate to Google website
        driver.navigate().refresh();  // Refresh the current page
    }
}
// Create a new ChromeDriver instance - Start the browser.

// Navigate to Google website - Open the Google homepage.

// Refresh the current page - Reload the current page in the browser.
