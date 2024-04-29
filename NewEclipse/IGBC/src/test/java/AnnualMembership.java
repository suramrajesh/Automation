import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AnnualMembership {
	WebDriver driver = new ChromeDriver();

	@Test(priority = 0)
	public void Login() throws InterruptedException {
		// Login
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		// enter email address
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rajeshsuram@yopmail.com");
		Thread.sleep(2000);
		// enter password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("IgbcPwd@1234", Keys.ENTER);
		Thread.sleep(2000);
	}

	@Test(priority = 1)
	public void MyprojectsTabclickonit() throws InterruptedException {
		// My projects click on it
		driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div/div[1]/div[6]/div/a/div/h6")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void Filters() throws InterruptedException {
		// Filters
		// Project ID Search on it
		/*
		 * driver.findElement(By.xpath("//input[@id='projectid']")).sendKeys(
		 * "IGBCGH240113"); Thread.sleep(2000); // Action(search on it)
		 * driver.findElement(By.xpath(
		 * "//body/div[@id='main-wrapper']/div[3]/div[1]/div[3]/div[1]/section[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[8]/div[1]/button[1]/i[1]"
		 * )).click(); Thread.sleep(2000);
		 */
		// Apply for Certificate Button click on it
		driver.findElement(By.xpath("//a[contains(text(),'Apply for Certificate')]")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);

	}

	@Test(priority = 3)
	public void projectinformation1ststep() throws InterruptedException {
		// 1st step Project information
		// Additional Information
		// Select certification Type
		// Pre-Certification
		driver.findElement(By.xpath("//label[contains(text(),'Pre-Certification')]")).click();
		// Additional Buildings information
		driver.findElement(By.id("building_area0")).sendKeys("21000");
		driver.findElement(By.id("building_area1")).sendKeys("19000");
		driver.findElement(By.id("building_area2")).sendKeys("14000");
		driver.findElement(By.id("building_area3")).sendKeys("12990");
		driver.findElement(By.id("building_area4")).sendKeys("1");
		driver.findElement(By.id("building_area5")).sendKeys("2");
		Thread.sleep(2000);
		// Total Built-up area In sq.m
		driver.findElement(By.id("totalarea_sqm")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("totalarea_sqm")).sendKeys("66993");
		Thread.sleep(2000);
		// Save & Continue button click on it
		driver.findElement(By.xpath("//span[contains(text(),'Save & Continue')]")).click();
		Thread.sleep(3000);

	}

	@Test(priority = 4)
	public void FeeDetails2ndstep() throws InterruptedException, AWTException {
		// 2nd step Fee Details
		// Enter the Organization
		driver.findElement(By.id("invoice_organization")).sendKeys("Mirakitech");
		// Select Country
		driver.findElement(By.xpath("//span[@id='select2-invoice_country-container']")).click();
		// Enter the Country Name
		driver.findElement(By.xpath("//body/span[1]/span[1]/span[1]/input[1]")).sendKeys("India");
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		// Select State
		driver.findElement(By.xpath("//span[contains(text(),'Search for state')]")).click();
		Thread.sleep(2000);
		// Enter the State Name
		driver.findElement(By.xpath("//body/span[1]/span[1]/span[1]/input[1]")).sendKeys("A", Keys.ENTER);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		// Select City
		driver.findElement(By.xpath("//span[@id='select2-invoice_city-container']")).click();
		Thread.sleep(2000);
		// Enter the City Name
		driver.findElement(By.xpath("//body/span[1]/span[1]/span[1]/input[1]")).sendKeys("A");
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		// Address Line1
		driver.findElement(By.id("invoice_address1")).sendKeys("Hitech city");
		// Address Line2
		driver.findElement(By.id("invoice_address2")).sendKeys("Prakash Nagar");
		// Pin code
		driver.findElement(By.id("invoice_pincode")).sendKeys("515571");
		// Having GST Number
		driver.findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/div[3]/div[1]/section[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/label[1]")).click();
		// GST Number
		driver.findElement(By.id("gstnumber")).sendKeys("37AAAAA0000A1Z3");
		// Project falls Under SEZ Category?
		driver.findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/div[3]/div[1]/section[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[4]/div[1]/div[1]/div[1]/label[1]")).click();
		// Upload SEZ Certificate(Yes)Below document will be upload it.
		WebElement fileInput = driver.findElement(By.xpath("//input[@id='sezfile']"));
		Thread.sleep(2000);
		fileInput.sendKeys("C:\\Users\\ADMIN\\Downloads\\selenium.pdf");
		// Deduct TDS @ 10 % ?
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/div[3]/div[1]/section[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[5]/div[1]/div[1]/div[1]/label[1]")).click();
		Thread.sleep(2000);
		// If Advance Tax Invoice is required ?Yes
		driver.findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/div[3]/div[1]/section[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/div[1]/label[1]")).click();
		// Upload Purchase Order / Work Order
		Thread.sleep(3000);
		WebElement fileInput1 = driver.findElement(By.xpath("//input[@id='uploadpo']"));
		Thread.sleep(2000);
		fileInput1.sendKeys("C:\\Users\\ADMIN\\Downloads\\selenium.pdf");
		Thread.sleep(2000);
		// Save & Continue
		driver.findElement(By.xpath("//span[contains(text(),'Save & Continue')]")).click();
		Thread.sleep(2000);

	}

	@Test(priority = 5)
	public void Payment3rdstep() throws InterruptedException {
		// 3rd step Payment
		// Offline Payment
		// Payment Type click on it
		driver.findElement(By.id("select2-offline_payment_type-container")).click();
		Thread.sleep(2000);
		// Enter the Payment Type
		driver.findElement(By.xpath("//body/div[@id='main-wrapper']/div[3]/div[1]/div[3]/div[1]/section[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[2]/span[1]/span[1]/input[1]")).sendKeys("D", Keys.ENTER);
		Thread.sleep(2000);
		// DD/ Cheque/UTR Number
		driver.findElement(By.id("check_or_dd_number")).sendKeys("poesqnewigbc123");
		// Bank
		driver.findElement(By.id("bank_name")).sendKeys("ICICI");
		// Branch
		driver.findElement(By.id("branch")).sendKeys("Prakash Nagar");
		// Amount to be paid(Fee Break-up)
		driver.findElement(By.xpath("//body/div[@id='main-wrapper']/div[3]/div[1]/div[3]/div[1]/section[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[5]/div[1]/a[1]")).click();
		Thread.sleep(3000);
		// Date
		driver.findElement(By.id("issued_date")).sendKeys("22-03-2024");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		// Remark
		driver.findElement(By.id("remark")).sendKeys("Offline Payment done by company");
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		// Submit click on it
		driver.findElement(By.xpath("//body/div[@id='main-wrapper']/div[3]/div[1]/div[3]/div[1]/section[1]/div[1]/div[2]/div[1]/form[1]/div[3]/button[1]/span[1]")).click();

	}

	@BeforeTest
	public void beforeTest() {
		driver.get("https://demos.mirakitech.com/igbc/");
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
	}

}