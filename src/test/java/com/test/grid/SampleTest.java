package com.test.grid;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bsh.Capabilities;

public class SampleTest {

	private RemoteWebDriver remoteWebDriver = null;
	private static ChromeDriverService service;


	// @BeforeMethod
	public void setUp() throws MalformedURLException {

	}

	// @BeforeClass
	public void setUp1() throws MalformedURLException {
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		capability.setBrowserName("firefox");
		capability.setPlatform(Platform.LINUX);
		capability.setVersion("3.6");
		remoteWebDriver = new RemoteWebDriver(new URL(
				"http://localhost:4444/wd/hub"), capability);
		remoteWebDriver.get("http://selenium.polteq.com/prestashop/");
	}

	// @Test
	public void test1() throws MalformedURLException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\drivers\\chrome-driver-2.8\\chromedriver.exe");

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		remoteWebDriver = new ChromeDriver(capabilities);
		remoteWebDriver.get("http://google.com");
		System.out.println(remoteWebDriver.getTitle());
		remoteWebDriver.close();

	}

	@Test
	public void remoteWebDriver() throws MalformedURLException {
		// System.setProperty("webdriver.ie.driver",
		// "C:\\Selenium\\drivers\\ie-driver-2.39\\IEDriverServer.exe");

		// DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		// desiredCapabilities.setBrowserName(DesiredCapabilities
		// .internetExplorer().getBrowserName());
		// desiredCapabilities.setPlatform(Platform.VISTA);
		// URL url = new URL("http://10.239.60.163:4444/wd/hub");
		// remoteWebDriver = new RemoteWebDriver(url,
		// DesiredCapabilities.chrome());
		// remoteWebDriver.get("http://google.com");
		// System.out.println(remoteWebDriver.getTitle());
		// remoteWebDriver.close();

		URL url = new URL("http://10.244.180.70:4444/wd/hub");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName(DesiredCapabilities.chrome().getBrowserName());
		RemoteWebDriver remoteWebDriver = new RemoteWebDriver(url, dc);
		remoteWebDriver.get("http://cgi-lib.berkeley.edu/ex/fup.html");
		RemoteWebElement element = (RemoteWebElement) remoteWebDriver.findElement(By
				.name("upfile"));
		File f = new File("/src/test/resource/test.txt");
		element.setFileDetector(new LocalFileDetector());
		element.sendKeys(f.getAbsolutePath());
		WebElement ele = remoteWebDriver
				.findElement(By.xpath("//input[@value='Press']"));
		ele.click();
		System.out.println("Page URL after upload = " + remoteWebDriver.getCurrentUrl());
		System.out.println(remoteWebDriver.getPageSource());
		remoteWebDriver.quit();
	}
//	
//	@Test
//	public void a() {
//		System.out.println("Current thread for test a is " + Thread.currentThread().getId());
//		URL url = null;
//		try {
//			url = new URL("http://localhost:4444/wd/hub");
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		DesiredCapabilities dc = new DesiredCapabilities();
//		dc.setBrowserName(DesiredCapabilities.firefox().getBrowserName());
//		RemoteWebDriver remoteWebDriver = new RemoteWebDriver(url, dc);
//		remoteWebDriver.get("http://cgi-lib.berkeley.edu/ex/fup.html");
//		RemoteWebElement element = (RemoteWebElement) remoteWebDriver.findElement(By
//				.name("upfile"));
//		File f = new File("C:/Users/krmahadevan/Desktop/text.txt");
//		element.setFileDetector(new LocalFileDetector());
//		element.sendKeys(f.getAbsolutePath());
//		WebElement ele = remoteWebDriver
//				.findElement(By.xpath("//input[@value='Press']"));
//		ele.click();
//		System.out.println("Page URL after upload = " + remoteWebDriver.getCurrentUrl());
//		System.out.println(remoteWebDriver.getPageSource());
//		remoteWebDriver.quit();
//	}
//	
//	@Test
//	public void b() {
//		System.out.println("Current thread for test b is " + Thread.currentThread().getId());
//		URL url = null;
//		try {
//			url = new URL("http://localhost:4444/wd/hub");
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		DesiredCapabilities dc = new DesiredCapabilities();
//		dc.setBrowserName(DesiredCapabilities.firefox().getBrowserName());
//		RemoteWebDriver remoteWebDriver = new RemoteWebDriver(url, dc);
//		remoteWebDriver.get("http://cgi-lib.berkeley.edu/ex/fup.html");
//		RemoteWebElement element = (RemoteWebElement) remoteWebDriver.findElement(By
//				.name("upfile"));
//		File f = new File("C:/Users/krmahadevan/Desktop/text.txt");
//		element.setFileDetector(new LocalFileDetector());
//		element.sendKeys(f.getAbsolutePath());
//		WebElement ele = remoteWebDriver
//				.findElement(By.xpath("//input[@value='Press']"));
//		ele.click();
//		System.out.println("Page URL after upload = " + remoteWebDriver.getCurrentUrl());
//		System.out.println(remoteWebDriver.getPageSource());
//		remoteWebDriver.quit();
//	}
//
//	@Test
//	public void c() {
//		System.out.println("Current thread for test c is " + Thread.currentThread().getId());
//		URL url = null;
//		try {
//			url = new URL("http://localhost:4444/wd/hub");
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		DesiredCapabilities dc = new DesiredCapabilities();
//		dc.setBrowserName(DesiredCapabilities.firefox().getBrowserName());
//		RemoteWebDriver remoteWebDriver = new RemoteWebDriver(url, dc);
//		remoteWebDriver.get("http://cgi-lib.berkeley.edu/ex/fup.html");
//		RemoteWebElement element = (RemoteWebElement) remoteWebDriver.findElement(By
//				.name("upfile"));
//		File f = new File("C:/Users/krmahadevan/Desktop/text.txt");
//		element.setFileDetector(new LocalFileDetector());
//		element.sendKeys(f.getAbsolutePath());
//		WebElement ele = remoteWebDriver
//				.findElement(By.xpath("//input[@value='Press']"));
//		ele.click();
//		System.out.println("Page URL after upload = " + remoteWebDriver.getCurrentUrl());
//		System.out.println(remoteWebDriver.getPageSource());
//		remoteWebDriver.quit();
//	}
//
//	@Test
//	public void d() {
//		System.out.println("Current thread for test d is " + Thread.currentThread().getId());
//		URL url = null;
//		try {
//			url = new URL("http://localhost:4444/wd/hub");
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		DesiredCapabilities dc = new DesiredCapabilities();
//		dc.setBrowserName(DesiredCapabilities.firefox().getBrowserName());
//		RemoteWebDriver remoteWebDriver = new RemoteWebDriver(url, dc);
//		remoteWebDriver.get("http://cgi-lib.berkeley.edu/ex/fup.html");
//		RemoteWebElement element = (RemoteWebElement) remoteWebDriver.findElement(By
//				.name("upfile"));
//		File f = new File("C:/Users/krmahadevan/Desktop/text.txt");
//		element.setFileDetector(new LocalFileDetector());
//		element.sendKeys(f.getAbsolutePath());
//		WebElement ele = remoteWebDriver
//				.findElement(By.xpath("//input[@value='Press']"));
//		ele.click();
//		System.out.println("Page URL after upload = " + remoteWebDriver.getCurrentUrl());
//		System.out.println(remoteWebDriver.getPageSource());
//		remoteWebDriver.quit();
//	}


}
