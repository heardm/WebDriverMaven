import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver= new FirefoxDriver();
	}
	@Test
	public void doLogin() throws InterruptedException
	{
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("bbbbbb@gmail.com");
		Thread.sleep(2000L);
		
	}
	@AfterTest
	public void TeatDown()
	{
		driver.quit();
	}

}
