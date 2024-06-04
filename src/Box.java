import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Box {
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("windows.chrome.driver","C:\\Users\\EKHOOL-253\\eclipse-workspace\\Sims_Module\\ChromeDriver\\chromedriver.exe");
	 ChromeDriver driver = new ChromeDriver();
	 driver.get("https://bole-school.account.ethiocheno.com/v3/signin?identifier=mail&client_id=Ym9sZS1zY2hvb2wuYWNjb3VudC5ldGhpb2NoZW5vLmNvbQ%3D%3D&redirect_uri=https%3A%2F%2Fbole-school.box.ethiocheno.com%2Fauth%2Fcallback");
	 driver.manage().window().maximize();
	 driver.findElement(By.id("email")).sendKeys("arul@resbee.org");
	 driver.findElement(By.xpath("//button[@id='SubmitBtn']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.id("password")).sendKeys("Qwerty@123");
	 driver.findElement(By.id("continueBtn")).click();
	 Thread.sleep(5000);
	 driver.get("https://bole-school.box.ethiocheno.com/category");
	 Thread.sleep(1125);
	 driver.get("https://bole-school.box.ethiocheno.com/recent");
	 Thread.sleep(1098);
	 driver.get("https://bole-school.box.ethiocheno.com/my-shared");
	 Thread.sleep(1562);
	 driver.get("https://bole-school.box.ethiocheno.com/my-starred");
	 Thread.sleep(1141);
	 driver.get("https://bole-school.box.ethiocheno.com/groups");
	 Thread.sleep(1008);
	 driver.get("https://bole-school.box.ethiocheno.com/settings");
	 Thread.sleep(1896);
	 driver.get("https://bole-school.box.ethiocheno.com/my-box");
	 driver.findElement(By.xpath("//span[normalize-space()='New']")).click();
	 driver.findElement(By.xpath("//span[normalize-space()='New folder']")).click();
	 driver.findElement(By.xpath("//span[normalize-space()='New folder']")).sendKeys("Altrin");
	 driver.findElement(By.xpath("//span[normalize-space()='New folder']")).click();
	 driver.findElement(By.xpath(""));
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	 
	
}
		

}
