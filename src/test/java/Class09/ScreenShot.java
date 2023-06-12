package Class09;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import utils.CommonMethods;

import java.io.File;
import java.io.IOException;

public class ScreenShot extends CommonMethods {
    public static void main(String[] args) throws IOException {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        navigateToURL(url, browser);

        WebElement login = driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", login);
        screenShot("");

        //take screen shot

        //declare the instance
        TakesScreenshot ts = (TakesScreenshot) driver;
        //take screen shot as output type FILE
        File screenShot = ts.getScreenshotAs(OutputType.FILE);

        //save it
        FileUtils.copyFile(screenShot, new File("C:\\Users\\clee1\\IdeaProjects\\syntaxSdetBatch16Basic\\screenshot\\Syntaxtest1.png"));

    }
}
//HW create a method in common methods for screen shot it should take file as parameter
