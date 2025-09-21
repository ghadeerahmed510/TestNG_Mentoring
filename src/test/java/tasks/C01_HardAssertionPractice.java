package tasks;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_HardAssertionPractice extends TestBase {

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
    void login() {
        //1. Navigate to https://claruswaysda.github.io/signIn.html
        driver.get("https://claruswaysda.github.io/signIn.html");
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.xpath("//*[@type='submit']"));

        //2. Enter username: "admin"
        username.sendKeys("admin");

        //3. Enter password: "123"
        password.sendKeys("123");

        //4. Click Submit button
        submitButton.click();

        /*
        5. Use hard assertions to verify:
        New page URL is "https://claruswaysda.github.io/signIn.html"
        Page contains text "Employee Table"
         */
        String url = driver.getCurrentUrl();
        Assertions.assertEquals("https://claruswaysda.github.io/signIn.html", url);
        Assertions.assertTrue(driver.getPageSource().contains("Employee Table"), "Employee Table");
    }
}
