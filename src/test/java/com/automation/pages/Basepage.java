package com.automation.pages;

import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("base")
@Component
public class Basepage{
	
	@Autowired
	public WebDriver driver;
	
	 @PostConstruct
	    public void initDriver() {
	        PageFactory.initElements(driver, this);
	    }
	
	public void navigate(String url){
		try{
			driver.get(url);
			driver.manage().window().maximize();
			TimeUnit.SECONDS.sleep(5);
		}
		catch(Exception e){e.printStackTrace();}
	}
}
