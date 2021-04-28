package com.automation.springtest.libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.automation.pages")
public class WebDriverConfig {
	
	@Bean
    @ConditionalOnProperty(name = "browser", havingValue = "Chrome")
	public WebDriver getChrome(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		return new ChromeDriver();
	}
	
	@Bean
    @ConditionalOnProperty(name = "browser", havingValue = "IE")
	public WebDriver getIE(){
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//drivers//IEDriverServer.exe");
		return new InternetExplorerDriver();
		
	}
}
