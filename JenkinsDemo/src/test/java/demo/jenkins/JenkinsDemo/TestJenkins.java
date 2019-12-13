package demo.jenkins.JenkinsDemo;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestJenkins {
	
    static WebDriver driver = null;
    
	@BeforeTest
	public static void setup() throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");
        Thread.sleep(10000);
	}
	
	@Test
	public static void login() throws InterruptedException {
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
	}
	
	@AfterTest
	public static void teardown(){
		
		driver.quit();
	}

}
