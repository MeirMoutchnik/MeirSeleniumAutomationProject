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
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	@Test
	public void test(WebDriver chromeDriver) {
//  	Creating function	
		System.out.println("HomePage - test Start");
//  	Testing Title Page
		
		String expTitle = "Automation Project";
//  	Creating a string - expected title
		String actTitle = chromeDriver.getTitle();
//  	Creating a string - actual title
		Assert.assertEquals("Error in Title", expTitle, actTitle);
//  	Testing the title, if actual title matches expected title - executing the test.
//  	Alternative way to define expected and actual titles:
//  	Assert.assertEquals("Error in Title", "Automation Project", chromeDriver.getTitle());		
		
		WebElement hpWebElement = null;
		hpWebElement = chromeDriver.findElement(By.tagName("h1"));
//  	Finding element by tag called "SJ"
		System.out.println("The 1st element with tag 'h1' on this page is:");
		System.out.println(hpWebElement.getText());
		System.out.println();
/*		Printing out the text of the h1 that the program found - the 1st one of those, 
		with break afterwards */
		Assert.assertEquals("Error in H1 element", "Student Details", hpWebElement.getText());
//  	Testing heading 1, if the actual one matches the expected one - executing the test.	
		
		hpWebElement = chromeDriver.findElement(By.id("SJ"));
//  	Finding element by the "id" called "SJ"
		System.out.println("The element with id 'SJ' on this page is:");
		System.out.println(hpWebElement.getText());
//  	Printing out that element	
		
		hpWebElement = chromeDriver.findElement(By.name("fname"));
//		Finding element - first name  - by name "fname" 
		hpWebElement.sendKeys("Meir");
//		Testing it by making the program type in a first name
		hpWebElement = chromeDriver.findElement(By.name("lname"));
		hpWebElement.sendKeys("Moutchnik");
		hpWebElement = chromeDriver.findElement(By.id("email"));
//  	Finding element by the "id" called "email"
		hpWebElement.sendKeys("moutchnikm@gmail.com");
//  	Testing it by making the program type in an email address specified here.
				
		hpWebElement = chromeDriver.findElement(By.name("gender"));
		hpWebElement.click();
/*		Finding elements by name "gender" and clicking on them 
		(only one stays as it's "radio"
		hpWebElement = chromeDriver.findElement(By.name("math"));
		hpWebElement.click(); */
		hpWebElement = chromeDriver.findElement(By.name("pyhs"));
		hpWebElement.click();
//  	Finding other elements by name and clicking on them
		hpWebElement = chromeDriver.findElement(By.name("bio"));
		hpWebElement.click();
		hpWebElement = chromeDriver.findElement(By.name("chem"));
		hpWebElement.click();
		hpWebElement = chromeDriver.findElement(By.name("eng"));
		hpWebElement.click();
					
		Select ddPhone = new Select(chromeDriver.findElement(By.name("areaCode")));
//		Creating a select class ddPhone for selecting an option from drop-down box
		ddPhone.selectByValue("53");
/*		ddPhone.selectByIndex(3);
 	 	Alternative way to select from drop-down box
 			*/
		
		hpWebElement = chromeDriver.findElement(By.name("phone"));
		hpWebElement.sendKeys("987-65-432");
//		Typing the rest of the phone number.
		
		Select drpCity = new Select(chromeDriver.findElement(By.name("City")));
		drpCity.selectByValue("JER");
/*		Creating a select class drpCity for selecting a city from a from drop-down box 
		and choosing it by value - Jerusalem */
		
		hpWebElement = chromeDriver.findElement(By.id("CB"));
		hpWebElement.click();
//		Clearing the boxes checked and filled before
		System.out.println();
//		Making a break
		
		List <WebElement> elements = null;
		elements = chromeDriver.findElements(By.tagName("h1"));
//		Finding multiple elements by name "h1"
		int numOfElements = elements.size();
//		Creating integer that denotes number of elements that were found
		System.out.println("There are" + " " + numOfElements + " " + "elements - headings 'h1' on this page");
//		Printing that number
		System.out.printf("The 3rd one%nof those headings 1 is:");
		System.out.println();
		System.out.println(elements.get(2).getText());
		System.out.println();	
//		Printing out the text of the 2nd (that is, 3rd, counting from 0) element h1 - with break inside the string and afterwards,
		System.out.println("The full list of those headings is:");
		for(int i=0; i<elements.size(); i++) {
			System.out.println(elements.get(i).getText());
		}
//		A loop to get and print out all the texts of h1, starting from the 1st (that is, 0).
		System.out.printf("%n");
//		Another way to start a new line
		elements = chromeDriver.findElements(By.name("gender"));
//		Finding multiple elements by name "gender"
		numOfElements = elements.size();
		System.out.println("There are also" + " " + numOfElements + " " + "elements called 'gender' on this page");
//		Printing number of elements that were found now - "named "gender"	
		
		System.out.println("For checking the tables - see below 'Tables play' on my site");
		System.out.println();
//		Making a break before testing the next page - for the console text to be neat
		
	
		
		
		
	}

}
