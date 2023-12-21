package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Test002 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://automationexercise.com/login");
		cd.manage().window().maximize();
		

		cd.findElement(By.xpath("//input[@name='email']")).sendKeys("shubhangi1577@gmail.com");
		cd.findElement(By.xpath("//input[@name='password']")).sendKeys("S@12345");
		cd.findElement(By.xpath("//button[text()='Login']")).click();
				

	}

}