package jordan1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lava124 {

	 public static String url ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","C://Users//91636//Documents//workspace-spring-tool-suite-4-4.16.0.RELEASE//jordan//chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
driver.get(url);
System.out.print("oranghrm is opened");
Thread.sleep(5000);
//driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
 String beforelogin=driver.getTitle();
 System.out.println(beforelogin);
driver.findElement(By.name("username")).sendKeys("Admin");
Thread.sleep(3000);
driver.findElement(By.name("password")).sendKeys("admin123");
Thread.sleep(3000);
driver.findElement(By.xpath(" //*[@type= 'submit']" )).click();
String afterlogin=driver.getTitle();
System.out.println(afterlogin);
if(beforelogin.equals(afterlogin))
{
	System.out.println("login successfull");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@class= 'oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"']")).sendKeys("click");
}
else
{
	System.out.println("login failed");
}
driver.close();
		
}
}
