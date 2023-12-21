package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoExerTestScript1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		driver.manage().window().maximize();
	
driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("mulageambika10@gmail.com");
driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("123@ambika");
driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/button")).click();

	}

}
