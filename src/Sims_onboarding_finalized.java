import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sims_onboarding_finalized {
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
				"C:\\Users\\EKHOOL-253\\eclipse-workspace\\Sims_Module\\chrome driver 122\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		
		driver.get("https://aaeb-school.account.uat.ethiocheno.com/v3/signin?identifier=mail&client_id=QjhDdTVwcGtoTUd5enFVbGJJSHFvdz09&redirect_uri=https%3A%2F%2Faaeb-school.sims.uat.ethiocheno.com%2Fauthentication");
		driver.manage().window().maximize();
		Robot rob = new Robot();

		for (int i = 0; i < 2; i++) {

			rob.keyPress(KeyEvent.VK_CONTROL);
			rob.keyPress(KeyEvent.VK_MINUS);
			rob.keyRelease(KeyEvent.VK_CONTROL);
			rob.keyRelease(KeyEvent.VK_MINUS);
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("admin@tria.plc");
		driver.findElement(By.xpath("(//button[normalize-space()='Next'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("123456ab");
		driver.findElement(By.xpath("(//button[normalize-space()='Continue'])[1]")).click();
		Thread.sleep(2000);
		driver.get("https://aaeb-school.account.uat.ethiocheno.com/directory/organization/create");
		Thread.sleep(2000);

		int numNames = 2;

		for (int i = 0; i < numNames; i++) {

			
			String firstName = getRandomFirstName();

			driver.findElement(By.xpath("(//input[@id='organization_name'])[1]")).sendKeys(firstName);

			Thread.sleep(250);
		}
		for (int j = 0; j < numNames; j++) {
			String firstName = getRandomFirstName();

			driver.findElement(By.xpath("(//input[@id='domain_name'])[1]")).sendKeys(firstName);
			Thread.sleep(250);

		}

		String schoolcode = schoolcode();
		driver.findElement(By.xpath("(//input[@id='organization_code'])[1]")).sendKeys(schoolcode);

		int randomemailnumber = schoolemail(1, 1000);
		String email = schoolemail(randomemailnumber);
		driver.findElement(By.xpath("(//input[@id='organization_email'])[1]")).sendKeys(email);

		String randomMobileNumber = generateRandomMobileNumber();
		driver.findElement(By.xpath("(//input[@id='phone_number'])[1]")).sendKeys(randomMobileNumber);
		driver.findElement(By.xpath("(//input[@id='assign_organization_manager'])[1]")).sendKeys("abishek23");
		driver.findElement(By.xpath("(//input[@id='telephone'])[1]")).sendKeys("985214569");
		driver.findElement(By.xpath("//input[@id='if_school_is_renamed_enter_previous_name']")).sendKeys("Sample");
		driver.findElement(By.xpath("//input[@id='year_of_establishment_']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@id='22']")).click();
//		Thread.sleep(1500);
//		driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M560-253.8')]")).click();
//		
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//ul[@class='select2-selection__rendered'])[1]")).click();
		Thread.sleep(10000);
//		for (int j = 0; j < 3; j++) {
//			
//		
//		for (int i = 0; i < 3; i++) {
//
//			rob.keyPress(KeyEvent.VK_DOWN);
//			rob.keyRelease(KeyEvent.VK_DOWN);
//		}
//		rob.keyPress(KeyEvent.VK_ENTER);
//		rob.keyRelease(KeyEvent.VK_ENTER);
//		}
//		Thread.sleep(1000);
		driver.findElement(By.xpath("(//select[@id='school_type_'])[1]")).click();
		for (int i = 0; i < 4; i++) {

			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("//select[@id='ownership']")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("//select[@id='school_category_']")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("//select[@id='city_']")).click();
		for (int i = 0; i < 7; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);

		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//select[@id='sub_city_']")).click();
		for (int i = 0; i < 12; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("//select[@id='woreda']")).click();
		for (int i = 0; i < 9; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);

		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("//input[@id='google_mapping_']"))
				.sendKeys("https://maps.app.goo.gl/mdf1c9nhcPs7DjK46");
		driver.findElement(By.xpath("//input[@id='latitude']")).sendKeys("8.248050");
		driver.findElement(By.xpath("//input[@id='longitude']")).sendKeys("8.248050");
		driver.findElement(By.xpath("//input[@id='global_postion']")).sendKeys("Sample");
		driver.findElement(By.xpath("//input[@id='fax']")).sendKeys("+91 44 123 4567");
		driver.findElement(By.xpath("//input[@id='po_box']")).sendKeys("629175");
		driver.findElement(By.xpath("//input[@id='woreda_education_bureakm']")).sendKeys("10");
		driver.findElement(By.xpath("//input[@id='sub_city_education_bureakm']")).sendKeys("20");
		driver.findElement(By.xpath("//select[@id='lease_status_of_school_building']")).click();
		for (int i = 0; i < 2; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

		Robot robot = new Robot();
		String filepath = "sample";
		StringSelection stringSelection = new StringSelection(filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//input[@id='size_of_school_area']")).sendKeys("55000 square meter");
		driver.findElement(By.xpath("//input[@id='size_of_school_compound']")).sendKeys("100 Acres");
		driver.findElement(By.xpath("//button[@id='saveNextBtn']")).click();
		Thread.sleep(3000);

		// Academic Information

//		driver.findElement(By.xpath("//select[@id='academic_calendar_type_']")).click();
//		rob.keyPress(KeyEvent.VK_DOWN);
//		rob.keyRelease(KeyEvent.VK_DOWN);
//		rob.keyPress(KeyEvent.VK_ENTER);
//		rob.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//select[@id='academic_start_month_'])[1]")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("(//select[@id='academic_end_month_'])[1]")).click();
		for (int i = 0; i < 12; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(10000);
//		Thread.sleep(1000);
//		rob.keyPress(KeyEvent.VK_TAB);
//		rob.keyRelease(KeyEvent.VK_TAB);
//		rob.keyPress(KeyEvent.VK_ENTER);
//		rob.keyRelease(KeyEvent.VK_ENTER);
//
//		rob.keyPress(KeyEvent.VK_ENTER);
//		rob.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("//select[@id='inspection_level_']")).click();
		for (int i = 0; i < 3; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);

		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("(//span[@class='label-text'][normalize-space()='No'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='label-text'][normalize-space()='Yes'])[1]")).click();
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		String filepath1 = "sample";
		StringSelection stringSelection1 = new StringSelection(filepath1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);

		Thread.sleep(3000);
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);

		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='×'])[2]")).click();

		driver.findElement(By.xpath("//div[@id='fieldCont_9']//span[@class='label-text'][normalize-space()='No']"))
				.click();
		driver.findElement(By.xpath("//div[@id='fieldCont_11']//span[@class='label-text'][normalize-space()='No']"))
				.click();
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);

		// first variable create pannanum
		int numLoops = 4;

		for (int i = 1; i <= numLoops; i++) {
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.keyRelease(KeyEvent.VK_ENTER);

			int downArrowPressCount = (i == 2) ? 2 : (i == 3) ? 3 : 0;

			// Press the down arrow key the specified number of times
			for (int j = 0; j < downArrowPressCount; j++) {
				rob.keyPress(KeyEvent.VK_DOWN);
				rob.keyRelease(KeyEvent.VK_DOWN);
			}
		}

		driver.findElement(By.xpath("(//select[@id='if_available_special_need_delivery_method'])[1]")).click();
		for (int i = 0; i < 3; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("(//select[@id='special_need_support_center'])[1]")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='label-text'][normalize-space()='No'])[5]")).click();
		driver.findElement(By.xpath("(//button[normalize-space()='Save & Next'])[1]")).click();

		// School Facility Availability
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='school_library']")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//select[@id='digital_library']")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//select[@id='virtual_library']")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("(//select[@id='training_center'])[1]")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("(//select[@id='ict_center'])[1]")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//select[@id='digital_information_collection_facility_']")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("//input[@id='school_wesite_url']"))
				.sendKeys("https://sample_school.sims.uat.ethiocheno.com");
		driver.findElement(By.xpath("//input[@id='school_facebook_NaN']")).sendKeys("https://facebook.com");
		driver.findElement(By.xpath("//input[@id='telegram__channel']")).sendKeys("https://telegram.com");
		driver.findElement(By.xpath("//input[@id='school_twitter_NaN']")).sendKeys("https://twitter.com");
		driver.findElement(By.xpath("//input[@id='school_youtube_NaN']")).sendKeys("https://youtube.com");
		driver.findElement(By.xpath("//button[@id='saveNextBtn']")).click();

	}

	public static String getRandomFirstName() {
		Random random = new Random();
		int randomIndex = random.nextInt(FIRST_NAMES.length);
		return FIRST_NAMES[randomIndex];
	}

	public static int schoolemail(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min + 1) + min;
	}

	public static String schoolemail(int number) {
		String baseEmail = "altrin.resbee+";
		String domain = "@gmail.com";

		// base email ah ipdi thn create pannanum
		String email = baseEmail + number + domain;

		return email.toString();
	}

	public static String schoolcode() {
		Random random = new Random();
		StringBuilder schoolcode = new StringBuilder();
		schoolcode.append(6);

		for (int i = 1; i < 5; i++) {
			schoolcode.append(random.nextInt(10));
		}

		return schoolcode.toString();
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

	public class MouseClickHelper {
		private WebDriver driver;
		private Actions actions;

		public MouseClickHelper(WebDriver driver) {
			this.driver = driver;
			this.actions = new Actions(driver);
		}

		public void clickElement(WebElement element) {
			actions.click(element).build().perform();
		}

	}
}
