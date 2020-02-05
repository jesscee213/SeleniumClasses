package SeleniumReview;

import org.openqa.selenium.By;

import com.utils.CommonMethods;
import com.utils.Constants;
public class Task1 extends CommonMethods {

	public static final String SYNTAX = "https://the-internet.herokuapp.com/";
 	public static void main(String[] args) throws InterruptedException {
 		//The method is opening syntax Practice website using chrome browser
 		CommonMethods.setUp("chrome", SYNTAX);
 		
 		driver.findElement(By.partialLinkText("Float")).click();
 		driver.navigate().back();
 	
 		driver.findElement(By.partialLinkText("Hovers")).click();
 		
 		driver.close();
 	}
}

