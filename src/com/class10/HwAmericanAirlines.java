package com.class10;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;
import com.utils.Constants;

public class HwAmericanAirlines extends CommonMethods {
//	Open chrome browser
//	Go to “https://www.aa.com/homePage.do”
//	Enter From and To
//	Select departure as May 14 of 2020
//	Select arrival as November 8 of 2020
//	Verify “Choose flights” text is displayed
//	Take s screenshot of the results
//	Close browser

	
	public static void main(String[] args) throws InterruptedException {
		setUp("chrome", Constants.AmericanAirlines_URL);
		WebElement from=driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
		from.clear();
		from.sendKeys("New York");
		driver.findElement(By.id("reservationFlightSearchForm.destinationAirport")).sendKeys("Istanbul");
		List<WebElement> cals=driver.findElements(By.xpath("//button[@class='ui-datepicker-trigger']"));
		String[] monthAndYears= {"May 2020", "November 2020"};
		String[] days= {"14", "8"};
		for(int i=0; i<2; i++) {
			cals.get(i).click();
			boolean flag=false;
			while(!flag) {
				List<WebElement> calTitles=driver.findElements(By.xpath("//div[@class='ui-datepicker-title']"));
				for(int y=0; i<2; y++) {					
					if(calTitles.get(y).getText().equals(monthAndYears[i])) {
						flag=true;
						List<WebElement> days1=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td"));
							for(WebElement day:days1) {
								String dayValue=day.getText();
								if(dayValue.equals(days[i])) {
									day.click();
									break;
								}								
							}
						break;
					}
				}
				driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
			}
		}
		Thread.sleep(3000);
		driver.close();
	}
}
