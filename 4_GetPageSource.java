import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  // Create a new ChromeDriver instance
        driver.get("https://www.google.com");   // Navigate to the Google website
        String source = driver.getPageSource();  // Get the entire HTML content of the page
        System.out.println("Page Source Length: " + source.length());  // Print the length of the page source to the console
    }
}
// Create a new ChromeDriver instance - Start the ChromeDriver.

// Navigate to the Google website - Go to the Google homepage.

// Get the entire HTML content of the page - Retrieve the page source (HTML) of the website.

// Print the length of the page source to the console - Print the length of the HTML source to see the size of the page.
