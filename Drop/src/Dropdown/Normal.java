package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Normal {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\New Folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		WebElement day=driver.findElement(By.name("birthday_day"));
		
		Select s=new Select(day);
		s.selectByVisibleText("2");
		
	}

}
