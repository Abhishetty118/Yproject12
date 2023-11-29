package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
	}  

//create reprository of element
	By userName = By.name("username");
	By pass = By.name("password");
	By login = By.xpath("//button[@type='submit']");

	public void uRL() throws InterruptedException 
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
	}
	
	public void userName(String un) 
	{
		driver.findElement(userName).sendKeys(un);
	}
	public void pass(String pw)
	{
		driver.findElement(pass).sendKeys(pw);
	}
	public void login() throws InterruptedException
	{
		driver.findElement(login).click();
		Thread.sleep(5000);
	}
	public void loginprocess(String un,String pw) throws InterruptedException
	{
		uRL();
		userName(un); 
		pass(pw);
		login();
	}
	
}
