package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputForms {

	public static final String URL="http://166.62.36.207/syntaxpractice/basic-first-form-demo.html";
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
WebDriver driver = new ChromeDriver();
		
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login\\\\n");
		
		driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("sohilaryan");
		
	}
}
