package HWclass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parabank {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        driver.manage().window().maximize();

        driver.findElement(By.id("customer.firstName")).sendKeys("Chris");
        driver.findElement(By.id("customer.lastName")).sendKeys("Loenichen");
        driver.findElement(By.id("customer.address.street")).sendKeys("2221 Nacho St");
        driver.findElement(By.id("customer.address.city")).sendKeys("Richmond");
        driver.findElement(By.id("customer.address.state")).sendKeys("VA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("37672");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("2024438898");
        driver.findElement(By.id("customer.ssn")).sendKeys("245878912");
        driver.findElement(By.id("customer.username")).sendKeys("CL1234");
        driver.findElement(By.id("customer.password")).sendKeys("jdjhfsjkd!");
        driver.findElement(By.id("repeatedPassword")).sendKeys("jdjhfsjkd!");

        Thread.sleep(5000);

        driver.quit();
    }
}
