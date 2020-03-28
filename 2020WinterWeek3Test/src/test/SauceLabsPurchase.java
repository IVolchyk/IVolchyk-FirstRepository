package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLabsPurchase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        String baseURL = "http://www.saucedemo.com";
         WebDriver driver;                          
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
        driver.findElement(By.xpath("//div[@id='inventory_container']/div/div/div[3]/button")).click();
        driver.findElement(By.linkText("Sauce Labs Bike Light")).click();
   //     driver.findElement(By.xpath("//a[@id='item_0_img_link']/img")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='inventory_item_container']/div/div/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='inventory_item_container']/div/button")).click();
        Thread.sleep(2000);
        //String url = "https://www.saucedemo.com/inventory.html";
        	//	driver.get(url);
        driver.findElement(By.xpath("//div[@id='inventory_container']/div/div[4]/div[3]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'CHECKOUT')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("first-name")).sendKeys("ILYA");
        driver.findElement(By.id("last-name")).sendKeys("VOLCHYK");
        driver.findElement(By.id("postal-code")).sendKeys("45039");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='checkout_info_container']/div/form/div[2]/input")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'FINISH')]")).click();
     
        
        Thread.sleep(3000);
        driver.close();
        
	}

}
