package com.class05;


//	TC 1: Syntax Frame verification
//	Open chrome browser
//	Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//	Click on “Others” link
//	Click on “Iframe” link
//	Click on the “Home” link inside the 1 frame
//	Verify “Syntax logo” is displayed in another frame
//	Quit browser
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;

	import com.utils.CommonMethods;

	public class Task2 extends CommonMethods {
		public static final String SYNTAX_PRACTICE_URL = "http://166.62.36.207/syntaxpractice/index.html";
		public static void main(String[] args) throws InterruptedException {
			//The method is opening syntax Practice website using chrome browser
			CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
			driver.findElement(By.linkText("Others")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Iframe")).click();
			Thread.sleep(2000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			driver.findElement(By.linkText("Home")).click();
			Thread.sleep(2000);
			String frame1=driver.findElement(By.xpath(" //img[@data-animation='animated zoomInLeft']")).getText();
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			driver.switchTo().frame(1);
			Thread.sleep(2000);
			//String frame2Text=driver.findElement(By.xpath(" //img[@alt='Syntax Technologies']")).getText();
			boolean textDis=driver.findElement(By.xpath("//img[@alt='Syntax Technologies']")).isDisplayed();
			System.out.println("Syntax Logo Displayed "+textDis);
			Thread.sleep(2000);
			driver.close();
	}
	}

