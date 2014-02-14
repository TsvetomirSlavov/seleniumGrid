package com.test.webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class IFrameSample {
	
	WebDriver driver = new FirefoxDriver();
	
//	@Test
	public void iFrame(){
		driver.get("http://www.capella.edu/admissions/individual-courses/");
		driver.findElement(By.xpath("//*[@href='/single-course-registration']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[contains(@src,'iframe')]")));
		
		driver.findElement(By.id("first_name")).sendKeys("Test");
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String nameOfHandle : windowHandles) {
			System.out.println(nameOfHandle);
//			driver.switchTo().window(nameOfHandle);
			
		}
		
	}
	
}
