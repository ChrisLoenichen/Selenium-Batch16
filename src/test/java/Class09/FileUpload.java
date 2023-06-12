package Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class FileUpload extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://the-internet.herokuapp.com/upload";
        String browser = "chrome";
        navigateToURL(url, browser);

        //find the element you can click to upload the file
        WebElement fileUpload = driver.findElement(By.xpath("//input[@id='file-upload']"));
        //in order to send or upload the file you can send the path of it with sendkeys
        fileUpload.sendKeys("C:\\Users\\clee1\\OneDrive\\Pictures\\Screenshots\\Screenshot 2023-05-28 141035.png");


    }
}
