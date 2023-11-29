package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
	WebDriver driver;

	public Logout(WebDriver driver) {
		this.driver = driver;

	}

	By profile = By.xpath("//div[@class='oxd-topbar-header-userarea']//ul[1]//li[1]//span[1]");
	By logout = By.linkText("Logout");

	public void profilePic() throws InterruptedException {
		driver.findElement(profile).click();
		Thread.sleep(5000);
	}

	public void logout() throws InterruptedException {
		driver.findElement(logout).click();
		Thread.sleep(5000);
	}

}
