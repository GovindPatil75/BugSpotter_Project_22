package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Test02 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();

		d.findElement(By.xpath("//input[@name='email']")).sendKeys("S1234@gmail.com");
		d.findElement(By.xpath("//input[@name='pass']")).sendKeys("98765");
		d.findElement(By.xpath("//button[@name='login']")).click();
				
	
	}

}