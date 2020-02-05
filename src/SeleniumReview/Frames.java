package SeleniumReview;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class Frames extends CommonMethods{

public static void main(String[] args) {
	setUp("chrome","https://the-internet.herokuapp.com/");
	driver.findElement(By.linkText("Frames")).click();
	driver.findElement(By.linkText("iFrame")).click();
	
	
}
}