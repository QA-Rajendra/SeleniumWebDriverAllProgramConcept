import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class ImplicitWaitExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  // Create a new ChromeDriver instance
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // Set implicit wait of 10 seconds
        driver.get("https://www.google.com");   // Navigate to Google
    }
}
// Create a new ChromeDriver instance - Start the browser.

// Set implicit wait of 10 seconds - Tells the WebDriver to wait up to 10 seconds when searching for elements before throwing a NoSuchElementException. If an element appears earlier, the search will continue without waiting for the full 10 seconds.

// Navigate to Google - Open the Google homepage.
