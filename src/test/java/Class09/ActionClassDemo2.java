package Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;

//Actions class
public class ActionClassDemo2 extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://jqueryui.com/droppable/";
        String browser = "chrome";
        navigateToURL(url, browser);
        //we need to switch focus
        driver.switchTo().frame(0);

//        find the draggable WebElement
        WebElement dragable = driver.findElement(By.id("draggable"));
//        find the element where u want to drop
        WebElement dropable = driver.findElement(By.id("droppable"));


//        Action Class
        Actions action= new Actions(driver);
        action.dragAndDrop(dragable,dropable).perform();
    }
}
