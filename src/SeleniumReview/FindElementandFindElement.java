package SeleniumReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class FindElementandFindElement  extends CommonMethods {
	
	
	public static void main(String[] args) {
		setUp("chrome", Constants.SeleniumReview);
		//driver.findElement(By.linkText("CheckBoxes")).click();
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		int numberOfAllLink=allLinks.size();
		for (WebElement link: allLinks) {
			System.out.println(link.getText()+ "= "+link.getAttribute("href"));
		}
		driver.quit();
	}

}
