//switchTo().alert()

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  // Create a new ChromeDriver instance
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");  // Navigate to the alert demo page
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();  // Click the button that triggers the JS alert
        Alert alert = driver.switchTo().alert();  // Switch to the alert
        alert.accept();  // Accept the alert (click the "OK" button)
    }
}
// Create a new ChromeDriver instance - Start the browser.

// Navigate to the alert demo page - Open the page that has JavaScript alerts.

// Click the button that triggers the JS alert - Locate the button and click it to trigger the alert.

// Switch to the alert - Switch to the active alert popup.

// Accept the alert (click the "OK" button) - Accept the alert, which is the equivalent of clicking the "OK" button.






