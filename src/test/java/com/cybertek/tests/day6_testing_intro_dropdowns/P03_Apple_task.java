package com.cybertek.tests.day6_testing_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P03_Apple_task {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.apple.com");
        List<WebElement> headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));

        for (int eachLink = 1; eachLink < headerLinks.size()-1; eachLink++) {
            //System.out.println(headerLinks.get(eachLink).getText());
            headerLinks.get(eachLink).click();
            headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));
            System.out.println("Current title in the page: "+driver.getTitle());

            List <WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
            System.out.println("The total number of links is "+ allLinks.size());

            int count = 0;
            for (WebElement eachh: allLinks
                 ) {

                if (eachh.getText().length() >0){
                    count++;
                }

            }
            System.out.println("Links with the text: "+ count+ " Links without the text:  "+((allLinks.size())-count));

        }
    }
}
