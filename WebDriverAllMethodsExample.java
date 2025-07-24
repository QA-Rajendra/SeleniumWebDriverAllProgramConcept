public class WebDriverAll MethodsExample{
public static void main (String[] args)
 Webdriver driver=new ChromeDriver();
 // 1. Open URL
        driver.get("https://example.com");


  // 2. Get page info
        System.out.println("Title: " + driver.getTitle());
        System.out.println("URL: " + driver.getCurrentUrl());
        // 4. Get page source
        System.out.println("Page Source Length: " + driver.getPageSource().length());


  // 3. Navigation
        driver.navigate().to("https://www.google.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

   // 4. Window management
        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.manage().window().fullscreen();

   // Implicit  Wait
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

   // Handle Cookies 
   driver.manage().deleteAllCookies();

   //Get And PrintCookies
      Set<Cookie> Cookies=driver.manage().getCookeies();
    for(Cookie c: Cookies){
        System.out.println(c.getname)
    }

     // 18. Switch to frame (skipped unless frame available)
        // driver.switchTo().frame(0);
        // driver.switchTo().frame("frameName");
        // WebElement frame = driver.findElement(By.id("frameId"));
        // driver.switchTo().frame(frame);

        // 19 Switch back to main content
        //driver.switchTo().defaultContent();


     // 8. Switch to alert (if present)
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (NoAlertPresentException e) {
            System.out.println("No Alert");
        }

       
        // 9. Get all window handles
        Set<String> handles = driver.getWindowHandles();
        System.out.println("All Window Handles: " + handles);

        // 15. Switch to window
        for (String handle : handles) {
            driver.switchTo().window(handle);
        }

        
        // 10. Close and Quit
        driver.close(); // closes current window
        driver.quit();  // closes all windows

}
