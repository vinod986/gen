package one;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SEF {
private static WebDriver driver;
static {
	System.setProperty("webdriver.chrome.driver", "c:/users/admin/downloads/chromedriver.exe");
}
@Test
	public static void main() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
Thread.sleep(2000);
driver.findElement(By.id("loginButton")).click();
Thread.sleep(6000);
driver.close();
	}

}
