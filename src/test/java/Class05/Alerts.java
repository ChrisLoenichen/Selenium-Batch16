package Class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class Alerts extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser = "chrome";
        navigateToURL(url,browser);

        WebElement alertButton1 = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alertButton1.click();

        Thread.sleep(2000);

        //switch the focus of the driver to the alert using Alert Interface
        Alert confirmation = driver.switchTo().alert();
        confirmation.accept();



        WebElement alertButton2 = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alertButton2.click();

        //to observe
        Thread.sleep(2000);

        //switch to the alert
        Alert confirmation2 = driver.switchTo().alert();
        confirmation2.dismiss();

        WebElement alertButton3 = driver.findElement(By.xpath(""));
        alertButton3.click();




    }
}

