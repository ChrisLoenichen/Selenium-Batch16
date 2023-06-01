package HWclass5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class HW1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser = "chrome";
        navigateToURL(url,browser);

        WebElement alertButtonHW = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alertButtonHW.click();

        Thread.sleep(2000);

        Alert confirmationHW = driver.switchTo().alert();
        confirmationHW.sendKeys("Chris");
        Thread.sleep(2000);

        confirmationHW.accept();
    }
}
