import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class LM_school {
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
			"Emily", "Liam", "Oliver", "Mason", "Harper", "Grace", "Evelyn", "Lily", "Henry", "Mia", "Liam", "Amelia",
			"Ella", "James", "Harper", "Oliver", "Charlotte", "Lucy", "Emma", "Mason", "Sophia", "Olivia", "Ella",
			"Ava", "Oliver", "Liam", "Sophie", "Eva", "James", "Emma", "Lily", "Henry", "Aiden", "Charlotte", "Amelia",
			"Jack", "Evelyn", "Liam", "Mason", "Ava", "Nora", "Grace", "Sophia", "Ella", "Emily", "Ella", "Evelyn",
			"Mia", "Oliver", "Charlotte", "Sophie", "Liam", "James", "Lucas", "Harper", "Aiden", "Eva", "Ella",
			"Sophia", "Nora", "Gregory", "Layla", "Sophie", "Jacek", "Aeiden", "Lieam", "Eella", "Graece", "Luecas",
			"Elela", "Norea", "eSophie", "Emiely", "Leieam", "Olivere", "Meason", "Haerper", "Greace", "Eevelyn",
			"Liely", "Henrye", "eMia", "Lieam", "Ameelia", "Elela", "Jaemes", "Hareper", "Oliveer", "Charlottee",
			"Lucey", "Emmea", "Masoen", "Sopheia", "Oleivia", "Eella", "Aeva", "Oliveer", "Liame", "Soephie", "eEva",
			"Jaemes", "eEmma", "Liely", "Heenry", "Aeiden", "Charloette", "Ameelia", "Jaeck", "Eveelyn", "Leiam",
			"Maseon", "Avea", "Norea", "Greace", "Seophia", "Eella", "Eemily", "Eella", "Eevelyn", "Meia", "Oleiver",
			"Chearlotte", "Sophiee", "Lisam", "Jamers", "Lucras", "Harperr", "Aideen", "Evalyn", "Ellias", "Sophi",
			"Nova"

	};

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\EKHOOL-253\\\\eclipse-workspace\\\\Sims_Module\\\\ChromeDriver\\\\chromedriver123\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://haja.account.uat.ethiocheno.com/v3/signin?identifier=mail&client_id=dU5vWVk0K05TUmxDeDhxWUNGTDNBQT09&redirect_uri=https%3A%2F%2Fhaja.sims.uat.ethiocheno.com%2Fauthentication");
		Robot rob = new Robot();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("altrin.resbee+81101@gmail.com");
		driver.findElement(By.xpath("(//button[normalize-space()='Next'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("12345");
		driver.findElement(By.xpath("(//button[normalize-space()='Continue'])[1]")).click();
	    Thread.sleep(2000);
	    driver.get("https://haja.sims.uat.ethiocheno.com/library/members");
	    driver.findElement(By.xpath(""));
	    
	            
	        
	        }
	    }
	            
	            
	            