import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  // Create a new ChromeDriver instance
        driver.get("https://www.google.com");   // Navigate to Google
        driver.manage().window().maximize();  // Maximize the browser window
    }
}
// Create a new ChromeDriver instance - Launch the browser.

// Navigate to Google - Open the Google homepage.

// Maximize the browser window - Resize the browser to take up the full screen.
