package Automation;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MM2c {

	@Test
	public void test(WebDriver chr2cDriver) {
		
		WebElement mm2cWebElement = null;
		
		System.out.println("MM2c - test Start");
		
		Assert.assertEquals("MM2c", chr2cDriver.getTitle());
		
		mm2cWebElement = chr2cDriver.findElement(By.xpath("//a[@href='Page 2ca.html']"));
		mm2cWebElement.click();
//		Finding and opening a link to the next page MM2af  - by x-path		
		System.out.printf("Some thought the New York pictures on page 2ca "
				+ "%nthat I found by x-path and opened are photoshop!"
				+ "%nNo, they are real, I've been there!:)");
		System.out.println();
//		Using %n to to have a text on multiple lines.
		System.out.println();

	
		mm2cWebElement = chr2cDriver.findElement(By.xpath("//a[@href='Page 2cf.html']"));
		mm2cWebElement.click();
//		Finding and opening a link to the next page MM2cf  - by x-path
		System.out.println("Those on Page 2cf, though, are only downloaded indeed,"
				+ "\nhaven't been to Qathar yet."
				+ "\nBut then I don't photoshop myself there - "
				+ "\nprefer reality in this case!");
//		Using yet another way to have a text on multiple lines - \n.
				
		System.out.println();
	}

}
