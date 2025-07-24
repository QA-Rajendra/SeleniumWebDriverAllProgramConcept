
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


