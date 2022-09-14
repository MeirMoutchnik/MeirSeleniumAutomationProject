package Automation;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MM1aa {

	@Test
	public void test(WebDriver chr1aaDriver) {
	
//	Creating Web Driver for page 1aa - "chr1a etc"
	
	WebElement mm1aaWebElement = null;
//	Creating Web Element for MM1aa page - "mm1a etc"
	
	System.out.println("MM1aa - test Start");
	
	Assert.assertEquals("MM1aa", chr1aaDriver.getTitle());
	
	
	List <WebElement> elements = null;
	elements = chr1aaDriver.findElements(By.tagName("iframe"));
//	Finding multiple elements - embedded videos
	int numOfElements = elements.size();
//	Creating integer that denotes number of those elements 
	System.out.println("There are" + " " + numOfElements + " " + "videos embedded on this page");
//	Printing that number	
	
	System.out.println();
	

	
	}
}	

