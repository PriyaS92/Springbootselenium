package com.automation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service("home")
@Component
public class Homepage extends Basepage{
	
	@FindBy(xpath="//*[@id='loginLink']")
    WebElement btnLogin;

	public void ClickLogin()
    {
		try{
			TimeUnit.SECONDS.sleep(5);
			btnLogin.click();
		}
		catch(Exception e){e.printStackTrace();}
	}
}
