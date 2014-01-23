package com.test.grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class XPath {

	RemoteWebDriver remoteWebDriver = null;

	@BeforeMethod
	public void setUp() throws MalformedURLException {
		URL url = new URL("http://localhost:4444/wd/hub");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName(DesiredCapabilities.firefox().getBrowserName());
		remoteWebDriver = new RemoteWebDriver(url, dc);
	}

	/**
	 * Method to select table elements
	 * 
	 */	
	@Test
	public void selectAllelementsIn_A_Table() {

		remoteWebDriver.get("http://en.wikipedia.org/wiki/2010_in_film");
		List<WebElement> alltableElements = remoteWebDriver
				.findElementsByXPath("//*[@id=\"mw-content-text\"]/table[2]/tbody/tr");
		List<WebElement> allColumnNames = remoteWebDriver
				.findElementsByXPath("//*[@id=\"mw-content-text\"]/table[2]/thead/tr/th[position()<5]");
		List<WebElement> allentries_In_2Column = remoteWebDriver
				.findElementsByXPath("//*[@id='mw-content-text']/table[2]/tbody/tr[*]/td[2]");
		List<WebElement> allentries_In_2Row = remoteWebDriver
				.findElementsByXPath("//*[@id=\"mw-content-text\"]/table[2]/tbody/tr[*]/td[1]/following-sibling::*");
		List<WebElement> listofAllentites_In_LastColumn = remoteWebDriver
				.findElementsByXPath("//*[@id='mw-content-text']/table[2]/tbody/tr[*]/td[last()]");
		List<WebElement> disneyMovies = remoteWebDriver
				.findElementsByXPath("//*[@id='mw-content-text']/table[2]/tbody/tr[*]/td[2]/a[contains(@title,'Disney')]");

		System.out.println("Listing out all contents of the table");
		for (WebElement webElement : alltableElements) {
			System.out.println(webElement.getText());
		}

		System.out.println("Listing out all column names");
		for (WebElement webElement : allColumnNames) {
			System.out.println(webElement.getText());
		}

		System.out.println("Listing out all elements in 2 column");

		for (WebElement webElement : allentries_In_2Column) {
			System.out.println(webElement.getText());
		}

		System.out.println("Listing out all elements in 2 Row");
		for (WebElement webElement : allentries_In_2Row) {
			System.out.println(webElement.getText() + "\n");
		}

		System.out.println("Listing all the entries in last column");

		for (WebElement webElement : listofAllentites_In_LastColumn) {
			System.out.println(webElement.getText() + "\n");

		}

		System.out.println("***Disney movies***");

		for (WebElement webElement : disneyMovies) {
			System.out.println(webElement.getText() + "\n");
		}

		remoteWebDriver.quit();
	}

}
