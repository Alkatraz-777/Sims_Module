import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Sleeper;

public class College_application_form {
	
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
				"C:\\Users\\EKHOOL-253\\eclipse-workspace\\Sims_Module\\ChromeDriver\\chromedriver125\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		boolean loggedIn = false;
		for (int l = 0; l < 16; l++) {
			if (!loggedIn) {
			
			driver.get("https://benil.account.uat.ethiocheno.com/v3/signin?identifier=mail&client_id=Y1dzNjdJbE9SaXZsSWRHZU9HYWxwZz09&redirect_uri=https%3A%2F%2Fbenil.sims.uat.ethiocheno.com%2Fauthentication");
			
			Robot rob = new Robot();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("benil.resbee@gmail.com");
			driver.findElement(By.xpath("(//button[normalize-space()='Next'])[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("12345");
			driver.findElement(By.xpath("(//button[normalize-space()='Continue'])[1]")).click();
			Thread.sleep(2000);
			 loggedIn = true;
			}
			driver.get("https://benil.sims.uat.ethiocheno.com/onlineadmission/add");
			Thread.sleep(2500);
		//driver.get("https://kashmora.sims.uat.ethiocheno.com/frontend/page/apply-form");
		
		
		Actions action = new Actions(driver);
		
//		for (int i = 0; i < 2; i++) {
//
//			rob.keyPress(KeyEvent.VK_CONTROL);
//			rob.keyPress(KeyEvent.VK_MINUS);
//			rob.keyRelease(KeyEvent.VK_CONTROL);
//			rob.keyRelease(KeyEvent.VK_MINUS);
//		}
//		driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("altrin.resbee+201@gmail.com");
//		driver.findElement(By.xpath("(//button[normalize-space()='Next'])[1]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("Altrin@251443");
//		driver.findElement(By.xpath("(//button[normalize-space()='Continue'])[1]")).click();
//		Thread.sleep(2000);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//a[@id='modal-close-btn']//*[name()='svg']")).click();
		
		int numNames = 1;

		for (int i = 0; i < numNames; i++) {

			String firstName = getRandomFirstName();

			driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(firstName);

			Thread.sleep(250);
		
			for (int j = 0; j < numNames; j++) {

				String middlename = getRandomFirstName();

				driver.findElement(By.xpath("//input[@id='mname']")).sendKeys(middlename);

				Thread.sleep(250);
		}		
			for (int k = 0; k < numNames; k++) {

				String lastname = getRandomFirstName();

				
				driver.findElement(By.xpath("//input[@id='lname']")).sendKeys(lastname);

				Thread.sleep(250);
				
			}
			Robot rob = new Robot();
		driver.findElement(By.xpath("//span[@id='select2-sex-container']")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
//		List<String> names = Arrays.asList( "aldo", "tinolin", "abishek", "benjamin",
//                "asrai", "anishanth", "fathima", "najlafirthows", "monisha", "abiya",
//                "benil", "jenish", "vinoji", "subin",  "bincy", "jenish");
//
//        
//        int currentIndex = 0;
//
//     
//        for (int k = 0; k < names.size(); k++) {
//           
//            String name = names.get(currentIndex);
//
//            String emailAddress = name + ".resbee@gmail.com";
//
//            WebElement emailField = driver.findElement(By.id("email"));
//            emailField.clear();
//            emailField.sendKeys(emailAddress);
//
//
//            currentIndex = (currentIndex + 1) % names.size();
		
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("916008638");
		driver.findElement(By.xpath("//select[@id='currentsubcity']")).click();
		for (int j = 0; j < 3; j++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//select[@id='currentworeda']")).click();
		for (int j = 0; j < 7; j++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//input[@id='highschoolname']")).sendKeys("Amala Matric School");
		driver.findElement(By.xpath("//input[@id='mark1']")).sendKeys("40");
		driver.findElement(By.xpath("//input[@id='mark2']")).sendKeys("60");
		driver.findElement(By.xpath("//input[@id='mark3']")).sendKeys("35");
		driver.findElement(By.xpath("//input[@id='mark4']")).sendKeys("45");
		driver.findElement(By.xpath("//input[@id='mark5']")).sendKeys("68");
		driver.findElement(By.xpath("//input[@id='mark6']")).sendKeys("71");
		driver.findElement(By.xpath("//input[@id='mark7']")).sendKeys("53");
		
		driver.findElement(By.xpath("//input[@id='grade11value']")).sendKeys("60");
		driver.findElement(By.xpath("//input[@id='grade12value']")).sendKeys("48");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='applicationtype']")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='firstchoice']")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//select[@id='ocupationalone']")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//select[@id='firstchoice_level']")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//select[@id='secondchoice']")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//select[@id='ocupationaltwo']")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//select[@id='secondchoice_level']")).click();
		for (int j = 0; j < 2; j++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
			
		}
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//select[@id='thirdchoice']")).click();
		for (int j = 0; j < 1; j++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
			
		}
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//select[@id='ocupationalthree']")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		
		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		
		Thread.sleep(1500);
		for (int j = 0; j < 3; j++) {
			
		driver.findElement(By.xpath("//select[@id='thirdchoice_level']")).click();
		rob.keyPress(KeyEvent.VK_DOWN);
		
		rob.keyRelease(KeyEvent.VK_DOWN);
		}
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//input[@id='checkBoxterm']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='btnRegister']")).click();
		Thread.sleep(1000);
		
		
		
		
		}
		}
	}
	
		
	public static String getRandomFirstName() {
		Random random = new Random();
		int randomIndex = random.nextInt(FIRST_NAMES.length);
		return FIRST_NAMES[randomIndex];
	}	
}
