package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelProj1 {

	@Test
	public void test1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http:www.selenium.dev");
		System.out.println(driver.getTitle());
		//sadad
		driver.close();
	}
}
