package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassword {

	WebDriver driver;

	public ForgotPassword(WebDriver driver) {
		this.driver = driver;
	}

	By ForgotP = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p");
	By Username = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/div[1]/div/div[2]/input");
    By button = By.xpath("//div[@class='orangehrm-forgot-password-button-container']/button[2]");
	
    
    public void Forgotpass()throws InterruptedException 
    {
		driver.findElement(ForgotP).click();
	}

	public void UserName(String user)
	{
		driver.findElement(Username).sendKeys(user);
	}
	
	public void Reset()throws InterruptedException
	{
		driver.findElement(button).click();
	
	}
	
	public void Forgotprocess(String user)throws InterruptedException

	{
		Forgotpass();
		UserName(user); 
		Reset();
	}


	
	

	
		
	}
	


