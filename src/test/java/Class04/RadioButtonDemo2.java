package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class RadioButtonDemo2 extends CommonMethods {
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
        String browser = "chrome";
        navigateToURL(url,browser);

        //get all the radio button associated with age group using
        //driver.findElements
        List<WebElement> ageGroup = driver.findElements(By.xpath("//input[@name='ageGroup']"));
        //you need to select the option specified by user
        String option = "15 - 50";
        for (WebElement age : ageGroup){

            String value = age.getAttribute("value");
            if(value.equals(option)){
                age.click();
                break;
            }
        }
        }
    }

