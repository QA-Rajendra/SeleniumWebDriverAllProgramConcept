

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MinimizeWindow {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  // Create a new ChromeDriver instance
        driver.get("https://www.google.com");   // Navigate to Google
        driver.manage().window().minimize();  // Minimize the browser window
        driver.manage().window().fullscreen();  // Make the browser window fullscreen
    }
}
// Create a new ChromeDriver instance - Start the browser.

// Navigate to Google - Open the Google homepage.

// Minimize the browser window - Shrinks the browser window to the taskbar (if you are on Windows) or dock (if you are on macOS).

// Make the browser window fullscreen - Change the browser window size to fullscreen mode, similar to pressing the F11 key.
