package Basic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import CommonUtils.PropertyFileUtil;
import CommonUtils.WebDriverUtil;

public class OrganizationTest {

	@Test
	public void CreateOrganizationTest() throws IOException
	{
//		PropertyFileUtil putil = new PropertyFileUtil();
		WebDriverUtil wutil = new WebDriverUtil();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
//		driver.manage().window().maximize();
		wutil.maximize(driver);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		wutil.implicitWait(driver);
		
		//To read data from Property File
//		driver.get(putil.getDataFromPropertyFile("Url"));
//		driver.findElement(By.name("user_name")).sendKeys(putil.getDataFromPropertyFile("Username"));
//		driver.findElement(By.name("user_password")).sendKeys(putil.getDataFromPropertyFile("Password"));
		
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		
	    driver.findElement(By.id("submitButton")).click();
	}
}




