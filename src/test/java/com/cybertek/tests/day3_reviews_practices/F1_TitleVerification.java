package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F1_TitleVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        /*String expectedTitle= "Facebook - Log In or Sign Up";
        String actualTitle= driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Verification is successful");
        } else {
            System.out.println("Verification has failed");
        }*/
        WebElement userName=  driver.findElement(By.id("email"));
        WebElement userPass=  driver.findElement(By.id("pass"));

       userName.sendKeys("somefhgh@fjsjd.com");
       userPass.sendKeys("somefhghfjsjdcom"+ Keys.ENTER);

       Thread.sleep(5000);
       String expectedTitle= "Log into Facebook";
       String actualTitle= driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Verification is successful");
        } else {
            System.out.println("Verification has failed");
        }









    }
}
