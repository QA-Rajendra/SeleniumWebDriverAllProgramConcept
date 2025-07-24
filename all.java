18. switchTo().window(windowHandle)
java
Copy
Edit

19. getWindowHandle()
java
Copy
Edit
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

20. getWindowHandles()
java
Copy
Edit
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

21. manage().deleteAllCookies()
java
Copy
Edit
import org.openqa.selenium.Web
