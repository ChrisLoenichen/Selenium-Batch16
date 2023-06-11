package HWclass8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;
import java.util.List;

public class HW1 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        navigateToURL(url, browser);

        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();
        WebElement recruitButton = driver.findElement(By.xpath("//*[@id=\"menu_recruitment_viewRecruitmentModule\"]"));
        recruitButton.click();
        WebElement calendarButton = driver.findElement(By.xpath("//*[@id=\"frmSrchCandidates\"]/fieldset/ol/li[7]/img"));
        calendarButton.click();


        WebElement monthSel = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
        Select select = new Select(monthSel);
        select.selectByVisibleText("Jan");

        WebElement yearSel = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
        Select select1 = new Select(yearSel);
        select1.selectByValue("2034");

        boolean isfound=false;
        while (!isfound){
            List<WebElement> allDates=driver.findElements(By.xpath("//table/tbody/tr/td"));
            for (WebElement day : allDates) {
                String dayPicker =day.getText();
                if(dayPicker.equals("15")){
                    day.click();
                }
            }
            isfound=true;



        }
            }
        }



