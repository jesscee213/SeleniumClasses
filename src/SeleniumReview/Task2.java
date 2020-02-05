package SeleniumReview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;


public class Task2 extends CommonMethods {
	public static final String SYNTAX = "https://the-internet.herokuapp.com/";
	public static void main(String[] args) {
		
	
       setUp("chrome", SYNTAX);
        driver.findElement(By.linkText("Checkboxes")).click();
        WebElement check2 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        check2.click();
        if (check2.isSelected()) {
            System.out.println("Check box 1 was selected");
       
        } else {
            System.err.println("Checkbox 1 was not selected, please re run");
            driver.quit();
        }
	}
}

