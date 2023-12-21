package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login_test_04_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement Drp_country=driver.findElement(By.xpath("//select[(@name='country')]"));
		
		Select sel=new Select(Drp_country);
		sel.selectByIndex(2);
		
		sel.selectByValue("INDIA");
		
		sel.selectByVisibleText("BRAZIL");
		

	}

}
