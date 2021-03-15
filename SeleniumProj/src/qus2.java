import java.nio.file.Paths;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class qus2 {
public static void main(String[] args) throws InterruptedException {
		        System.out.println("hello");
		        
		        String cwd = Paths.get("").toAbsolutePath().toString();
		    	String filePath = cwd+"/chromedriver_win32/chromedriver.exe";
		       System.setProperty("webdriver.chrome.driver",filePath);
		       
		        WebDriver obj=new ChromeDriver();
		        obj.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		        
		       // validating and fatching multi dropdown value
		      //Selecting the multi-select element by locating its id
		        Select select = new Select(obj.findElement(By.id("multi-select")));

		        //Get the list of all the options
		        System.out.println("The dropdown options are -");

		        List<WebElement> options = select.getOptions();

		        for (WebElement option : options)
		            System.out.println(option.getText());

		        //Using isMultiple() method to verify if the element is multi-select, if yes go onto next steps else exit
		        if (select.isMultiple()) {
		            System.out.println("it is a multiple dropdown");
		        }
		            else
		            {
		                System.out.println("it is not a multiple dropdown");
		            }
		           	         
		        Thread.sleep(2000);	        
		        // scrolling down
		        JavascriptExecutor js = (JavascriptExecutor) obj;
		        js.executeScript("window.scrollBy(0,400)");
		      
		        Thread.sleep(2000);
		        
		        WebElement dropDownOptions = obj.findElement(By.id("multi-select"));
		        
		        Select select1 = new Select(dropDownOptions);
		        
		        if( select1.isMultiple()) {
		        	 System.out.println("executing");
		        	 
		        	 // selecting by values         	 
		        	 select.selectByValue("New Jersey");
		        	 select.selectByValue("New York");
		        	 select.selectByValue("Texas");
		        }
		        
		        Thread.sleep(2000);
		        
		        WebElement printAll = obj.findElement(By.id("printAll"));
		        printAll.click();
		        Thread.sleep(2000);
		        select.deselectAll();
		        Thread.sleep(2000);	        
		     		        
}}