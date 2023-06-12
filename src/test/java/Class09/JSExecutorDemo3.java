package Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class JSExecutorDemo3 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard";
        String browser = "chrome";
        navigateToURL(url, browser);

        //find the login button
        WebElement login = driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
        //perform a scroll operation
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", login);







    }
}
