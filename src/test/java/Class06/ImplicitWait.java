package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ImplicitWait extends CommonMethods {
    public static void main(String[] args) {
        String url="https://www.facebook.com/";
        String browser = "chrome";
        navigateToURL(url,browser);

        //declaring the implicit wait in the start and we want it to be implemented on all the elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //updated Syntax

        //click on create account
        WebElement createNewAccount = driver.findElement(By.xpath("//a[text()= 'Create new account']"));
        createNewAccount.click();

        //send the first name***************HW QUESTION
        WebElement firstName = driver.findElement(By.xpath("//input[@name= 'firstname']"));
        sendText("Chris",firstName);



    }
}
