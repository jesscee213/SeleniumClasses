package com.class07;


	import org.openqa.selenium.By;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
	import com.utils.CommonMethods;
	import com.utils.Constants;
	
	public class HW1 extends CommonMethods {
		
		public static void main(String[] args) throws InterruptedException {
			//open chrome browser, go to HRMS Link
					setUp("Chrome",Constants.HRMS_URL);
			//enter username
					driver.findElement(By.id("txtUsername")).sendKeys("Syntax");
			//enter password
					driver.findElement(By.id("txtPassword")).sendKeys("Syntax123!");
			//click login
					driver.findElement(By.id("btnLogin")).click();
			//click on PIM
					driver.findElement(By.linkText("PIM")).click();
					
					//add wait webdriver 
					WebDriverWait wait=new WebDriverWait(driver, 10);
					//initialize
					wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("PIM"))));
			//click on Add Employee
					driver.findElement(By.linkText("Add Employee")).click();
			//add name and lastName
					driver.findElement(By.id("firstName")).sendKeys("John");
					driver.findElement(By.id("lastName")).sendKeys("Doe");
			//click save
					driver.findElement(By.id("btnSave")).click();
			//click welcome menu to find logout button
					driver.findElement(By.id("welcome")).click();
					Thread.sleep(2000);
					driver.findElement(By.linkText("Logout")).click();
					Thread.sleep(2000);
				driver.close();	
		}
	
}
