import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class LMS_dashboard {
	public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\\\Users\\\\EKHOOL-253\\\\eclipse-workspace\\\\Sims_Module\\\\ChromeDriver\\\\chromedriver\\\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();

	driver.get("https://misrak-college.sims.uat.ethiocheno.com/");
	driver.manage().window().maximize();
	Robot rob = new Robot();
	
	BaseClass.clickElement(driver, "//a[normalize-space()='Login']");
	Thread.sleep(3000);
	BaseClass.sendKeysToElement(driver, "//input[@id='email']", "abishek+misrakcollegeuat@resbee.org");
	BaseClass.clickElement(driver, "//button[@id='SubmitBtn']");
	BaseClass.sleep(2000);
	BaseClass.sendKeysToElement(driver, "//input[@id='password']", "ekhool");
	driver.get("https://misrak-college.lms.uat.ethiocheno.com/admin");
	BaseClass.sleep(3000);
	driver.get("https://misrak-college.lms.uat.ethiocheno.com/admin/program/");
	BaseClass.clickElement(driver, "//select[@id='category_filter']");
	
	for (int j = 0; j < 3; j++) {
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
	}
	rob.keyPress(KeyEvent.VK_ENTER);
	rob.keyRelease(KeyEvent.VK_ENTER);
	
	BaseClass.sleep(1500);
	
	BaseClass.sendKeysToElement(driver, "//input[@id='program_keyword']", "electr");
	BaseClass.sleep(2000);
	for (int j = 0; j < 3; j++) {
	BaseClass.clickElement(driver, "//div[@class='btn-group checkbox check-all']//span[@class='checkbox-material']");
	BaseClass.clickElement(driver, "//span[@id='activeFilter']");
	BaseClass.clickElement(driver, "//a[@id='filer_dropdown_list_inactive']");
	BaseClass.clickElement(driver, "//button[@id='filter_program_dropdown_txt']");
	BaseClass.clickElement(driver, "//a[@id='filer_dropdown_list_active']");
	
	BaseClass.clickElement(driver, "//button[@type='button test']//*[name()='svg']");
	int numberOfRuns = 5; // 

    for (int i = 0; i < numberOfRuns; i++) {
        String courseName = generateRandomCourseName();
        System.out.println("Generated Course Name: " + courseName);
	
    }
	}
}
	 private static String generateRandomCourseName() {
	        int length = 10;
	        boolean useLetters = true;

	        return RandomStringUtils.random(length, useLetters, !useLetters);
	    }
	

	}