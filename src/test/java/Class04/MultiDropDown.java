package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

public class MultiDropDown extends CommonMethods {
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser = "chrome";
        navigateToURL(url,browser);

        //first step is to select multiple options form multi select dropdown
        //approach
        // inspect and find the element that has the dropdown
        WebElement DD = driver.findElement(By.xpath("//select[@name='States']"));
        //2.create the object of the select class and pass in the parameters the element drop down
        Select sel= new Select(DD);

        //check if the dropdown is multiselect
        boolean isMultiple = sel.isMultiple();
        System.out.println("the drop down is multi select");
        //select by visible text
        sel.selectByVisibleText("California");
        //select by value
        sel.selectByValue("Ohio");
        //select by index
        sel.selectByIndex(7);
        // we have deselect methods available for muti select dropdown
        sel.deselectByVisibleText("California");
        //
    }
}
