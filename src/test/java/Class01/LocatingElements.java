package Class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {
        //initiate the instance
        WebDriver driver = new ChromeDriver();

        //facebook.com
        driver.get("https:facebook.com/");
        //max window
        driver.manage().window().maximize();

        //send some text in the email, first part find element, next sends the text to that element
        driver.findElement(By.id("email")).sendKeys("Stinkymonkeybats12");

        //send text into password
        driver.findElement(By.name("pass")).sendKeys("mustafa");
        // print url
        String url = driver.getCurrentUrl();
        System.out.println(url);

        //print title
        String title = driver.getTitle();

        //slow
        Thread.sleep(2000);

        //confrim that the title is "facebook - log in or sign up"
        if(title.equals("Facebook - log in or sign up")){
            System.out.println("the title is correct");
        }else{
            System.out.println("title is incorrect");
        }

        //close
        driver.quit();
    }
}
