package SeleniumReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class Task3 extends CommonMethods {

	public static final String SYNTAX = "https://the-internet.herokuapp.com/";
    public static void main(String[] args) {
        // initializing the browser and URL
    	// initializing the browser and URL
    	CommonMethods.setUp("chrome", SYNTAX);
 		
    			 //creating a list of all links that begin with (<a)
    			List<WebElement> allLinks=driver.findElements(By.tagName("a"));
    			// printing out number of links
    			int numLinks=allLinks.size();
    			System.out.println(numLinks);
    			 // looping through links and associating them with their respective
    	        // href(hyperlink)
    			for(WebElement links :allLinks) {
    				System.out.println(links.getText()+"="+links.getAttribute("href"));
    			}
    			driver.quit();
    		}
    	}
