package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;


//in dropdowns indexing starts at 0
public class DropDowns extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url = "https://www.facebook.com/";
        String browser = "chrome";
        navigateToURL(url,browser);

        //click on create new account
        WebElement createNewAccount =  driver.findElement(By.cssSelector("a[data-testid=open-registration-form-button]"));
        createNewAccount.click();

        //the dom doesnt have firstname by default it only shows up after clicking on create new account
        //and it takes time to appear in the dom
        Thread.sleep(2000);

        //2.create the object of the select class and pass in the parameters the element drop down
        WebElement days = driver.findElement(By.xpath("//select[@id='day']"));
        Select sel = new Select(days);


        //3. use method provided in select class to select the option you want
        sel.selectByVisibleText("8");

        Thread.sleep(2000); //remember to remove sleeps that are there for observation when youre testing
        //another method
        sel.selectByValue("26");

        Thread.sleep(2000);

        //another method
        sel.selectByIndex(0);
    }
}
