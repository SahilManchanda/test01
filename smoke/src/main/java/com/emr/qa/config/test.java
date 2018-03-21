package com.emr.qa.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.emr.qa.util.TestUtil;

import org.openqa.selenium.WebDriver;

public class test {
	//public static WebDriver driver;
	public static Properties prop;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
			
			
				
				prop = new Properties();
				FileInputStream ip = new FileInputStream("C:/Users/IBM_ADMIN/git/test01/smoke/src/main/java/com/emr/qa/config/config.properties");
				
				prop.load(ip);
			
				
				System.out.println(prop.getProperty("url"));
			

	}

}
