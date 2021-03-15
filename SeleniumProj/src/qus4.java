import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qus4 {
public static void main(String[] args) throws InterruptedException {
		        System.out.println("hello");
		        
		        String cwd = Paths.get("").toAbsolutePath().toString();
		    	String filePath = cwd+"/chromedriver_win32/chromedriver.exe";
		       System.setProperty("webdriver.chrome.driver",filePath);
		       
		        WebDriver driver=new ChromeDriver();
		        driver.get("http://demo.automationtesting.in/Frames.html");
		        
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[1]/a")).click();

		        driver.switchTo().frame(0);
		        driver.findElement(By.cssSelector("section:nth-child(1) div.container div.row div.col-xs-6.col-xs-offset-5 > input:nth-child(1)")).sendKeys("sakshi negi");
		        
		        driver.switchTo().defaultContent();
		        
		        driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		         Thread.sleep(3000);
		         driver.switchTo().frame(1);
		         Thread.sleep(1000);
		         driver.switchTo().frame(0);
		         driver.findElement(By.cssSelector(".col-xs-6 > input:nth-child(1)")).sendKeys("hello world");
		        

		        
}}

