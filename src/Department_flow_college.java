import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.text.SimpleDateFormat;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Department_flow_college {
	private static final String[] FIRST_NAMES = { "Day", "AFternoon", "Night",};
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\EKHOOL-253\\\\eclipse-workspace\\\\Sims_Module\\\\chrome driver 122\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://altrincollege55.account.uat.ethiocheno.com/v3/signin?identifier=mail&client_id=Z3VMbzlzaytxOVNvdkUrcGQ1dUUyZz09&redirect_uri=https%3A%2F%2Faltrincollege55.sims.uat.ethiocheno.com%2Fauthentication");
		
		Robot rob = new Robot();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("altrin.resbee+369@gmail.com");
		driver.findElement(By.xpath("(//button[normalize-space()='Next'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("12345");
		driver.findElement(By.xpath("(//button[normalize-space()='Continue'])[1]")).click();
//		for (int i = 0; i < 2; i++) {
//
//			rob.keyPress(KeyEvent.VK_CONTROL);
//			rob.keyPress(KeyEvent.VK_MINUS);
//			rob.keyRelease(KeyEvent.VK_CONTROL);
//			rob.keyRelease(KeyEvent.VK_MINUS);
//		}
//		Thread.sleep(6000);
//
//		for (int i = 0; i < 3; i++) {
//		    String[] shiftvalues = {"Day", "Afternoon", "Night"};
//
//		    driver.get("https://jacksophia.sims.uat.ethiocheno.com/shift/add");
//
//		    WebElement programDropdown = driver.findElement(By.xpath("//select[@id='programID']"));
//		    programDropdown.click();
//		    rob.keyPress(KeyEvent.VK_DOWN);
//		    rob.keyRelease(KeyEvent.VK_DOWN);
//		    rob.keyPress(KeyEvent.VK_ENTER);
//		    rob.keyRelease(KeyEvent.VK_ENTER);
//
//		    String sendKeysValue = shiftvalues[i]; 
//
//		    WebElement shiftNameInput = driver.findElement(By.xpath("//input[@id='shift_name']"));
//		    shiftNameInput.sendKeys(sendKeysValue);
//
//		    driver.findElement(By.xpath("//input[@value='Add Shift']")).click();
//		}
//		Thread.sleep(3000);
//		driver.get("https://jacksophia.sims.uat.ethiocheno.com/schoolyear/add");
//		driver.findElement(By.xpath("//select[@id='schoolyear']")).click();
//		for (int i = 0; i < 2; i++) {
//			 rob.keyPress(KeyEvent.VK_DOWN);
//			    rob.keyRelease(KeyEvent.VK_DOWN);
//		}
//		rob.keyPress(KeyEvent.VK_ENTER);
//	    rob.keyRelease(KeyEvent.VK_ENTER);
//	    driver.findElement(By.xpath("//input[@id='schoolyeartitle']")).sendKeys("2016-2017"); 
//	    driver.findElement(By.xpath("//input[@id='startingdate']")).click();
//	    driver.findElement(By.xpath("//div[@id='contentContainer']//div[3]//div[1]//div[1]//div[1]//div[1]//div[2]//span[1]//span[1]")).click();
//	    driver.findElement(By.xpath("//button[contains(text(),'ጥር')]")).click();
//	    driver.findElement(By.xpath("//div[@id='contentContainer']//div[3]//div[1]//div[1]//div[1]//div[1]//div[4]//div[1]//div[4]//button[1]")).click();
//	    
//	    
//	    driver.findElement(By.xpath("//input[@id='endingdate']")).click();
//	    driver.findElement(By.xpath("//div[4]//div[1]//div[1]//div[1]//div[1]//div[2]//span[1]//span[2]")).click();
//	    driver.findElement(By.xpath("//div[@id='calendarParent']//div[1]//div[1]//button[2]//*[name()='svg']")).click();
//	    driver.findElement(By.xpath("//button[normalize-space()='2017']")).click();
//	    driver.findElement(By.xpath("//button[contains(text(),'ጥር')]")).click();
//	    driver.findElement(By.xpath("//div[4]//div[1]//div[1]//div[1]//div[1]//div[4]//div[1]//div[5]//button[1]")).click();
//	    
//	    Thread.sleep(20000); // have to set the application & registration date manually.
//	    
//	
//    // Application starting and ending date     
//        WebElement date = driver.findElement(By.xpath("//input[@id='admissionstartingdate']"));
//
//        
//        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MM-yyyy");
//        Date currentDate1 = new Date();
//        
//        
//        if (dateFormat1.format(currentDate1).equals("20-10-2023")) {
//            // If it is, set the date to one day earlier (19-10-2023)
//            currentDate1.setTime(currentDate1.getTime() - 24 * 60 * 60 * 1000);
//        }
//
//        String formattedDate = dateFormat1.format(currentDate1);
//
//      
//        js.executeScript("arguments[0].value = arguments[1];", date, formattedDate);
//
//        
//        js.executeScript("arguments[0].dispatchEvent(new Event('change', { bubbles: true }));", date);
//
//
//	    WebElement dateField = driver.findElement(By.xpath("//input[@id='admissionendingdate']"));
//	  
//        
//	    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
//        String currentDate = dateFormat.format(new Date());
//
//        js.executeScript("arguments[0].value = arguments[1];", dateField, currentDate);
//
//        
//        js.executeScript("arguments[0].dispatchEvent(new Event('change', { bubbles: true }));", dateField);
//
//	    driver.findElement(By.xpath("//input[@value='Add Year']")).click();
//	    Thread.sleep(2000);
	   
	    driver.get("https://altrincollege55.sims.uat.ethiocheno.com/departmentconfiguration");
	    Thread.sleep(2000);
	    String[] naturalfemale = {"246", "245", "245", "157", "157"};
	    String[] naturalmale = {"218", "217", "217", "156", "156"};
	    String[] naturaldisability = {"149", "148", "148", "130", "130"};
	    String[] socialfemale = {"203", "202", "202", "148", "148"};
	    String[] socialmale = {"179", "178", "178", "144", "144"};
	    String[] socialdisability = {"149", "148", "148", "130", "130"};

	   for (int i = 0; i < 5; i++) {
	       driver.findElement(By.xpath("//a[@class='btn btn-primary btn-w-icon']")).click();
	       Thread.sleep(2000);
	        driver.findElement(By.xpath("//select[@id='trainingyear']")).click();
	        rob.keyPress(KeyEvent.VK_DOWN);
            rob.keyRelease(KeyEvent.VK_DOWN);
            rob.keyPress(KeyEvent.VK_ENTER);
	        rob.keyRelease(KeyEvent.VK_ENTER);

	       driver.findElement(By.xpath("(//span[@class='select2-chosen'])[1]")).click();

	        for (int j = 0; j < 5 - i; j++) {
	            rob.keyPress(KeyEvent.VK_DOWN);
	            rob.keyRelease(KeyEvent.VK_DOWN);
	        }
	        
	        rob.keyPress(KeyEvent.VK_ENTER);
	        rob.keyRelease(KeyEvent.VK_ENTER);

	       String sendkeys1 = naturalfemale[i];
	        driver.findElement(By.xpath("//input[@id='natural_female_mark']")).sendKeys(sendkeys1);

	        String sendkeys2 = naturalmale[i];
	        driver.findElement(By.xpath("//input[@id='natural_male_mark']")).sendKeys(sendkeys2);

	        String sendkeys3 = naturaldisability[i];
	        driver.findElement(By.xpath("//input[@id='natural_disability_mark']")).sendKeys(sendkeys3);

	        String sendkeys4 = socialfemale[i];
	        driver.findElement(By.xpath("//input[@id='social_female_mark']")).sendKeys(sendkeys4);

	        String sendkeys5 = socialmale[i];
	        driver.findElement(By.xpath("//input[@id='social_male_mark']")).sendKeys(sendkeys5);

	        String sendkeys6 = socialdisability[i];
	        driver.findElement(By.xpath("//input[@id='social_disability_mark']")).sendKeys(sendkeys6);
	   
	        driver.findElement(By.xpath("//input[@value='Add']")).click();
	   
	   }
	   driver.get("https://soephiesophia.sims.uat.ethiocheno.com/departmentconfiguration");
	   for (int i = 0; i < 3; i++) {
		
	
	   String[] Departments = {"Engineering","Arts","Polytechnic",};
	   String[] Occupations = {"Civil","English","Mechanical"};
	   driver.findElement(By.xpath("//a[@class='btn btn-primary btn-w-icon']")).click();
	   driver.findElement(By.xpath("//select[@id='training_year']")).click();
	   rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	   
	   
	   String department = Departments[i];
	  driver.findElement(By.xpath("//span[@id='select2-department_name-container']")).click();
	  WebElement dept = driver.findElement(By.xpath("//input[@aria-label='Search']"));
		dept.sendKeys(department);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		String occupation = Occupations[i];
		 driver.findElement(By.xpath("//span[@id='select2-occupation-container']")).click();
		WebElement occu = driver.findElement(By.xpath("(//input[@aria-label='Search'])[1]"));
		occu.sendKeys(occupation);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//select[@id='starting_level']")).click();
		for (int j = 0; j <1 +i; j++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}	
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	   	
		driver.findElement(By.xpath("//select[@id='end_level']")).click();
		for (int j = 0; j < 2 +i; j++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	   
		int loopcount = 4;
		for (int j = 0; j < loopcount; j++) {
			int down = j+1;
			driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple']")).click();
		for (int k = 0; k < down; k++) {
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		}
	   driver.findElement(By.xpath("//input[@id='Numberoftrainee']")).sendKeys("5");
	   driver.findElement(By.xpath("//input[@value='Add']")).click();
	   }   
	   
	   
	   
	   
	   	   
	   
	   
	   
	
	}
}