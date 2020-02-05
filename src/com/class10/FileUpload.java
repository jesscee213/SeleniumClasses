package com.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class FileUpload extends CommonMethods {
	
	public static void main(String[] args) {
		setUp("chrome", "https://the-internet.herokuapp.com/upload");
	//to upload file we can use sendKeys methods and prvide full ath to the file
		//full path-- path +file name
		
		
		driver.findElement(By.id("file-upload")).sendKeys("/User/Syntax/Desktop/Hello.xlsx");
		driver.findElement(By.id("file-submit")).click();
		WebElement uploaded=driver.findElement(By.xpath("div[@id='uploaded-files']/preceding-siblings;;h3"));
			if (uploaded.isDisplayed()) {
				System.out.println("File uploaded successfully");
			}else  {
				System.out.println("file is not uploaded");
			}
			driver.quit();
	}

}
