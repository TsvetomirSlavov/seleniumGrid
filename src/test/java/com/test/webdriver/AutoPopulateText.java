package com.test.webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AutoPopulateText {

	WebDriver driver = new FirefoxDriver();

	@Test
	public void autoComplete() {
		driver.get("http://www.google.co.in");
		driver.findElement(By.tagName("body")).getText();
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> autoPopulatedList = driver.findElements(By
				.xpath("//body/table/tbody/tr/td[2]/table/tbody/tr"));
		for (WebElement ele : autoPopulatedList) {
			System.out.println(ele.getText());
		}
		
		List<WebElement> byCSS = driver.findElements(By.cssSelector("tbody>tr"));
		System.out.println("By CSS ****");
		
		for (WebElement ele : byCSS) {
			System.out.println(ele.getText());
		}
	}

}
