package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver1.close();
		
		WebDriver driver2 = new FirefoxDriver();
		driver2.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver2.close();
		
		WebDriver driver3 = new EdgeDriver();
		driver3.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver3.close();

		//WebDriver driver4 = new SafariDriver();
		//driver4.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		//river4.navigate().back();
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(5000);
		Login logi = new Login(driver);
		logi.uRL();
		logi.userName("Admin");
		logi.pass("admin123");
		logi.login();

		directoryModule dic = new directoryModule(driver);
		dic.directorymodule();
		dic.Employee("Odis  Adalwin");
		dic.Job("Chief Executive Officer");
		dic.loc("HQ - CA,USA");
		dic.Sbutton();
		dic.Rbutton();

		Logout logt = new Logout(driver);
		logt.profilePic();
		logt.logout();

		ForgotPassword forp = new ForgotPassword(driver);
		forp.Forgotpass();
	forp.UserName("Admin");
		forp.Reset();
	}

}
