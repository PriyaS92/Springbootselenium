package com.automation.springtest;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import com.automation.pages.Basepage;
import com.automation.pages.Homepage;

@SpringBootTest(classes = Application.class)
class ApplicationTests{

	@Value("${app.url}")
	String testurl;
	
	@Value("${browser}")
	String browsername;
	
	@Autowired
	private Basepage base;
	
	@Autowired
	private Homepage home;
	
	@Test
	void contextLoads() {
		base.navigate(testurl);
		home.ClickLogin();
	}

}
