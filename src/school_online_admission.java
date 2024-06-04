import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class school_online_admission {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\EKHOOL-253\\eclipse-workspace\\Sims_Module\\ChromeDriver\\chromedriver123\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			

		driver.get("https://haja.sims.uat.ethiocheno.com/frontend/page/online-admission");
		driver.manage().window().maximize();
		Robot rob = new Robot();
		Actions action = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 0; i < 2; i++) {

			rob.keyPress(KeyEvent.VK_CONTROL);
			rob.keyPress(KeyEvent.VK_MINUS);
			rob.keyRelease(KeyEvent.VK_CONTROL);
			rob.keyRelease(KeyEvent.VK_MINUS);
		}
		Thread.sleep(2000);

		driver.findElement(By.xpath("//select[@id='shiftID']")).click();
		for (int i = 0; i < 1; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("(//select[@id='classesID'])[1]")).click();
		Thread.sleep(1500);
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
//			
//		WebElement image = driver.findElement(By.xpath("(//label[@for='newProfilePhoto'])[1]"));
//		image.click();
//		
//		String filepath = "logo";
//		StringSelection stringSelection = new StringSelection(filepath);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
//		Thread.sleep(3000);
//		rob.keyPress(KeyEvent.VK_CONTROL);
//		rob.keyPress(KeyEvent.VK_V);
//		rob.keyRelease(KeyEvent.VK_V);
//		rob.keyRelease(KeyEvent.VK_CONTROL);
//		rob.keyPress(KeyEvent.VK_ENTER);
//		rob.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(1500);
//		
//		action.moveToElement(image).perform();
//		action.clickAndHold().moveByOffset(0, 30).release().perform();
//		
//		Thread.sleep(1500);
//		driver.findElement(By.xpath("(//button[@id='cropBtn'])[1]")).click();
//		
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Altrin");
		driver.findElement(By.xpath("//input[@id='mname']")).sendKeys("clarke");
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Kent");
		
		driver.findElement(By.xpath("//select[@id='sex']")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		driver.findElement(By.xpath("//input[@id='calendar-type-switcher']")).click();
		driver.findElement(By.xpath("//span[@id='activeyear']")).click();
		driver.findElement(By.xpath("//button[@id='btnmonthprev']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//button[@id='btnmonthprev']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='1996']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Feb']")).click();
		driver.findElement(By.xpath("//button[@id='41']")).click();
		driver.findElement(By.xpath("//input[@id='fmothername']")).sendKeys("Mother");
		driver.findElement(By.xpath("//input[@id='mmothername']")).sendKeys("First");
		driver.findElement(By.xpath("//input[@id='lmothername']")).sendKeys("Name");
		driver.findElement(By.xpath("//select[@id='commencement']")).click();
		for (int i = 0; i < 4; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			
			rob.keyRelease(KeyEvent.VK_DOWN);
		}		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1500);
		 driver.findElement(By.xpath("(//div[@class='btn btn-upload rounded-0 rounded-end image-preview-input document-preview-input'])[1]")).click();
		
		String pdf = "sample";
		StringSelection string = new StringSelection(pdf);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string, null);
		Thread.sleep(3000);
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("(//div[@class='btn btn-upload rounded-0 rounded-end image-preview-input document-preview-input'])[1]")).click();
		String pdf1 = "sample";
		StringSelection string1 = new StringSelection(pdf1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string1, null);
		Thread.sleep(3000);
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//select[@id='birthsubcity']")).click();
		for (int i = 0; i < 4; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//select[@id='birthworeda']")).click();
		for (int i = 0; i < 8; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("(//input[@id='yes'])[1]")).click();
		driver.findElement(By.xpath("//textarea[@placeholder='Select']")).click();
		int numLoops = 3;

		for (int i = 1; i <= numLoops; i++) {
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.keyRelease(KeyEvent.VK_ENTER);

			int downArrowPressCount = (i == 2) ? 2 : (i == 3) ? 3 : 0;

			
			for (int j = 0; j < downArrowPressCount; j++) {
				rob.keyPress(KeyEvent.VK_DOWN);
				rob.keyRelease(KeyEvent.VK_DOWN);
				
			}
		}
		Thread.sleep(1500);
		driver.findElement(By.xpath("//select[@id='currentsubcity']")).click();
		for (int i = 0; i < 4; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//select[@id='currentworeda']")).click();
		for (int i = 0; i < 8; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//input[@id='houseno']")).sendKeys("6284A");
		
		String randomMobileNumber = generateRandomMobileNumber();
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(randomMobileNumber);
		
//		int randomemailnumber = collegeemail(1, 1000);
//		String email = collegeemail(randomemailnumber);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aldo.resbee@gmail.com");
		
		
//		WebElement image2 = driver.findElement(By.xpath("(//label[@for='newProfilePhoto2'])[1]"));
//		image2.click();
//		Thread.sleep(1500);
//		String filepath2 = "image";
//		StringSelection stringSelection2 = new StringSelection(filepath2);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection2, null);
//		Thread.sleep(1500);
//		rob.keyPress(KeyEvent.VK_CONTROL);
//		rob.keyPress(KeyEvent.VK_V);
//		rob.keyRelease(KeyEvent.VK_V);
//		rob.keyRelease(KeyEvent.VK_CONTROL);
//		rob.keyPress(KeyEvent.VK_ENTER);
//		rob.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(3000);
//		
//
//		driver.findElement(By.xpath("(//span[contains(text(),'Upload')])[6]")).click();
		
		driver.findElement(By.xpath("//input[@id='fparentname']")).sendKeys("Parents");
		driver.findElement(By.xpath("//input[@id='mparentname']")).sendKeys("Middle");
		driver.findElement(By.xpath("//input[@id='lparentname']")).sendKeys("Name");
		driver.findElement(By.xpath("//select[@id='parentsex']")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1500);
		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='parentdob']")).sendKeys("1966-2-7");
//		driver.findElement(By.xpath("//input[@id='calendar-type-switcher']")).click();
//		driver.findElement(By.xpath("//span[@id='activeyear']")).click();
//		for (int i = 0; i < 2; i++) {
//			driver.findElement(By.xpath("//button[@id='btnmonthprev']//*[name()='svg']")).click();
//		}
//		
//		driver.findElement(By.xpath("//button[normalize-space()='1966']")).click();
//		driver.findElement(By.xpath("//button[normalize-space()='Feb']")).click();
//		driver.findElement(By.xpath("//button[@id='41']")).click();
		
		driver.findElement(By.xpath("//select[@id='parentmaritalstatus']")).click();
		for (int i = 0; i < 2; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//input[@id='parentwork']")).sendKeys("Work sample");
		driver.findElement(By.xpath("//input[@id='parentworkingplace']")).sendKeys("workplace sample");
		driver.findElement(By.xpath("//input[@id='parentemail']")).sendKeys("aldo.resbee@gmail.com");
		String randomMobileNumber1 = generateRandomMobileNumber();
		driver.findElement(By.xpath("//input[@id='parentphno']")).sendKeys(randomMobileNumber1);
		
		driver.findElement(By.xpath("(//div[@class='btn btn-upload rounded-0 rounded-end image-preview-input document-preview-input'])[2]")).click();
		String parentpdf = "sample";
		StringSelection string2 = new StringSelection(parentpdf);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string2, null);
		Thread.sleep(3000);
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		
		driver.findElement(By.xpath("//select[@id='parentcurrentsubcity']")).click();
		for (int i = 0; i < 4; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//select[@id='parentcurrentworeda']")).click();
		for (int i = 0; i < 8; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//input[@id='parenthouseno']")).sendKeys("855A");
		
		driver.findElement(By.xpath("(//select[@id='paymentmethod'])[1]")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(500);
		String banjreceipt = "sample";
		StringSelection string3 = new StringSelection(banjreceipt);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string3, null);
		Thread.sleep(3000);
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		
		driver.findElement(By.xpath("//button[@id='btnRegister']")).click();
		
		
		
		
	
		
	
	}	
	public static String generateRandomMobileNumber() {
		Random random = new Random();
		StringBuilder mobileNumber = new StringBuilder();

		// create panra mobile number 9 series la start aganum... athukaana function
		// ithu
		mobileNumber.append(9);

		// 9 digit number create panra loop ithu thn
		for (int i = 1; i < 9; i++) {
			mobileNumber.append(random.nextInt(10));
		}

		return mobileNumber.toString();
	}
	public static int collegeemail(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min + 1) + min;
	}

	public static String collegeemail(int number) {
		String baseEmail = "altrin.resbee+";
		String domain = "@gmail.com";

		// base email ah ipdi thn create pannanum
		String email = baseEmail + number + domain;

		return email.toString();
	}
	
	
}
	