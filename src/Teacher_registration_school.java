import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;

public class Teacher_registration_school {
	private static final String[] FIRST_NAMES = { "John", "Alice", "Bob", "Eva", "Michael", "Sophia", "David", "Olivia",
			"Daniel", "Emily", "Johnson", "Jennifer", "Anderson", "Martinez", "Lisa", "William", "Ava", "James",
			"Charlotte", "Joseph", "Amelia", "Robert", "Lily", "Emma", "Grace", "Charles", "Chloe", "Mary", "Abigail",
			"Matthew", "Harper", "Karen", "Ella", "Thomas", "Sofia", "Elizabeth", "Mia", "Andrew", "Victoria", "Susan",
			"Scarlett", "George", "Avery", "Linda", "Evelyn", "Richard", "Madison", "Nancy", "Zoe", "Steven", "Emily",
			"Deborah", "Eleanor", "Edward", "Grace", "Catherine", "Lucy", "Donald", "Ruby", "Barbara", "Hannah",
			"Daniel", "Mila", "Patricia", "Natalie", "Kevin", "Lillian", "Laura", "Eli", "Anna", "Katherine", "Aria",
			"Ryan", "Hailey", "Jessica", "Leah", "Jeffrey", "Bella", "Dorothy", "Stella", "Dennis", "Aurora", "Rachel",
			"Maya", "Kenneth", "Nova", "Rebecca", "Paisley", "Larry", "Zara", "Megan", "Isla", "Frank", "Elena", "Tina",
			"Luna", "Philip", "Isabel", "Brenda", "Ellie", "Janet", "Violet", "Ronald", "Camila", "Sara", "Penelope",
			"Gregory", "Layla", "Sophie", "Jack", "Aiden", "Liam", "Ella", "Grace", "Lucas", "Ella", "Nora", "Sophie",
		    "Emily", "Liam", "Oliver", "Mason", "Harper", "Grace", "Evelyn", "Lily", "Henry", "Mia",
		    "Liam", "Amelia", "Ella", "James", "Harper", "Oliver", "Charlotte", "Lucy", "Emma", "Mason",
		    "Sophia", "Olivia", "Ella", "Ava", "Oliver", "Liam", "Sophie", "Eva", "James", "Emma",
		    "Lily", "Henry", "Aiden", "Charlotte", "Amelia", "Jack", "Evelyn", "Liam", "Mason", "Ava",
		    "Nora", "Grace", "Sophia", "Ella", "Emily", "Ella", "Evelyn", "Mia", "Oliver", "Charlotte",
		    "Sophie", "Liam", "James", "Lucas", "Harper", "Aiden", "Eva", "Ella", "Sophia", "Nora",
		    "Gregory", "Layla", "Sophie", "Jacek", "Aeiden", "Lieam", "Eella", "Graece", "Luecas", "Elela", "Norea", "eSophie",
		    "Emiely", "Leieam", "Olivere", "Meason", "Haerper", "Greace", "Eevelyn", "Liely", "Henrye", "eMia",
		    "Lieam", "Ameelia", "Elela", "Jaemes", "Hareper", "Oliveer", "Charlottee", "Lucey", "Emmea", "Masoen",
		    "Sopheia", "Oleivia", "Eella", "Aeva", "Oliveer", "Liame", "Soephie", "eEva", "Jaemes", "eEmma",
		    "Liely", "Heenry", "Aeiden", "Charloette", "Ameelia", "Jaeck", "Eveelyn", "Leiam", "Maseon", "Avea",
		    "Norea", "Greace", "Seophia", "Eella", "Eemily", "Eella", "Eevelyn", "Meia", "Oleiver", "Chearlotte",
		    "Sophiee", "Lisam", "Jamers", "Lucras", "Harperr", "Aideen", "Evalyn", "Ellias", "Sophi", "Nova"

	};
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\EKHOOL-253\\\\eclipse-workspace\\\\Sims_Module\\\\chrome driver 122\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://tinolin.account.uat.ethiocheno.com/v3/signin?identifier=mail&client_id=N1E2eCsxY1ZxUWY5L0t3SnA2Wksrdz09&redirect_uri=https%3A%2F%2Ftinolin.sims.uat.ethiocheno.com%2Fauthentication");
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
		driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("altrin.resbee+789@gmail.com");
		driver.findElement(By.xpath("(//button[normalize-space()='Next'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("dvkQhErs");
		driver.findElement(By.xpath("(//button[normalize-space()='Continue'])[1]")).click();
		Thread.sleep(2000);
		
		driver.get("https://tinolin.account.uat.ethiocheno.com/manage/directory/users/create?detail=eyJwcm9kdWN0IjoiYWNjb3VudHMiLCJjYWxsYmFja1BhdGgiOiIvbWFuYWdlL2RpcmVjdG9yeS91c2Vycz9yb2xlaWQ9YjA5UlRsUnBVVXhLUVVodFNUWnBhbEptVG1ORFFUMDkiLCJyb2xlSWQiOjN9");
		Thread.sleep(2000);
		
	
		int numNames = 1;

		for (int i = 0; i < numNames; i++) {

			// random name create panra function ithu, array top la irukkum
			String firstName = getRandomFirstName();

			driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(firstName);

			Thread.sleep(250);
		}
		for (int j = 0; j < numNames; j++) {
			String firstName = getRandomFirstName();

			driver.findElement(By.xpath("//input[@id='middle_name']")).sendKeys(firstName);
			Thread.sleep(250);

		}
		for (int i = 0; i < numNames; i++) {
			String firstName = getRandomFirstName();
			driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys(firstName);
			Thread.sleep(250);
		}
	
		driver.findElement(By.xpath("//input[@id='date_of_birth']")).sendKeys("1996-2-21");
		driver.findElement(By.xpath("//select[@id='gender']")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//select[@id='nationality']")).click();
		for (int i = 0; i < 8; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//input[@id='tin_number']")).sendKeys("85594");
		driver.findElement(By.xpath("//span[normalize-space()='No']")).click();
//		driver.findElement(By.xpath("//span[normalize-space()='Yes']")).click();
		
		
//		driver.findElement(By.xpath("//ul[@class='select2-selection__rendered']")).click();
//		
//		int numLoops = 3;
//
//		for (int i = 1; i <= numLoops; i++) {
//			rob.keyPress(KeyEvent.VK_ENTER);
//			rob.keyRelease(KeyEvent.VK_ENTER);
//
//			int downArrowPressCount = (i == 2) ? 2 : (i == 3) ? 3 : 0;
//
//			
//			for (int j = 0; j < downArrowPressCount; j++) {
//				rob.keyPress(KeyEvent.VK_DOWN);
//				rob.keyRelease(KeyEvent.VK_DOWN);
//				
//			}
//		}

		WebElement housenum = driver.findElement(By.xpath("(//input[@id='house_number'])[1]"));
//		housenum.click();
		housenum.sendKeys("35968");
		
		driver.findElement(By.xpath("//select[@id='status_of_employee_housing']")).click();
		for (int i = 0; i < 2; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//button[@id='saveNextBtn']")).click();
		Thread.sleep(3000);
		// Family Information 
		
		driver.findElement(By.xpath("//select[@id='marital_status']")).click();
		for (int i = 0; i < 3; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
//		driver.findElement(By.xpath("(//input[@id='upload_marriage_NaN'])[1]")).click();
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
		
		driver.findElement(By.xpath("//div[@class='modal-dialog modal-lg']//button[@type='button'][normalize-space()='×']")).click();
		
		int numNames2 = 1;

		for (int i = 0; i < numNames2; i++) {

			// random name create panra function ithu, array top la irukkum
			String firstName = getRandomFirstName();

			driver.findElement(By.xpath("//input[@id='if_married_hushbandwife_first_NaN']")).sendKeys(firstName);

			Thread.sleep(250);
		}
		for (int j = 0; j < numNames2; j++) {
			String firstName = getRandomFirstName();

			driver.findElement(By.xpath("//input[@id='middle_name________']")).sendKeys(firstName);
			Thread.sleep(250);

		}
		for (int i = 0; i < numNames2; i++) {
			String firstName = getRandomFirstName();
			driver.findElement(By.xpath("//input[@id='last_NaN']")).sendKeys(firstName);
			Thread.sleep(250);
		}
	
		
		driver.findElement(By.xpath("//input[@id='year_of_marriage']")).sendKeys("2014-4-17");
		driver.findElement(By.xpath("//span[@class='checkbox-material']")).click();
		
		int numNames3 = 1;

		for (int i = 0; i < numNames3; i++) {

			// random name create panra function ithu, array top la irukkum
			String firstName = getRandomFirstName();

			driver.findElement(By.xpath("//input[@id='mothers_first_NaN']")).sendKeys(firstName);

			Thread.sleep(250);
		}
		for (int j = 0; j < numNames3; j++) {
			String firstName = getRandomFirstName();

			driver.findElement(By.xpath("//input[@id='middle_name']")).sendKeys(firstName);
			Thread.sleep(250);

		}
		for (int i = 0; i < numNames3; i++) {
			String firstName = getRandomFirstName();
			driver.findElement(By.xpath("//input[@id='last_name_NaN']")).sendKeys(firstName);
			Thread.sleep(250);
		}
		
		driver.findElement(By.xpath("//button[@id='saveNextBtn']")).click();
		Thread.sleep(3000);
		// Emergency Responder 
		
		int numNames4 = 1;
		for (int i = 0; i < numNames4; i++) {

			// random name create panra function ithu, array top la irukkumX
			String firstName = getRandomFirstName();

			driver.findElement(By.xpath("//input[@id='__first_name']")).sendKeys(firstName);

			Thread.sleep(250);
		}
		for (int j = 0; j < numNames4; j++) {
			String firstName = getRandomFirstName();

			driver.findElement(By.xpath("//input[@id='emergency_responder_middle_name']")).sendKeys(firstName);
			Thread.sleep(250);

		}
		for (int i = 0; i < numNames4; i++) {
			String firstName = getRandomFirstName();
			driver.findElement(By.xpath("//input[@id='_last_NaN']")).sendKeys(firstName);
			Thread.sleep(250);
		}
		
		driver.findElement(By.xpath("//select[@id='relationship']")).click();
		for (int i = 0; i <3 ; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//select[@id='region_2']")).click();
		for (int i = 0; i <10 ; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//select[@id='zone_1']")).click();
		for (int i = 0; i < 8; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//select[@id='woreda_2']")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	
		driver.findElement(By.xpath("//input[@id='kebele_1']")).sendKeys("Sample kebele");
		String randomMobileNumber = generateRandomMobileNumber();
		driver.findElement(By.xpath("//input[@id='phone_NaN']")).sendKeys(randomMobileNumber);
		
		driver.findElement(By.xpath("//input[@id='warranty_person_first_name']")).sendKeys("Sample first Name ");
		driver.findElement(By.xpath("//input[@id='warranty_person_middle_name']")).sendKeys("Sample middle name");
		driver.findElement(By.xpath("//input[@id='warranty_person_last_name']")).sendKeys("sample last name");
		
		driver.findElement(By.xpath("//select[@id='region']")).click();
		for (int i = 0; i < 11 ; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//select[@id='zone']")).click();
		for (int i = 0; i < 8 ; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//select[@id='woreda']")).click();
		for (int i = 0; i < 7 ; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//input[@id='kebele']")).sendKeys("Sample kebele");
		driver.findElement(By.xpath("//input[@id='phone_number_']")).sendKeys(randomMobileNumber);
		
		// Education 
		
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		
		
		
		}	
		
	

	public static String getRandomFirstName() {
		Random random = new Random();
		int randomIndex = random.nextInt(FIRST_NAMES.length);
		return FIRST_NAMES[randomIndex];
	}

	public static String generateRandomMobileNumber() {
		Random random = new Random();
		StringBuilder mobileNumber = new StringBuilder();

	
		mobileNumber.append(9);


		for (int i = 1; i < 9; i++) {
			mobileNumber.append(random.nextInt(10));
		}

		return mobileNumber.toString();
	}


	@BeforeClass
	public static int teacheremail(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min + 1) + min;
	}

	public static String collegeemail(int number) {
		String baseEmail = "altrin.resbee+";
		String domain = "@gmail.com";

		
		String email = baseEmail + number + domain;

		return email.toString();
	}






}