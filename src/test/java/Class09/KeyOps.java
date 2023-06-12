package Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class KeyOps extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
        String browser = "chrome";
        navigateToURL(url, browser);

        //locate the text Box userName
        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester", Keys.TAB);
        // locate password textbox
        WebElement passowrdBox= driver.findElement(By.id("ctl00_MainContent_password"));
        passowrdBox.sendKeys("test",Keys.ENTER);

    }
}
