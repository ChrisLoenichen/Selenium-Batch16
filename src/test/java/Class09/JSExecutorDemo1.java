package Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class JSExecutorDemo1 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard";
        String browser = "chrome";
        navigateToURL(url, browser);

        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //js.executeScript("arguments[0].style.backgroundColor='teal'",userName);
        js.executeScript("arguments[0].style.border='5px solid magenta'",userName);


    }
}
