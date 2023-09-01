package basic1;

	import org.openqa.selenium.WebDriver; 
	import org.openqa.selenium.chrome.ChromeDriver; 
	public class testclass 
	{ 
	public static void main(String[] args) throws InterruptedException 
	{ 

	 
	 WebDriver driver = new ChromeDriver(); 
	 
	//driver.get("https://www.w3schools.com/sql/default.asp");
	driver.get("https://www.google.com/"); 
	 Thread.sleep(3000); 
	driver.close(); } // Close is used to close CURRENT TAB only

	} 




