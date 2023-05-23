package HWclass2;
/*
@here
HW  (only use XPATH)
navigate to fb.com
click on create new account
fill up all the textboxes
close the popup
close the browser
Note : in order for ur code to work
u have to put Thread.sleep(2000) after clicking on Create new account
 */
// rel xpath syntax: //tagname[@attribute="value"]

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathHW {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        driver.manage().window().maximize();

        WebElement createUser = driver.findElement(By.xpath("//a[text()='Create new account']"));

        Thread.sleep(2000);
        createUser.click();
        Thread.sleep(2000);

        WebElement firstName= driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Chris");

        WebElement lastName = driver.findElement(By.xpath("//input[@name ='lastname']"));
        lastName.sendKeys("Loenichen");

        WebElement mobileOrEmail = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        mobileOrEmail.sendKeys("703-444-7777");

        WebElement newPassword = driver.findElement(By.xpath("//input[@id = 'password_step_input']"));
        newPassword.sendKeys("mypassword10");

        WebElement month = driver.findElement(By.xpath("//option[text()='Jan']"));
        month.click();

        Thread.sleep(2000);

        WebElement day = driver.findElement(By.xpath("//option[text()= '6']"));
        day.click();

        WebElement year = driver.findElement(By.xpath("//option[text()='1992']"));
        year.click();

        WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
        gender.click();

        WebElement signUp = driver.findElement(By.xpath("//button[text()='Sign Up']"));
        signUp.click();

        Thread.sleep(2000);

        driver.close();

        driver.quit();
    }

}