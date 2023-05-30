package HWclass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.cssSelector("input[name=\"txtUsername\"]"));
        userName.sendKeys("Admin");

        WebElement button =driver.findElement(By.cssSelector("input[id='btnLogin']"));
        button.click();

        WebElement notEmpty = driver.findElement(By.cssSelector("span[id='spanMessage']"));
        System.out.println(notEmpty.getText());
    }
}
