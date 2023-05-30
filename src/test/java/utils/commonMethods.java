package utils;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class commonMethods {
    //declaring new driver outside the method and making it static so that is accessible anywhere when the method is called
    public static WebDriver driver;
    public static void navigateToURL(String url){
        //create instance
        driver = new ChromeDriver();
        //navigate to url
        driver.get(url);
        //maximize the screen
        driver.manage().window().maximize();
    }
    public static void closeBrowser(){

        driver.close();
    }
}
