    package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://ultimateqa.com/complicated-page");
        driver.manage().window().maximize();
        WebElement searchBox = driver.findElement(By .xpath("//*[@title='Search']"));
        searchBox.sendKeys("facebook");
        searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By .xpath("//h3[contains(text(),'Facebook - log in or sign up')]")).click();


    }

}
