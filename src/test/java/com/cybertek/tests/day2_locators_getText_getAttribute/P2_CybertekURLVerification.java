package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekURLVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");

        driver.manage().window().maximize();

        System.out.println("URL is matching: "+driver.getCurrentUrl().contains("cybertek"));

        System.out.println("Title is matching: "+driver.getTitle().equals("Practice"));


    }
}
