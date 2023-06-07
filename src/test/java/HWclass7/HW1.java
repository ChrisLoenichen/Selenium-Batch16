package HWclass7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;
/*@here HW:
goto site
click on PIM

from the table choose any ID
and print out the row number of that id

please make sure that ur code is dynamic enough
to cater if another row gets delted ,
it still prints the row correctly*/

public class HW1 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        navigateToURL(url, browser);

        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();
        WebElement pimButton = driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b"));
        pimButton.click();
        //my number is 53710A

        List<WebElement> myIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        for (int i = 0; i < myIDs.size(); i++) {
            String id = myIDs.get(i).getText();
            if (id.equals("53710A")) {
                System.out.println("the id number is on row: " + (i + 1));

            }
        }
    }
}

