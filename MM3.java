package Automation;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MM3 {

	@Test
	public void test(WebDriver chr3Driver) {
		
		WebElement mm3WebElement = null;
		
		System.out.println("MM3 - test Start");
		
		Assert.assertEquals("MM3", chr3Driver.getTitle());

//		Checking the form by finding its elements and filling them out:
		mm3WebElement = chr3Driver.findElement(By.name("FirstName"));
		mm3WebElement.sendKeys("David");
		mm3WebElement = chr3Driver.findElement(By.name("LastName"));
		mm3WebElement.sendKeys("Newman");
		mm3WebElement = chr3Driver.findElement(By.name("gender"));
		mm3WebElement.click();
		
		Select drdContinent = new Select(chr3Driver.findElement(By.name("continent")));
		drdContinent.selectByIndex(2);
// 	 	Selecting continent from drop-down box - default is Asia where Israel is; selecting now North America
		
		Select drdCountry = new Select(chr3Driver.findElement(By.id("country")));
		drdCountry.selectByValue("US");
// 	 	Selecting country from drop-down box - default is Israel; selecting now the one which is 24th on the list		
		
		mm3WebElement = chr3Driver.findElement(By.id("email"));
		mm3WebElement.sendKeys("davidnewmann@gmail.com");
//		Finding the field for email address and filling it out
		
		mm3WebElement = chr3Driver.findElement(By.tagName("textarea"));
		mm3WebElement.sendKeys("Hi, enjoyed exploring your site, would like to get in touch with you; email me if you're interested!");
//		Testing typing in a message in the text area
		
		List <WebElement> elements = null;		
		elements = chr3Driver.findElements(By.tagName("select"));
		int numOfElements = elements.size();
		System.out.printf("There are" + " " + numOfElements + " " + "elements 'select' %non this page");
		System.out.println();
		System.out.println("The 1st one of them is:");
		System.out.println(elements.get(0).getText());
		
		elements = chr3Driver.findElements(By.tagName("option"));
		numOfElements = elements.size();
		System.out.printf("There are" + " " + numOfElements + " " + "elements 'option' %non this page");
		System.out.println();
		System.out.println("The 240th and 255th ones of them are:");
		System.out.print(elements.get(241).getText() + " " + "and" + " ");
		System.out.println(elements.get(256).getText());
		
		System.out.println("Certainly want to go to the former!"
				+ "\nTo the latter not so much?"
				+ "\nThink again: Victoria falls are there!");	
		
	}

}
