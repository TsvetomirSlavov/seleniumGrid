package com.test.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TableFunctions {

	WebDriver driver = new FirefoxDriver();
	WebDriver driverRemote = new RemoteWebDriver(new DesiredCapabilities());

	/**
	 * To list all values in a table
	 * 
	 * 1. Steps get table instance <br>
	 * 2. using above table instance , get all table rows <br>
	 * 3. iterate each row and get all columns values. <br>
	 */
	@Test
	public void testTable() {
		WebElement table = driver.findElement(By.id("tableId"));

		// Get all rows (tr tags)
		List<WebElement> rows = table.findElements(By.tagName("tr"));

		// Print data from each row (Data from each td tag)
		for (WebElement row : rows) {
			List<WebElement> cols = row.findElements(By.tagName("td"));
			for (WebElement col : cols) {
				System.out.print(col.getText() + "\t");
			}
			System.out.println();
		}
	}

}
