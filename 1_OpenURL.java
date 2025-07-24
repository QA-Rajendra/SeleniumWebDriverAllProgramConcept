import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class 1_OpenURL {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  // Create a new instance of the ChromeDriver
        driver.get("https://www.google.com");   // Open the URL "https://www.google.com"
    }
}
/* // Create a new instance of the ChromeDriver - Initializes a new Chrome browser window using the ChromeDriver class.

// Open the URL "https://www.google.com" - Navigates the browser to the specified URL (google.com). */