package basic1; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
public class X_path_contains_Text 
{ 
public static void main(String[] args) 
{ 
 
//System.setProperty("webdriver.chrome.driver","H:\\Selenium\\chromedriver.exe"); 
 
WebDriver driver = new ChromeDriver(); 
 
driver.get("https://en-gb.facebook.com/login/"); 
 
//xpath by Contains(text)
driver.findElement(By.xpath("//a[contains(text(),'Forgotten ')]")).click(); 
 
//xpath by Contains(attribute)
driver.findElement(By.xpath("//a[contains(@rel,'follow')][1]")).click(); 
 
}



}
