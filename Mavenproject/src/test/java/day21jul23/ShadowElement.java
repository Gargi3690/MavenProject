package day21jul23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ShadowElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://shop.polymer-project.org/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		
		// click on SHOP NOW button for Women's wear
		SearchContext btnWomensShop = driver.findElement(By.tagName("shop-app")).getShadowRoot();
	 	btnWomensShop.findElement(By.cssSelector("a[href='/list/ladies_outerwear']")).click();
		Thread.sleep(4000l);
	 	driver.navigate().back();
	 
	  
	 	
		// click on SHOP NOW button for Men's wear
		SearchContext btnMensShop = driver.findElement(By.tagName("shop-app")).getShadowRoot();
	 	btnMensShop.findElement(By.cssSelector("a[href='/list/mens_outerwear']")).click();
		 
	}
	}