package com.test.webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AdvancedUserActions {

	WebDriver driver = new FirefoxDriver();
	Actions actions = new Actions(driver);

//	@Test
	public void mouseOver() {

		driver.get("http://www.fe.hku.hk/exp2lit/intro/");
		WebElement menuName = driver.findElement(By
				.xpath("//a[contains(text(),'Themes')]"));

		actions.moveToElement(menuName)
				.moveToElement(
						driver.findElement(By
								.xpath("//*[@id='menu-item-196']/a"))).click();
		actions.build().perform();
		
	}
	
	@Test
	public void scrollingPage(){
		
		driver.get("http://www.fe.hku.hk/exp2lit/intro/");
		
		JavascriptExecutor jsx = (JavascriptExecutor) driver;
		//Vertical scroll - down by 100 pixels
		jsx.executeScript("window.scrollBy(0,100)", "");
		//Vertical scroll - up by 55 pixels (note the number is minus 55)
		jsx.executeScript("window.scrollBy(0,-55)", "");
		//Horizontal scroll - right by 20 pixels
		jsx.executeScript("window.scrollBy(20,0)", "");
		//Horizontal scroll - left by 95 pixels (note the number is minus 95)
		jsx.executeScript("window.scrollBy(-95,0)", "");
		
	}

}
