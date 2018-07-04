package mavenproject.smashxautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomeTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://192.168.0.141");
		driver.findElement(By.xpath("/html/body/form/div/div/div/div/input[1]")).sendKeys("Devi");
		driver.findElement(By.xpath("/html/body/form/div/div/div/div/input[2]")).sendKeys("devi@1234");
		driver.findElement(By.xpath("/html/body/form/div/div/div/div/button")).click();
		driver.close();
  }
}
