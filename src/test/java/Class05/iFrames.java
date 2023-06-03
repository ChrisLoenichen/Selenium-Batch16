package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

public class iFrames extends CommonMethods {
    public static void main(String[] args) {
        String url="https://chercher.tech/practice/frames";
        String browser = "chrome";
        navigateToURL(url,browser);

        //task1 print Babycat cat on screen
        //and select Babycat from drop down

        //as the webelement is inside an iframe
        //first we need to switch to it
        driver.switchTo().frame(1);
        //find webelement animal
        WebElement animal = driver.findElement(By.xpath("//b[text()='Animals :']"));
        System.out.println(animal.getText());

        //select baby cat tab
        WebElement animaldd = driver.findElement(By.xpath("//select[@id='animals']"));
        Select select = new Select(animaldd);
        select.selectByVisibleText("Baby Cat");

        //switch the focus back to the main page
        driver.switchTo().defaultContent();

        //switch to frame containing textbox
        driver.switchTo().frame("frame1");

        WebElement textbox = driver.findElement(By.xpath("//input"));
        textbox.sendKeys("abrabnasj");

        //click on the checkbox
        WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);

        //find element by id ad click it
        driver.findElement(By.id("a")).click();







    }
}
