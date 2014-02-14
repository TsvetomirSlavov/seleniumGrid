package com.test.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verifications {

	WebDriver driver = new FirefoxDriver();

	/**
	 * Method to verify if an image is loaded in a webpage
	 */
	public void isImageLoaded() {

		// This will make sure the element is present
		WebElement image = driver.findElement(By
				.xpath("//img[@src='../App_Themes/Default/images/phone.gif']"));

		// Then run JS to make sure the image is actually loaded
		Boolean imageLoaded = (Boolean) ((JavascriptExecutor) driver)
				.executeScript(
						"return arguments[0].complete && type of arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
						image);

		Assert.assertTrue(imageLoaded, "Image is loaded");

		// All type of Images
		List<WebElement> imgElements = driver
				.findElements(By
						.xpath("//*[contains(@src, '.gif')] | //*[contains(@src, '.png')]"));

		// Iterate through the list to find all images
		for (WebElement element : imgElements) {
			imageLoaded = (Boolean) ((JavascriptExecutor) driver)
					.executeScript(
							"return arguments[0].complete && type of arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
							element);

			if (!imageLoaded) {
				System.out.println("Found broken image: "
						+ element.getAttribute("src"));
			}
		}

	}

	/**
	 * Pick a date from a calendar callout
	 */

	@Test
	public void pickCalendar() {

		driver.get("http://www.kayak.co.in");

		driver.findElement(By.id("wherebox")).sendKeys("N");
		WebDriverWait explicitWait = new WebDriverWait(driver, 30);
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By
				.id("smartbox")));
//		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

		
		List<WebElement> autocomplete = driver.findElements(By
				.xpath("//*[@id='smartbox']/ul/child::*"));

		for (WebElement suggesstion : autocomplete) {
			System.out.println(suggesstion.getText());
		}

		driver.findElement(By.id("wherebox")).sendKeys("ew Delhi, India");

		driver.findElement(
				By.xpath("//*[@id='travel_dates-start-placeholder']")).click();
		List<WebElement> startdate = driver
				.findElements(By
						.xpath("//*[@id='datepicker']/div[2]/span[2]/span[2]/span[*]/child::*[*]"));

		for (WebElement date : startdate) {

			if (date.getAttribute("class").contains("-enabled")) {

				date.click();
				break;

			}
		}

		driver.findElement(By.xpath("//*[@id='travel_dates-end-placeholder']"))
				.click();
		List<WebElement> endDate = driver
				.findElements(By
						.xpath("//*[@id='datepicker']/div[3]/span[2]/span[2]/span[*]/child::*[*]"));

		for (WebElement date : endDate) {

			if (date.getAttribute("class").contains("-enabled")) {

				date.click();
				break;

			}
		}

		driver.findElement(By.id("fdimgbutton")).click();

	}

}
