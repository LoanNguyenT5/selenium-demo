package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {
    public static final String PROPERTY_CHROME_DRIVER = "webdriver.chrome.driver";

    public static final String PROPERTY_CHROME_CLIENT = "webdriver.chrome.client";
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.setProperty(PROPERTY_CHROME_DRIVER, "/Users/loannguyen/Documents/Member/loan/Driver/chromedriver/chromedriver"); //XXX Configure me!
       // System.setProperty(PROPERTY_CHROME_CLIENT, "C:\\DevTools\\Driver\\chrome72-selenium\\chrome-DLee\\chrome.exe"); //XXX Configure me!

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.quit();
    }
}