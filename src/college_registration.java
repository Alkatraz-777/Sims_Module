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

public class college_registration {
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
	            "C:\\\\Users\\\\EKHOOL-253\\\\eclipse-workspace\\\\Sims_Module\\\\ChromeDriver\\\\chromedriver123\\\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    boolean loggedIn = false;
	    
	    while (true) { 
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
	        
	        
	        for (int i = 3; i <= 100; i++) {
	            driver.get("https://benil.sims.uat.ethiocheno.com/onlineadmission/addform");
	            Thread.sleep(2500);
	            
	            driver.findElement(By.xpath("//input[@id='admissionID']")).clear();
	            driver.findElement(By.xpath("//input[@id='admissionID']")).sendKeys(String.valueOf(i));
	            driver.findElement(By.xpath("//input[@id='phone1']")).sendKeys("916008638");
	            driver.findElement(By.xpath("//button[@id='getadmissionresult']")).click();
	            Thread.sleep(500);
	            WebElement image = driver.findElement(By.xpath("(//label[@for='newProfilePhoto'])[1]"));
	            image.click();

	            
	            String[] filepaths = {"logo", "logo1", "logo2", "logo3"}; // Add more file paths as needed

	            // Select a random file path from the array
	            Random random = new Random();
	            Robot rob = new Robot();
	            Actions action = new Actions(driver);
	            String filepath = filepaths[random.nextInt(filepaths.length)];

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

	            action.moveToElement(image).perform();
	            action.clickAndHold().moveByOffset(0, 30).release().perform();

	            Thread.sleep(1500);
	            driver.findElement(By.xpath("(//button[@id='cropBtn'])[1]")).click();
	        }
	    

	        
	        
	        
	        
	        
	        
	        
	    }  
	

      
    
	}


}

