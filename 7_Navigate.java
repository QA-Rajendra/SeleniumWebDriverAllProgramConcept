. navigate().forward()
java
Copy
Edit
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  // Create a new ChromeDriver instance
        driver.get("https://www.google.com");   // Navigate to Google
        driver.navigate().to("https://www.wikipedia.org");  // Navigate to Wikipedia
        driver.navigate().back();  // Go back to Google
        driver.navigate().forward();  // Go forward to Wikipedia again
    }
}
