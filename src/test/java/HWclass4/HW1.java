package HWclass4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;
//


public class HW1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser = "chrome";
        navigateToURL(url,browser);

        Thread.sleep(2000);
        WebElement day = driver.findElement(By.xpath("//select[@id='select-demo']"));
        day.click();

        Select select = new Select(day);
        select.selectByVisibleText("Tuesday");

        Thread.sleep(2000);
        select.selectByVisibleText("Thursday");

        Thread.sleep(2000);
        select.selectByVisibleText("Friday");

        Thread.sleep(3000);

        driver.close();





    }
}
