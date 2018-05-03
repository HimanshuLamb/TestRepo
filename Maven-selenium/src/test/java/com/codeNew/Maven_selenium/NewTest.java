package com.codeNew.Maven_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URL;
 
public class NewTest {
 
  public static final String USERNAME = "asad360logica";
  public static final String ACCESS_KEY = "4b140c78-2f70-4e2b-a733-e556e02ecde9";
  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
 
  @Test
  public static void Test_new() throws Exception {
 
    DesiredCapabilities caps = DesiredCapabilities.chrome();
    caps.setCapability("platform", "Windows 10");
    caps.setCapability("version", "43.0");
    caps.setCapability("build",  "parallel4");
    caps.setCapability("name",  "parallell1");
    caps.setCapability("passed",  "true");
    
    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    
    driver.get("http://wwww.facebook.com");
	driver.findElement(By.id("email")).sendKeys("sads");
	driver.findElement(By.id("pass")).sendKeys("sads");
	driver.findElement(By.xpath(".//*[@id='u_0_q']")).click();
	System.out.println(driver.getTitle());

 
    driver.quit();
    
  }
  
  @Test
  public static void Test_new2() throws Exception {
 
    DesiredCapabilities caps = DesiredCapabilities.chrome();
    caps.setCapability("platform", "Windows 7");
    caps.setCapability("version", "43.0");
    caps.setCapability("build",  "parallel4");
    caps.setCapability("name",  "parallell2");
    caps.setCapability("passed",  "true");
    
    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    
    driver.get("http://wwww.facebook.com");
	driver.findElement(By.id("email")).sendKeys("sads");
	driver.findElement(By.id("pass")).sendKeys("sads");
	driver.findElement(By.xpath(".//*[@id='u_0_q']")).click();
	System.out.println(driver.getTitle());

 
    driver.quit();
    
  }
}