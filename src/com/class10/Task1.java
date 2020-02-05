package com.class10;

import org.openqa.selenium.By;

import com.utils.CommonMethods;
import com.utils.Constants;

public class Task1 extends CommonMethods {

//	Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
//		Login to the application by writing xpath based on “parent and child relation”
	
	public static void main(String[] args) {
		setUp("chrome", Constants.HRMS_URL);
        driver.findElement(By.xpath("//*[@id='divUsername']/input")).sendKeys("Admin"); //child xpath
        driver.findElement(By.xpath("//*[@id='divLoginHelpLink']/../div[3]/input")).sendKeys("Hum@nhrm123"); //parent xpath
        driver.findElement(By.xpath("//div[@id='divPassword']/following-sibling::div[2]/input")).click();  //sibling xpath

	driver.quit();
	
	
	
}}
