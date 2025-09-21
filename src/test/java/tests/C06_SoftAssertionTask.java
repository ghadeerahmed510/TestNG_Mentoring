package tests;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C06_SoftAssertionTask extends TestBase {
    /*
    Task 4: Hard Assertions Practice
Objective: Implement hard assertions for login functionality
Test Case: Positive Login Test
1. Navigate to https://claruswaysda.github.io/signIn.html
2. Enter username: "admin"
3. Enter password: "123"
4. Click Submit button
5. Use hard assertions to verify:
New page URL is "https://claruswaysda.github.io/signIn.html"
Page contains text "Employee Table"
     */
    @Test
    void login(){
        driver.get("https://claruswaysda.github.io/signIn.html");
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.xpath("//*[@type='submit']"));

        username.sendKeys("admin");
        password.sendKeys("123");
        submitButton.click();

        String url =driver.getCurrentUrl();
        Assertions.assertEquals("https://claruswaysda.github.io/signIn.html",url);
        Assertions.assertTrue(driver.getPageSource().contains("Employee Table"),"Employee Table");
    }
}
