package SeleniumReview;

import org.openqa.selenium.By;

import com.utils.CommonMethods;
import com.utils.Constants;

public class Alert extends CommonMethods {
public static void main(String[] args) throws InterruptedException {
	setUp("chrome",Constants.TOOLSQA_URL);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@id='alert']")).click();
	Thread.sleep(3000);
	
	acceptAlert();
	
}

}
