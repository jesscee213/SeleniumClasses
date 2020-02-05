package com.class05;
//TC 1: JavaScript alert text verification
//Open chrome browser
//Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//Click on “Alerts & Modals” links
//Click on “Javascript Alerts” links
//Click on button in “Java Script Alert Box” section
//Verify alert box with text “I am an alert box!” is present
//Click on button in “Java Script Confirm Box” section
//Verify alert box with text “Press a button!” is present
//Click on button in “Java Script Alert Box” section
//Enter text in the alert box
//Quit browser

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class Task1 extends CommonMethods{
	
	public static final String SYNTAX_PRACTICE_URL = "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";

	public static void main(String[] args) throws InterruptedException {
		
		//The method is opening syntax Practice website using chrome browser
		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
		
		Thread.sleep(2000);
		//find the element Alerts and Modals and clicking on it
		driver.findElement(By.xpath("//a[@href='#' and text()='Alerts & Modals']")).click();
		
		//finding Javascript Alerts and clicking on it
		driver.findElement(By.linkText("Javascript Alerts")).click();
		
		//finding the button and click on it
		driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
		Thread.sleep(2000);

		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);

		//get the text from alert box. before you hand the alert
		System.out.println("Alert text:   "+alert.getText());
		
		//accept alert. any positive action. it could be OK, Yes, Accept, proceed.
		alert.accept();
		Thread.sleep(2000);
		
		

		//get the text from the ui or main window
		String text=driver.findElement(By.xpath("//p[text()='Click the button to display an alert box:']")).getText();
		System.out.println(text);
		
	}}