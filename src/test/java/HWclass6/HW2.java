package HWclass6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;

public class HW2 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser = "chrome";
        navigateToURL(url, browser);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement getNewUser = driver.findElement(By.xpath("//button[@id= 'save']"));
        getNewUser.click();

        WebElement firstName = driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElement(firstName,"First Name"));
        System.out.println(firstName.getText());

    }
}
