import java.nio.file.Paths;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class qus1 {
public static void main(String[] args) throws InterruptedException {
	String cwd = Paths.get("").toAbsolutePath().toString();
	String filePath = cwd+"/geckodriver-v0.29.0-win64/geckodriver.exe";
   System.setProperty("webdriver.gecko.driver",filePath);

   WebDriver driver= new FirefoxDriver();
driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
 
Thread.sleep(2000);
   
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,400)");

Thread.sleep(5000);

driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/button")).click();
Thread.sleep(5000);
driver.switchTo().alert().dismiss();  
Thread.sleep(5000);

driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
Thread.sleep(5000);

driver.switchTo().alert().dismiss();  
Thread.sleep(5000);


   driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button")).sendKeys("Sakshi Negi");
Thread.sleep(1000);

driver.switchTo().alert().accept();
} }
