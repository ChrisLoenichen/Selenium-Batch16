package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        //instance of the driver
        WebDriver driver = new ChromeDriver();
        //nav to page
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username.sendKeys("Admin");


        WebElement password = driver.findElement(By.xpath("//input[@name = 'txtPassword']"));
        password.sendKeys("Hum@nhrm123");

        //log in button
        WebElement logInButton = driver.findElement(By.xpath("//input[contains(@id, 'Login')]"));
        logInButton.click();

        //click on PIM path
        WebElement PIM = driver.findElement(By.xpath("//a[@id= 'menu_pim_viewPimModule']"));
        PIM.click();

    }
}
