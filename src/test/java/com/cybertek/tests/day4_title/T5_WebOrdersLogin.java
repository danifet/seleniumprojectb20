package com.cybertek.tests.day4_title;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_WebOrdersLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        String expectedTitle= "Web Orders Login";
        String actualTitle= driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Verification is successful");
        } else {
            System.out.println("Verification has failed");
        }

        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));


        userName.sendKeys("Tester");
        password.sendKeys("test");
        Thread.sleep(3000);
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        String expectedTitle1= "Web Orders";
        String actualTitle1= driver.getTitle();

        if (expectedTitle1.equals(actualTitle1)){
            System.out.println("Verification is successful");
        } else {
            System.out.println("Verification has failed");
        }

    }
    }

