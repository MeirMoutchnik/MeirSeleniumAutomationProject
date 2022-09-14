package Automation;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MM1 {

	@Test
	public void test (WebDriver chr1Driver) {
		
//			Creating Web Driver for page 1 - "chr1 etc"
			
			WebElement mm1WebElement = null;
//			Creating Web Element for MM1 page - "mm1 etc"			
			
			System.out.println("MM1 - test Start");
//			Testing Title Page
			
			Assert.assertEquals("MM1", chr1Driver.getTitle());
//			Testing the Title
			
										
			mm1WebElement = chr1Driver.findElement(By.xpath("//a[@href='Page 3.html']"));
			mm1WebElement.click();
/*			Finding and opening the link to the page "MM3"
			- that opens in a new windows and stays */
			
			mm1WebElement = chr1Driver.findElement(By.tagName("i"));
			System.out.println(mm1WebElement.getText());
			System.out.println();
			System.out.println("The above was just finding and printing the elements by tag 'i':) Why not?");
			System.out.println();
			
		
			
		
			
			
	}

}

	