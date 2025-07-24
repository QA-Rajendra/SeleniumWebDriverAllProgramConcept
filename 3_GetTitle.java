import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  // Create a new ChromeDriver instance
        driver.get("https://www.google.com");   // Navigate to the Google website
        System.out.println("Title: " + driver.getTitle());  // Print the title of the page to the console
    }
}
// Create a new ChromeDriver instance - Initialize the browser driver.

// Navigate to the Google website - Open Google homepage.

// Print the title of the page to the console - Retrieve the page title (the title shown in the browser's title bar or tab) and print it.
