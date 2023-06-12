package Class09;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;

public class RightandDoubleClickActions extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://demo.guru99.com/test/simple_context_menu.html";
        String browser = "chrome";
        navigateToURL(url, browser);
        //find element
        WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
        //action class
        Actions actions = new Actions(driver);
        //perform right click
        //also called context click
        actions.contextClick(rightClick).perform();
        //fin element in edit option
        WebElement edit = driver.findElement(By.xpath("//span[text()= 'Edit']"));
        actions.click(edit).perform();
        //on clicking edit alert apprears
        //switch to alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
        actions.doubleClick(doubleClick).perform();



    }
}
