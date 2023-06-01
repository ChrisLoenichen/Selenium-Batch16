package HWclass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

public class HW2 extends CommonMethods {
    public static void main(String[] args) {
        String url="https://chercher.tech/practice/frames";
        String browser = "chrome";
        navigateToURL(url,browser);

        driver.switchTo().frame(0);
        WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.id("a")).click();

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        WebElement animaldd = driver.findElement(By.xpath("//select[@id='animals']"));
        Select select = new Select(animaldd);
        select.selectByVisibleText("Baby Cat");

        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        WebElement textbox = driver.findElement(By.xpath("//input"));
        textbox.sendKeys("this is my text");


    }
}
