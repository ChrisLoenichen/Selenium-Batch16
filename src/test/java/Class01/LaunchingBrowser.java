package Class01;
/*
task navigate to google.com
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    public static void main(String[] args) throws InterruptedException {

        //declare the instance
        WebDriver driver = new ChromeDriver();

        //use . get (url) to navigate to the desired url
        driver.get("https://www.google.com");

        //maximize window
        driver.manage().window().maximize();

        //get the current url
        String currentURL=driver.getCurrentUrl();

        //print on the console
        System.out.println("the current url of the website is "+currentURL);

        // get the title of the page
        String title = driver.getTitle();

        //print the title in the console
        System.out.println("the title of the page is: "+title);

        //sleep time to see the window when it opens
        Thread.sleep(5000);

        // close the browser
        driver.quit();

    }
}

