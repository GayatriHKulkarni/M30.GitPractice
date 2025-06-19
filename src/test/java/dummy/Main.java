package dummy;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=new FileInputStream("./TestFolder/Credentials.properties");
		
		Properties prop=new Properties();
		prop.load(fis);
		String Browsr=prop.getProperty("browser");
		String URL=prop.getProperty("URL");
		String UN=prop.getProperty("UN");
		String PW=prop.getProperty("PW");
		
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement UN1=driver.findElement(By.name("username"));
		UN1.clear();
		UN1.sendKeys(UN);
		
		WebElement PW1=driver.findElement(By.name("password"));
		PW1.clear();
		PW1.sendKeys(PW);
		
		System.out.println("Done");
		
		driver.quit();
		
		
		

	}

}
