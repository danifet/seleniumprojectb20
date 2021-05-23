package GroupAssesment2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class assesment2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://qa3.vytrack.com/user/login");


        WebElement username1 = driver.findElement(By.id("prependedInput"));
        username1.sendKeys("user174");

        WebElement password1 = driver.findElement(By.id("prependedInput2"));
        password1.sendKeys("UserUser123");

        WebElement rememberMe = driver.findElement(By.className("custom-checkbox__icon"));
        rememberMe.click();

        WebElement logIn = driver.findElement(By.id("_submit"));
        logIn.click();

        Thread.sleep(1000);

        String title = driver.getTitle();

        if (title.equals ("Dashboard")){
            System.out.println("Verification is passed");
        } else {
            System.out.println("Verification is failed");
        }
    }
}
