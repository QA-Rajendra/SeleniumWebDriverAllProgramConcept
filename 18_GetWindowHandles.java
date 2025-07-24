import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetWindowHandles {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  // Create a new ChromeDriver instance
        driver.get("https://www.google.com");   // Navigate to Google
        Set<String> handles = driver.getWindowHandles();  // Get all window handles
        System.out.println("All Handles: " + handles);  // Print all window handles to the console
    }
}
// Create a new ChromeDriver instance - Launch the browser.

// Navigate to Google - Open the Google homepage.

// Get all window handles - Retrieve the set of handles for all open browser windows.

// Print all window handles to the console - Print out all window handles so you can see which windows are open.
