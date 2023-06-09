package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CommonMethods {
    public static WebDriver driver;

    public static void navigateToURL(String URL, String browser){
        // this will initialize the browser
        switch (browser){
            case "chrome":
              driver = new ChromeDriver();
              break;

            case "firefox":
                driver = new FirefoxDriver();
                break;
        }
        //maximize the window
        driver.manage().window().maximize();
        //navigate to url
        driver.get(URL);
        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    public static void closeBrowser(){
        if(driver!=null){//its only going to quit if the driver is open, if it never opens it will not quit
        driver.quit();
        }
    }

    public static void sendText(String text, WebElement element){
        element.clear();
        element.sendKeys(text);
    }

    public static void selectFromDropdownS(WebElement element, String selectString){
        Select selectByS = new Select(element);
        selectByS.selectByVisibleText(selectString);
        selectByS.selectByValue(selectString);
    }

    public static void takeScreenShot(String fileName) {
        TakesScreenshot ts = (TakesScreenshot) driver;

        File screenShot = ts.getScreenshotAs(OutputType.FILE);

        try{
            FileUtils.copyFile(screenShot,new File("C:\\Users\\clee1\\IdeaProjects\\syntaxSdetBatch16Basic"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
