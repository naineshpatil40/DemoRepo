package com.shoptimize.Shoptimize.Automation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ShoptimizeApplication {

  @SuppressWarnings("static-access")
@Test
  public void Test() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.symphonylimited.com/products/household-cooler.html");
		
		String data = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[6]/ol")).getText();
		
    // 	System.out.println(data);
		
     // split the String by a comma
		
		  String parts[] = data.split("\"\\\\r?\\\\n\"");
		  
		  for (String part : parts) {
		  
		  // split the student data by colon to get the // name and roll number //
		  String stuData[] = part.split(":");
		  
		  String productName = stuData[0].trim(); String stuName = stuData[1].trim();
		  
		  // Add to map hashMap.put(stuRollNo, stuName); }
		 

        
		/*
		 * Map<String, List<String>> hm = new HashMap<String, List<String>>();
		 * List<String> values = new ArrayList<String>();
		 * values.add(data.valueOf("ADD TO CART"));
		 * values.add(data.valueOf("finalPrice"));
		 * 
		 * hm.put("Key1", values);
		 * 
		 * System.out.println(hm.get("key1"));
		 */
	 

		
		
		
		
	//	Map<Object,ArrayList<Object>> multiMap = new HashMap<>();

		 // HashMap<String, Integer> map = new HashMap<>();
		  
		//  map.containsValue(data);
		  
		//  Collection<Integer> collectionValues = data.value();
		  
	//	  for(Integer s: collectionValues){
			  
	//		  System.out.println(s); }
		  
		  // System.out.println(data);
		 	}
  }

}
