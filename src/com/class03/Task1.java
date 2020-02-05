package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
public static final String URL="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
	driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("sohilaryan");;
	driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("Syntax@12");;
	driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	WebElement logo=driver.findElement(By.xpath("//*[@id=\"branding\"]/a[1]"));
	if(logo.isDisplayed()) {
		System.out.println("Correct Error Message is Displayed");
	}else {
		System.out.println("Incorect error Message is Displayed");
		driver.close();
	}
	}
}

