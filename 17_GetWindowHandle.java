import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  // Create a new ChromeDriver instance
        driver.get("https://www.google.com");   // Navigate to Google
        String handle = driver.getWindowHandle();  // Get the handle of the current window
        System.out.println("Main Window Handle: " + handle);  // Print the window handle to the console
    }
}
// Create a new ChromeDriver instance - Start the browser.

// Navigate to Google - Open the Google homepage.

// Get the handle of the current window - Retrieve the unique identifier (handle) for the currently focused window.

// Print the window handle to the console - Print the window handle (ID) to verify which window is being used.
