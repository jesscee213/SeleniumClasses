package com.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class TC1 extends CommonMethods {
//	Open chrome browser
//	Go to “http://166.62.36.207/syntaxpractice/”
//	Click on “Table” link
//	Click on “Table Data Search” link
//	Verify second table consist of 4 rows and 5 columns
//	Print name of all column headers 
//	Print data of all rows
//	Quit Browser
//\
	public static void main(String[] args) {
		setUp("chrome", Constants.Syntax1_url);
		driver.findElement(By.linkText("Table")).click();
		driver.findElement(By.linkText("Table Data Search")).click();
		List <WebElement> rows=driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
		System.out.println("Number of rows= "+rows.size());
		
		List <WebElement> cols=driver.findElements(By.xpath("//table[@class='table']/thead[2]/tr/th"));
		System.out.println("Number of columns= "+cols.size());
		
		for (WebElement col:cols) {
			System.out.println(col.getText());
		}
		for (WebElement row: rows) {
			System.out.println(row.getText());
		}
		driver.quit();
		
		
		
	}
	
	
	
}
