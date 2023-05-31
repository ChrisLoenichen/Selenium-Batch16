package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
}
