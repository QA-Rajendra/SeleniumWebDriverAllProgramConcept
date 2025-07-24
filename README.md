# 🌐 Selenium WebDriver - All Browser Methods with Examples

🧠 **Interface: WebDriver**  
This guide lists and explains all commonly used WebDriver browser methods with usage examples in Java.

---

### 🔹 1. `get(String url)`  
📘 **Description:** Opens the given URL in the browser  
✅ **Example:**
```java
driver.get("https://www.google.com");
```

---


### 🔹 2. `getCurrentUrl()`  
📘 **Description:** Returns the current URL of the page  
✅ **Example:**
```java
String currentURL = driver.getCurrentUrl();
System.out.println("Current URL is: " + currentURL);
```

---

### 🔹 3. `getTitle()`  
📘 **Description:** Returns the title of the current page  
✅ **Example:**
```java
String title = driver.getTitle();
System.out.println("Page title: " + title);
```

---

### 🔹 4. `getPageSource()`  
📘 **Description:** Returns the source code of the current page  
✅ **Example:**
```java
String source = driver.getPageSource();
System.out.println("Page Source: " + source);
```

---

### 🔹 5. `close()`  
📘 **Description:** Closes the current browser window  
✅ **Example:**
```java
driver.close();
```

---

### 🔹 6. `quit()`  
📘 **Description:** Closes all browser windows and ends the session  
✅ **Example:**
```java
driver.quit();
```

---

### 🔹 7. `navigate().to(String url)`  
📘 **Description:** Navigates to a given URL (like `get()`)  
✅ **Example:**
```java
driver.navigate().to("https://www.wikipedia.org");
```

---

### 🔹 8. `navigate().back()`  
📘 **Description:** Simulates the browser "Back" button  
✅ **Example:**
```java
driver.navigate().back();
```

---

### 🔹 9. `navigate().forward()`  
📘 **Description:** Simulates the browser "Forward" button  
✅ **Example:**
```java
driver.navigate().forward();
```

---

### 🔹 10. `navigate().refresh()`  
📘 **Description:** Refreshes the current page  
✅ **Example:**
```java
driver.navigate().refresh();
```

---

### 🔹 11. `manage().window().maximize()`  
📘 **Description:** Maximizes the browser window  
✅ **Example:**
```java
driver.manage().window().maximize();
```

---

### 🔹 12. `manage().window().minimize()`  
📘 **Description:** Minimizes the browser window  
✅ **Example:**
```java
driver.manage().window().minimize();
```

---

### 🔹 13. `manage().window().fullscreen()`  
📘 **Description:** Puts the browser in fullscreen mode (like pressing F11)  
✅ **Example:**
```java
driver.manage().window().fullscreen();
```

---

### 🔹 14. `manage().timeouts().implicitlyWait(Duration)`  
📘 **Description:** Sets the default implicit wait timeout  
✅ **Example:**
```java
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
```

---

### 🔹 15. `switchTo().alert()`  
📘 **Description:** Switches to a JavaScript alert  
✅ **Example:**
```java
Alert alert = driver.switchTo().alert();
alert.accept();  // or alert.dismiss();
```

---

### 🔹 16. `switchTo().frame()`  
📘 **Description:** Switch to a frame by index, name, or WebElement  
✅ **Examples:**
```java
driver.switchTo().frame(0); // by index
driver.switchTo().frame("frameName"); // by name
WebElement frame = driver.findElement(By.id("frameId"));
driver.switchTo().frame(frame); // by WebElement
```

---

### 🔹 17. `switchTo().defaultContent()`  
📘 **Description:** Switch back to the main content  
✅ **Example:**
```java
driver.switchTo().defaultContent();
```

---

### 🔹 18. `switchTo().window(windowHandle)`  
📘 **Description:** Switch to another browser window using handle  
✅ **Example:**
```java
Set<String> windows = driver.getWindowHandles();
for (String win : windows) {
    driver.switchTo().window(win);
}
```

---

### 🔹 19. `getWindowHandle()`  
📘 **Description:** Gets the handle of the current window  
✅ **Example:**
```java
String mainWindow = driver.getWindowHandle();
```

---

### 🔹 20. `getWindowHandles()`  
📘 **Description:** Gets handles of all open browser windows  
✅ **Example:**
```java
Set<String> allWindows = driver.getWindowHandles();
```

---

### 🔹 21. `manage().deleteAllCookies()`  
📘 **Description:** Deletes all cookies from the browser  
✅ **Example:**
```java
driver.manage().deleteAllCookies();
```

---

### 🔹 22. `manage().getCookies()`  
📘 **Description:** Retrieves all cookies from the browser  
✅ **Example:**
```java
Set<Cookie> cookies = driver.manage().getCookies();
for (Cookie cookie : cookies) {
    System.out.println(cookie.getName() + " : " + cookie.getValue());
}
```

---

✅ This list covers the most used **WebDriver Browser methods** in real-time Selenium automation projects.
