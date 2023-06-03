package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

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
}
