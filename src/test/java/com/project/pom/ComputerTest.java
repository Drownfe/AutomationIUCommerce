package com.project.pom;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ComputerTest {

	private WebDriver driver;
	ComputerPage computerPage;
	
	@Before
	public void setUp() throws Exception {
		computerPage = new ComputerPage(driver);
		driver = computerPage.chromeDriverConnection();
		driver.manage().window().maximize();
		computerPage.visit("https://demo.nopcommerce.com/");
	}
	@Test
	public void test() throws InterruptedException{
		computerPage.computerSearch();
		Thread.sleep(2000);
	}

}
