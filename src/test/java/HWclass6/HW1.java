package HWclass6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;

public class HW1 extends CommonMethods {
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser = "chrome";
        navigateToURL(url,browser);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement clickStart = driver.findElement(By.xpath("//button[text()= 'Start']"));
        clickStart.click();

        WebElement message = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBePresentInElement(message, "Welcome Syntax Technologies"));
        System.out.println(message.getText());

    }
}
