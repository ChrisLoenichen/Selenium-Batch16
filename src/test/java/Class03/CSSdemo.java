package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSdemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        //click on create new account
       WebElement createNewAccount =  driver.findElement(By.cssSelector("a[data-testid=open-registration-form-button]"));
       createNewAccount.click();

       //the dom doesnt have firstname by default it only shows up after clicking on create new account
        //and it takes time to appear in the dom
       Thread.sleep(2000);

       WebElement firstname = driver.findElement(By.cssSelector("input[name='firstname']"));
       firstname.sendKeys("Chris");

       WebElement closeTab = driver.findElement(By.cssSelector("img[src$=\"Wd.svg\"]"));
       closeTab.click();
    }
}
