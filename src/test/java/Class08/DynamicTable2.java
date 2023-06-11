package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class DynamicTable2 extends CommonMethods {
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

        //get all ids from the table into the list
        List<WebElement> allIds = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        //iterate thru ids
        for (int i = 0; i < allIds.size(); i++) {
            String id = allIds.get(i).getText();
            if(id.equals("53502A")){
                System.out.println("click on the check box on row number "+(i+1));
                WebElement checkbox = driver.findElement(By.xpath("//table/tbody/tr["+(i+1)+"]/td[1]"));
                checkbox.click();
            }

        }

    }
}
