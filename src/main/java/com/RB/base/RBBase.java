package com.RB.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.RB.util.RBUtil;

public class RBBase {
	public static Properties prop;
	public static WebDriver driver;
	
	public RBBase() {
		try {
		prop = new Properties();
		FileInputStream ip= new FileInputStream("C:\\Users\\manishsaini\\eclipse-workspace\\RedBusApp"
				+ "\\src\\main\\java\\com\\RB\\config\\config.properties");
		
		prop.load(ip);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		String browserName =prop.getProperty("browser");
		if (browserName.equals("chrome")){
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver", "E:\\Backup\\E drive\\Softwares\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver(options);
		}
		
		//download geckodriver and give appropriate path
		else if (browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "E:\\Backup\\E drive\\Softwares\\chromedriver_win32");
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(RBUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(RBUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
	driver.get(prop.getProperty("url"));
	}
}
