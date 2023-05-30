package HWclass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");

        WebElement firstname = driver.findElement(By.cssSelector("input[name ='first_name']"));
        firstname.sendKeys("Chris");

        WebElement lastname = driver.findElement(By.cssSelector("input[name ='last_name']"));
        lastname.sendKeys("Loe");

        WebElement email = driver.findElement(By.cssSelector("input[name ='email']"));
        email.sendKeys("loe12@gmail.com");


        WebElement phoneNumber = driver.findElement(By.cssSelector("input[name ='phone']"));
        phoneNumber.sendKeys("2020220332");


        WebElement address = driver.findElement(By.cssSelector("input[name ='address']"));
        address.sendKeys("1111 Address rd");

        WebElement city = driver.findElement(By.cssSelector("input[placeholder ='city']"));
        city.sendKeys("Richmond");


        WebElement state = driver.findElement(By.cssSelector("select[name='state']"));
        state.sendKeys("Virginia");


        WebElement zipcode = driver.findElement(By.cssSelector("input[name='zip']"));
        zipcode.sendKeys("254252");

        WebElement webDomain = driver.findElement(By.cssSelector("input[name='website']"));
        webDomain.sendKeys("www.website.com");

        WebElement hostingYesOrNo = driver.findElement(By.cssSelector("input[type='radio']"));
        hostingYesOrNo.click();//yes

        WebElement projectdescription = driver.findElement(By.cssSelector("textarea[placeholder*='Project']"));
        projectdescription.sendKeys("this is my comment");










    }
}
