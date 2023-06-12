package Class09;

import Class04.DropDowns;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

public class JSExecutorDemo2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://amazon.com/";
        String browser = "chrome";
        navigateToURL(url, browser);

        //perform a scroll operation
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //scroll down
        js.executeScript("window.scrollBy(0,500)");
        //scroll up and sleep for observation
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-500)");


        WebElement allDrop = driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));
        Thread.sleep(2000);
        js.executeScript("arguments[0].click();", allDrop);







    }
}
