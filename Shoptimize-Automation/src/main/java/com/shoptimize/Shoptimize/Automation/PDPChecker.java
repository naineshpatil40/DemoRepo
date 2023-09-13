package com.shoptimize.Shoptimize.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PDPChecker {

	
	@org.testng.annotations.Test
	 public void Test() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			
			driver.get("https://whirlpool.stores2.shoptimize.in/semi-automatic/ace-xl-10-5-kg-semi-automatic-washing-machine-3d-scrub-technology-graphite-grey-5-star-5-years-warranty-30175.html");
	
			driver.findElement(By.xpath("//*[@id=\"pincode\"]")).sendKeys("121003");
			System.out.println("pincode entered");
			
			driver.findElement(By.xpath("//*[@id=\"pincode_check\"]")).click();
			Thread.sleep(3000);
			System.out.println("data");
			
			String availability = driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
			System.out.println(availability);
	}
}