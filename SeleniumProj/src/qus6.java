import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class qus6{
public static void main(String[] args) throws InterruptedException {
	 System.out.println("hello");
	 
	  String cwd = Paths.get("").toAbsolutePath().toString();
  	String filePath = cwd+"/chromedriver_win32/chromedriver.exe";
     System.setProperty("webdriver.chrome.driver",filePath);

     WebDriver driver=new ChromeDriver();
driver.get("https://demoqa.com/browser-windows");
Thread.sleep(2000);
   
driver.findElement(By.id("messageWindowButton")).click();
String mainwindow = driver.getWindowHandle();
Set<String> s1 = driver.getWindowHandles();
Iterator<String> i1 = s1.iterator();

while (i1.hasNext()) {
    String ChildWindow = i1.next();
        if (!mainwindow.equalsIgnoreCase(ChildWindow)) {
        driver.switchTo().window(ChildWindow);
        WebElement text = driver.findElement(By.xpath("/html/body"));
        System.out.println("Heading of child window is " + text.getText());
        driver.close();
        System.out.println("Child window closed");
        Thread.sleep(3000);
    }
}    

//  Switch back to the main window which is the parent window.
driver.switchTo().defaultContent();
Thread.sleep(2000);
driver.quit();
}
}







