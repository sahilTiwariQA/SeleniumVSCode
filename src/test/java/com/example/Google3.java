package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        driver.manage().window().maximize();
        driver.getWindowHandle();
        final List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
        System.out.println(iframes);
        // driver.findElement(By .xpath("//button[contains(text(),'Stay signed out')]")).click();
    }

}
