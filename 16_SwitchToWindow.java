import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SwitchToWindow {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  // Create a new ChromeDriver instance
        driver.get("https://www.google.com");   // Navigate to Google
        String mainWindow = driver.getWindowHandle();  // Get the handle of the main window

        Set<String> allWindows = driver.getWindowHandles();  // Get all window handles
        for (String win : allWindows) {
            driver.switchTo().window(win);  // Switch to each window by handle
        }
    }
}
// Create a new ChromeDriver instance - Start the browser.

// Navigate to Google - Open the Google homepage.

// Get the handle of the main window - Get the unique handle (ID) of the main browser window.

// Get all window handles - Retrieve the handles of all open windows.

// Switch to each window by handle - Loop through all the window handles and switch the focus to each window.
