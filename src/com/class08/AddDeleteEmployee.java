package com.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;
import com.utils.Constants;

public class AddDeleteEmployee extends CommonMethods {
	
	/*
	 * HW 1: Add/Delete Employee
	 * Open chrome browser Go to
	 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
	 *  Login into the application
	 *  Add Employee Log out Quit the browser
	 *  Verify Employee has been added
	 *  Go to Employee List
	 *  Delete added Employee
	 *  Quit the browser
	 */
	public static void main(String[] args) throws InterruptedException  {
		
		// The employee info
	
		
		setUp("chrome", Constants.HRMS_URL);
		//login into HRMS
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		//navigate to add employee
		Thread.sleep(1000);
		driver.findElement(By.linkText("PIM")).click();
		Thread.sleep(500);
		driver.findElement(By.linkText("Add Employee")).click();
		WebDriverWait wait=new WebDriverWait(driver, 30);
		//adding employee
		String enterName="Jane";
		String enterLastname="Smith";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
		driver.findElement(By.id("firstName")).sendKeys(enterName);
		
		driver.findElement(By.id("lastName")).sendKeys(enterLastname);
		driver.findElement(By.id("btnSave")).click();
		
		Thread.sleep(500);
		
		// Get the employee info for verification
		String actualName=driver.findElement(By.id("personal_txtEmpFirstName")).getAttribute("value");
		String actualLastName=driver.findElement(By.id("personal_txtEmpLastName")).getAttribute("value");
		String actualId=driver.findElement(By.id("personal_txtEmployeeId")).getAttribute("value");

		// Verify the employee has been successfully added.
		if(actualName.equals(enterName) && actualLastName.equals(enterLastname)) {
			System.out.println("Employee added Successfuly ");
		}else {
			System.out.println("failed");
		}
		
		// Now delete the employee from the employee list
		driver.findElement(By.linkText("Employee List")).click();

		// Get the first table from the employee list
		List<WebElement> rows_f=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		for (int i=1; i<=rows_f.size(); i++) {
			String rowsText=rows_f.get(i-1).getText();
			if (rowsText.contains(actualId)){
				driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[1]")).click();
				driver.findElement(By.id("btnDelete")).click();
				driver.findElement(By.id("dialogDeleteBtn")).click();
				System.out.println("Employeee with id # " + actualId + " has been sucessfully deleted");
				break;
			}
		}}
}


