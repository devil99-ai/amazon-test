package amazon.automationTest.basePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import amazon.automationTest.utility.TimeUtils;

public class BaseClass {
	public static Properties prop = new Properties();
	public static WebDriver driver;
	public static WebDriverWait wait;
	//step1- creating constructor of the class
	public BaseClass(){
		//read the config.properties file
		try{
		FileInputStream file = new FileInputStream("src/test/java/amazon/automationTest/environmentVariables/config.properties");
		prop.load(file);
		
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}
	//step2
	public static void initiation() {
		 wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		// driver path
		//maximize, pageload, implicit, get url
		String browserName = prop.getProperty("browser");
		if(browserName.equals("Firefox")) {
			driver = new FirefoxDriver();
			
		}else if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}else if(browserName.equals("Internetexplorer")) {
			driver = new InternetExplorerDriver();
		}else {
			System.out.println("driver not found");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TimeUtils.timepage));
		driver.get(prop.getProperty("url"));
	}
	public static void screenshot(String filename) {
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("C:\\Users\\svksh\\eclipse-workspace\\Framework\\src\\test\\java\\screenshots\\Screenshots\\"+filename+".jpg"));
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		}

}
