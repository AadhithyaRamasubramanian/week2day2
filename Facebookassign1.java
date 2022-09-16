package week1day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebookassign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
       String driverpath=System.getProperty("webdriver");
       System.out.println("driverpath");
      
       ChromeDriver driver = new ChromeDriver();
       driver.get(" https://en-gb.facebook.com/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
       driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click(); 
       driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aadhithya");
       driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ramasubramanian");
       driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("123456789");
       driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("aadhithya");
       WebElement drop=driver.findElement(By.xpath("//select[@name='birthday_day']"));
       Select dropdown =new Select(drop);
       dropdown.selectByValue("26");
       WebElement drop1=driver.findElement(By.xpath("//select[@name='birthday_month']"));
       Select dropdown1 =new Select(drop1);
       dropdown1.selectByIndex(6);
       WebElement drop2=driver.findElement(By.xpath("//select[@name='birthday_year']"));
       Select dropdown2 =new Select(drop2);
       dropdown2.selectByVisibleText("1991");
       driver.findElement(By.xpath("//label[text()='Female']")).click();
       
       
       
       
       
	}

}
