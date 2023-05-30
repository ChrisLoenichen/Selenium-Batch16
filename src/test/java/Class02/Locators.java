package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        driver.manage().window().maximize();

        //putting the element we want to refer to in a variable
        WebElement userNameTextBox = driver.findElement(By.name("txtUsername"));
        userNameTextBox.sendKeys("Admin");

        Thread.sleep(2000);

        //delete inserted text
        userNameTextBox.clear();

        //sending the username again
        userNameTextBox.sendKeys("Admin");

        WebElement pass = driver.findElement(By.id("txtPassword"));
        pass.sendKeys("Hum@nhrm123");

        WebElement loginBtn = driver.findElement(By.className("button"));
        loginBtn.click();

        //get the welcome message
        WebElement message = driver.findElement(By.linkText("Welcome Admin"));
        String text =  message.getText();
        System.out.println(text);

        //clicking on a button on the website
        driver.findElement(By.partialLinkText("Recru")).click();




    }
}
