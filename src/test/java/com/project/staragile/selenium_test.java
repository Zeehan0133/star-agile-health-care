package com.project.staragile;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By; 
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class selenium_test {
	@SuppressWarnings({"deprecation"})
	public static void main(final String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./webdriver/chromedriver.exe");
		final ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
		final WebDriver driver = (WebDriver) new ChromeDriver(chromeOptions);
		driver.get("http://localhost:8082/contact.html");
		//driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("Input[placeholder= 'Your Name']")).sendKeys("Zeehan");
		driver.findElement(By.cssSelector("Input[placeholder='Phone Number']")).sendKeys("12345099"); 
		driver.findElement(By.cssSelector("input[(placeholder= 'Email']")).sendKeys("zee@gmail.com");
		driver.findElement (By.cssSelector("input[(placeholder='Message']")).sendKeys(new CharSequence[] {"Welcome to the DevOps doubt session" });
		driver.findElement(By.id("sendButton")).click();
		final String message = driver.findElement(By.id("response")).getText();
		if (message.equals("Message Sent")) {
			System.out.println("Script executed Successfully");
		} else {
			System.out.println("Script failed");
		}
		
		}

}