package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class directoryModule {

	WebDriver driver;

	public directoryModule(WebDriver driver) {
		this.driver = driver;
	}

	By directory = By.xpath("//div[@class='oxd-sidepanel-body']//li[9]");
	By Employeename = By.xpath("//div[@class='oxd-form-row']/div/div[1]/div/div[2]/div");
	By JobTitle = By.xpath("//div[@class='oxd-form-row']/div/div[2]/div/div[2]/div/div/div[2]");
	By location = By.xpath("//div[@class='oxd-form-row']/div/div[3]/div/div[2]/div/div/div[2]");
	By Submit = By.xpath("//button[@type='submit']");
	By Reset = By.xpath("//button[@type='reset']");

	public void directorymodule() throws InterruptedException {
		driver.findElement(directory).click();
	}

	public void Employee(String E) {
		driver.findElement(Employeename).sendKeys(E);
	}

	public void Job(String J) {
		driver.findElement(JobTitle).click();
		driver.findElement(JobTitle).isDisplayed();
		driver.findElement(JobTitle).sendKeys(J);
	}

	public void loc(String L) {
		driver.findElement(JobTitle).click();
		driver.findElement(JobTitle).isDisplayed();
		driver.findElement(JobTitle).sendKeys(L);
	}

	public void Sbutton() throws InterruptedException {
		driver.findElement(Submit).click();
	}
	
	public void Rbutton() throws InterruptedException {
		driver.findElement(Submit).click();
	}

	public void directoryprocess(String E, String J, String L) throws InterruptedException {
		directorymodule();
		Employee(E);
		Job(J);
		loc(L);
		Sbutton();
		Rbutton();
	}

}
