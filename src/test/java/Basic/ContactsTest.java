package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactsTest {

	@Test
	public void CreateContactsTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
	}
}
