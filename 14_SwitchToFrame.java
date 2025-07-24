16. switchTo().frame()
java
Copy
Edit
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  // Create a new ChromeDriver instance
        driver.get("https://demoqa.com/frames");  // Navigate to the demo page with frames

        // by index
        driver.switchTo().frame(0);  // Switch to the first frame on the page

        // or by name/id
        // driver.switchTo().frame("frame1");  // Switch to a frame by name or id

        // or by WebElement
        // WebElement frame = driver.findElement(By.id("frame1"));
        // driver.switchTo().frame(frame);  // Switch to a frame using WebElement
    }
}
// Create a new ChromeDriver instance - Start the browser.

// Navigate to the demo page with frames - Open the page that contains iframes.

// Switch to the first frame on the page - Switch the WebDriver’s focus to the first iframe using its index (0-based).

// Switch to a frame by name or id - You can also switch to a frame by its name or id attribute.

// Switch to a frame using WebElement - Alternatively, you can locate the frame by its WebElement and then switch to it.

17. switchTo().defaultContent()
java
Copy
Edit
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToDefaultContent {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  // Create a new ChromeDriver instance
        driver.get("https://demoqa.com/frames");  // Navigate to the demo page with frames
        driver.switchTo().frame(0);  // Switch to the first frame on the page
        driver.switchTo().defaultContent();  // Switch back to the main (default) content
    }
}
// Create a new ChromeDriver instance - Start the browser.

// Navigate to the demo page with frames - Open a page with multiple frames.

// Switch to the first frame on the page - Switch to the first iframe on the page.

// Switch back to the main (default) content - Switch the focus back to the main page after working inside an iframe.

18. switchTo().window(windowHandle)
java
Copy
Edit
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
