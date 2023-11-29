package TestNgOrange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestOrangeHRM {

	static WebDriver driver;

	@BeforeSuite
	public void launchrome() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.close();
	}

	@Test(priority = 1)
	public void lauchFirefox() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.close();
	}

	@Test(priority = 2)
	public void lauchEdge() throws InterruptedException {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.close();
	}

	@Test(priority = 3)
	public void lauchBrowse() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
	}

	@Test(priority = 4)

	public void loginProcess() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		String dash = driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']/child::h6")).getText();
		Assert.assertEquals(dash, "Dashboard");
	}

	@Test(priority = 5)

	public void directory() throws InterruptedException {

		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/child::li[9]//a")).click();
		Thread.sleep(5000);
		
	   }
	@Test(priority = 6)
	
	public void Employeename() {
		
		driver.findElement(By.xpath("//div[@class='oxd-autocomplete-wrapper']")).sendKeys("Odis  Adalwin");
	}
	@Test(priority = 7)
    public void selectJobTitleFromDropdown() {

        WebElement jobTitleDropdown = driver.findElement(By.xpath("//div[@class='oxd-form-row']/div/div[2]/div/div[2]/div/div/div[2]"));
        Select selectJobTitle = new Select(jobTitleDropdown);

        selectJobTitle.selectByVisibleText("Chief Executive Officer");

       
        WebElement selectedOption = selectJobTitle.getFirstSelectedOption();
        String selectedJobTitle = selectedOption.getText();
        assert selectedJobTitle.equals("Chief Executive Officer") : "Job title selection failed";
    }
	@Test(priority = 8)
    public void selectLocationFromDropdown() {
       
        WebElement locationDropdown = driver.findElement(By.xpath("//div[@class='oxd-form-row']/div/div[3]/div/div[2]/div/div/div[2]"));
       
        Select selectLocation = new Select(locationDropdown);

        selectLocation.selectByVisibleText("HQ - CA,USA");

        WebElement selectedOption1 = selectLocation.getFirstSelectedOption();
        String selectLocation1 = selectedOption1.getText();
        assert selectLocation1.equals("HQ - CA,USA") : "Location selection failed";
    }
	
	@Test(priority = 9)
	
	public void SearchButton () {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.navigate().back();
	}
	
@Test(priority = 10)
	
	public void ResetButton () {
		driver.findElement(By.xpath("//button[@type='reset']")).click();
		
	}

	@AfterSuite
	public void close() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
