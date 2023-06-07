package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class DynamicTables extends CommonMethods {
    public static void main(String[] args) {
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        navigateToURL(url,browser);
// log into the website
        WebElement userName= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();

        WebElement pimButton = driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b"));
        pimButton.click();

// print the row that has the id 562478

        List<WebElement> allIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        //look for 56247A
        for (int i = 0; i < allIDs.size(); i++) {
            String id = allIDs.get(i).getText();
            if(id.equals("56258A")){
                System.out.println("the id number is on row: "+(i+1));
                WebElement row = driver.findElement(By.xpath("//table/tbody/tr["+i+1+"]"));
                System.out.println(row.getText());
            }
        }

    }
}
