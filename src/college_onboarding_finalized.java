import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class college_onboarding_finalized {
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

		driver.get(
				"https://tvet-college.account.uat.ethiocheno.com/v3/signin?identifier=mail&client_id=ODhBWVdReUNXT1J2dHg5MUxHSkUwZz09&redirect_uri=https%3A%2F%2Ftvet-college.sims.uat.ethiocheno.com%2Fauthentication");
		driver.manage().window().maximize();
		Robot rob = new Robot();

		for (int i = 0; i < 2; i++) {

			rob.keyPress(KeyEvent.VK_CONTROL);
			rob.keyPress(KeyEvent.VK_MINUS);
			rob.keyRelease(KeyEvent.VK_CONTROL);
			rob.keyRelease(KeyEvent.VK_MINUS);
		}
		driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("abishek+tvetcollegeuat@resbee.org");
		driver.findElement(By.xpath("(//button[normalize-space()='Next'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("ekhool");
		driver.findElement(By.xpath("(//button[normalize-space()='Continue'])[1]")).click();
		Thread.sleep(2000);
		driver.get("https://tvet-college.account.uat.ethiocheno.com/directory/organization/create");
		Thread.sleep(2000);
		int numNames = 2;

		for (int i = 0; i < numNames; i++) {

			// random name create panra function ithu, array top la irukkum
			String firstName = getRandomFirstName();

			driver.findElement(By.xpath("(//input[@id='organization_name'])[1]")).sendKeys(firstName);

			Thread.sleep(250);
		}
		for (int j = 0; j < numNames; j++) {
			String firstName = getRandomFirstName();

			driver.findElement(By.xpath("(//input[@id='domain_name'])[1]")).sendKeys(firstName);
			Thread.sleep(250);

		}

		String code = collegecode();
		driver.findElement(By.xpath("(//input[@id='organization_code'])[1]")).sendKeys(code);

		int randomemailnumber = collegeemail(1, 1000);
		String email = collegeemail(randomemailnumber);
		driver.findElement(By.xpath("(//input[@id='organization_email'])[1]")).sendKeys(email);

		String randomMobileNumber = generateRandomMobileNumber();
		driver.findElement(By.xpath("(//input[@id='phone_number'])[1]")).sendKeys(randomMobileNumber);
		driver.findElement(By.xpath("(//input[@id='assign_organization_manager'])[1]")).sendKeys("abishek23");
		driver.findElement(By.xpath("(//input[@id='telephone'])[1]")).sendKeys("985214569");
		driver.findElement(By.xpath("//input[@id='if_renamed_previous_name']")).sendKeys("Sample");
		driver.findElement(By.xpath("//input[@id='year_of_establishment']")).sendKeys("05-05-2002");
		driver.findElement(By.xpath("//select[@id='ownership']")).click();
		
		for (int i = 0; i < 1; i++) {
			
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		}
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//select[@id='tvet_college_type']")).click();
		for (int i = 0; i < 4; i++) {
			
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
			}
			
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.keyRelease(KeyEvent.VK_ENTER);
	

		
		driver.findElement(By.xpath("//select[@id='city']")).click();
		for (int i = 0; i < 7; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);

		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//select[@id='sub_city']")).click();
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
		
		driver.findElement(By.xpath("//input[@id='college_website_NaN']")).sendKeys("https://xaviers.sims.uat.ethiocheno.com/");
		driver.findElement(By.xpath("//input[@id='facebook_NaN']")).sendKeys("https://facebook.com");
		driver.findElement(By.xpath("//input[@id='telegram_NaN']")).sendKeys("https://telegram.com");
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		String filepath = "logo";
		StringSelection stringSelection = new StringSelection(filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		Thread.sleep(3000);
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1500);
//		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='×'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='google_mapping']")).sendKeys("https://maps.app.goo.gl/mdf1c9nhcPs7DjK46");
		driver.findElement(By.xpath("//input[@id='latitude']")).sendKeys("8.248050");
		driver.findElement(By.xpath("//input[@id='longitude']")).sendKeys("8.248050");
		driver.findElement(By.xpath("//input[@id='global_position']")).sendKeys("Sample");
		driver.findElement(By.xpath("//input[@id='fax']")).sendKeys("+91 44 123 4567");
		driver.findElement(By.xpath("//input[@id='po_box']")).sendKeys("629175");
		driver.findElement(By.xpath("//input[@id='woreda_bureau_distance_in_km']")).sendKeys("20");
		driver.findElement(By.xpath("//input[@id='sub_city_bureau_distance']")).sendKeys("35");
		driver.findElement(By.xpath("//input[@id='next_college']")).sendKeys("100");
		driver.findElement(By.xpath("//button[@id='saveNextBtn']")).click();
		Thread.sleep(4000);
		
		//Training Informtion 	
		
		
//		driver.findElement(By.xpath("//select[@id='training_calendar_type']")).click();
//		rob.keyPress(KeyEvent.VK_DOWN);
//		rob.keyRelease(KeyEvent.VK_DOWN);
//		rob.keyPress(KeyEvent.VK_ENTER);
//		rob.keyRelease(KeyEvent.VK_ENTER);
	
		driver.findElement(By.xpath("//select[@id='training_start_month']")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//select[@id='training_ending_month']")).click();
		for (int i = 0; i <12 ; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//select[@id='inspection_level']")).click();
		for (int i = 0; i < 2; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		
		}
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	
		int loopcount = 4;
		for (int j = 0; j < loopcount; j++) {
			int down = j+1;
			driver.findElement(By.xpath("//ul[@class='select2-selection__rendered']")).click();
		for (int k = 0; k < down; k++) {
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		}
		
		
		driver.findElement(By.xpath("//span[normalize-space()='Available']")).click();
		driver.findElement(By.xpath("//select[@id='special_need_delivery_method']")).click();
		for (int i = 0; i < 3; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		
		}
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//button[@id='saveNextBtn']")).click();
		Thread.sleep(2000);
		
	
		// college Facility 
		
		
		driver.findElement(By.xpath("//select[@id='college_library']")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//select[@id='digital_library']")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//select[@id='virtual_labortory']")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//select[@id='training_centre_']")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//select[@id='ict_center']")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//select[@id='does_the_college_have_internet_NaN']")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//select[@id='digital_information_collection_facility']")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//select[@id='special_need_support_center_in_NaN']")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//select[@id='clinicfirst_aid_service_in_NaN']")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//button[@id='saveNextBtn']")).click();
		
	
	
	
	
	
	}

	public static String getRandomFirstName() {
		Random random = new Random();
		int randomIndex = random.nextInt(FIRST_NAMES.length);
		return FIRST_NAMES[randomIndex];
	}
	@BeforeClass
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

	public static String collegecode() {
		Random random = new Random();
		StringBuilder collegecode = new StringBuilder();
		collegecode.append(6);

		for (int i = 1; i < 5; i++) {
			collegecode.append(random.nextInt(10));
		}

		return collegecode.toString();
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
}