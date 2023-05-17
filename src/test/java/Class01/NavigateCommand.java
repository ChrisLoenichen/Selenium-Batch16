package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommand {
    public static void main(String[] args) throws InterruptedException {
        //create instance
        WebDriver driver = new ChromeDriver();

        //go to google.com
        driver.get("https://google.com");

        //fullscreen
        driver.manage().window().fullscreen();

        //pause
        Thread.sleep(2000);

        //navigate to fb
        driver.navigate().to("https://facebook.com/");

        //slow
        Thread.sleep(2000);

        //refresh
        driver.navigate().refresh();

        //slow
        Thread.sleep(1000);

        //go back to previous page
        driver.navigate().back();

        //slow
        Thread.sleep(2000);

        //go forward
        driver.navigate().forward();

        //close the whole browser
        driver.quit();

        //close the current tab
        driver.close();
    }
}
