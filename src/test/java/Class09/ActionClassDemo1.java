package Class09;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;

import javax.swing.*;

//Actions class
public class ActionClassDemo1 extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://amazon.com/";
        String browser = "chrome";
        navigateToURL(url, browser);
        //find webelement
        WebElement signIN = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
        //action class
        Actions actions = new Actions(driver);
        //perform action
        actions.moveToElement(signIN);
    }
}
