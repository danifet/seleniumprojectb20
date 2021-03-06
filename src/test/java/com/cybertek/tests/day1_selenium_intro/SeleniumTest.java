package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.tesla.com");

        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().to("https://www.google.com");
        Thread.sleep(2000);
        System.out.println(driver.getTitle());;
        String currentUrl1= "";
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.manage().window().maximize();

        //driver.quit();
    }
}
