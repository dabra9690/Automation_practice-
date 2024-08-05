package auto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PDP {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://f5global.com/");
			
			WebElement pro=driver.findElement(By.xpath("//h3[@id='title-template--17169778475177__featured_collection_xkEmjW-8086808264873']"));
			pro.click();
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
			//WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[@id='title-template--17169778475177__featured_collection_xkEmjW-8086808264873']")));
			//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
			//element1 = wait.until(ExpectedConditions.elementToBeClickable(element1));
			//element1.click();
			
			
			//WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/label[@for='template--17169778704553__main-2-1']")));
			//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
			//((JavascriptExecutor) driver).executeScript("arguments[0].click();", element2);
			
			System.out.println(driver.getPageSource());
			
			//driver.findElement(By.xpath("//label[@for='template--17169778704553__main-2-1']")).click();
			//driver.findElement(By.xpath("//label[@for='template--17169778704553__main-1-1']")).click();

		}

	}

	


