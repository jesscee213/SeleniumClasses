package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Jessica");
		driver.findElement(By.name("lastName")).sendKeys("Cabrera");
		driver.findElement(By.name("phone")).sendKeys("5713355585");
		driver.findElement(By.name("userName")).sendKeys("jesscee213");
		driver.findElement(By.name("address1")).sendKeys("5601 Magnolia Lane");
		driver.findElement(By.name("city")).sendKeys("Alexandria");
		driver.findElement(By.name("state")).sendKeys("VA");
		driver.findElement(By.name("postalCode")).sendKeys("22311");
		driver.findElement(By.name("country")).sendKeys("United States");
		driver.findElement(By.name("email")).sendKeys("jmcabrera213@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Magnolia1");
		driver.findElement(By.name("confirmPassword")).sendKeys("Magnolia1");
		driver.findElement(By.linkText("register")).click();
	}
}


