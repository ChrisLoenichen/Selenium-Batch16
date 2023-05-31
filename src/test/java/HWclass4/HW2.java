package HWclass4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

public class HW2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.facebook.com/";
        String browser = "chrome";
        navigateToURL(url,browser);

        WebElement createNewAccount = driver.findElement(By.xpath("//a[@rel='async']"));
        createNewAccount.click();

        Thread.sleep(2000);


        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select selectMonth = new Select(month);
        selectMonth.selectByVisibleText("Jan");

        Thread.sleep(2000);

        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        Select selectDay = new Select(day);
        selectDay.selectByValue("6");

        Thread.sleep(2000);

        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        Select selectYear = new Select(year);
        selectYear.selectByVisibleText("1992");

        Thread.sleep(2000);

        driver.close();








    }
}
