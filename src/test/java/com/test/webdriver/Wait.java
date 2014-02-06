package com.test.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	WebDriver driver = new FirefoxDriver();

	/**
	 * An implicit wait is to tell WebDriver to poll the DOM for a certain
	 * amount of time when trying to find an element or elements if they are not
	 * immediately available. The default setting is 0. Once set, the implicit
	 * wait is set for the life of the WebDriver object instance.
	 * 
	 */
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	/**
	 * Explicit wait is intelligent wait to wait for certain condition to occur
	 * It can also poll the DOM at regular intervals within the specified
	 * timeout period
	 * 
	 * An explicit waits is code you define to wait for a certain condition to
	 * occur before proceeding further in the code. The worst case of this is
	 * Thread.sleep(), which sets the condition to an exact time period to wait.
	 * There are some convenience methods provided that help you write code that
	 * will wait only as long as required. WebDriverWait in combination with
	 * ExpectedCondition is one way this can be accomplished.
	 * 
	 */
	public void explicitWait() {
		WebDriverWait explicitWait = new WebDriverWait(driver, 50);
		explicitWait.until(ExpectedConditions.alertIsPresent());
		
		//Polling the DOM

	}

}
