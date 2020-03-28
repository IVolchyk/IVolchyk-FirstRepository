package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewToursTravel2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String baseURL = "http://www.newtours.demoaut.com";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
		driver.findElement(By.name("userName")).sendKeys("jouser");
		driver.findElement(By.name("password")).sendKeys("jospw");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("(//input[@name='tripType'])[2]")).click();
		driver.findElement(By.xpath("(//input[@name='servClass'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("findFlights")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("ILYA");
		driver.findElement(By.name("passLast0")).sendKeys("VOLCHYK");
		driver.findElement(By.name("creditnumber")).sendKeys("3725567891234565");
		Thread.sleep(2000);
		driver.findElement(By.name("buyFlights")).click();
		System.out.println("Your reservation have been made, Ilya");

		Thread.sleep(3000);
		driver.close();
	}

}
