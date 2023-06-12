import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.Assertion;

public class parameter_for_test {
	
	
	static WebDriver driver = new EdgeDriver();
	
	static Assertion myAssert = new Assertion();

	Random rand = new Random();

	String TheWebsite = "https://magento.softwaretestingboard.com/";
	String SignUpBage = "https://magento.softwaretestingboard.com/customer/account/create/";
	String SignInPage = "https://magento.softwaretestingboard.com/customer/account/login/";
	String SignOut = "href=\"https://magento.softwaretestingboard.com/customer/account/logout/";
	
	String [] FirstNameList = {"Khaledd","saea","Maysa","Ansaom","shukrri","saed"};
	String [] LastNameList = {"Ahmed","Ismail","Moh","mosab","saeeed","motasem"};
	int RandomIndex = rand.nextInt(0,5);
	int RandomIndexEmail = rand.nextInt(50,199);
	
	String EmailUser = "user" ;
	String EmailComplete = "@yahoo.com";
	String theEmailToLogin ;
	
	String PasswordIn = "Maya1234@@!!";
	
	// --------------------------------------------------
	
	String[] URLSForItems = { "https://magento.softwaretestingboard.com/radiant-tee.html",
			"https://magento.softwaretestingboard.com/breathe-easy-tank.html",
			"https://magento.softwaretestingboard.com/argus-all-weather-tank.html",
			"https://magento.softwaretestingboard.com/hero-hoodie.html",
			"https://magento.softwaretestingboard.com/fusion-backpack.html" };
	
	String CheckOutCart = "https://magento.softwaretestingboard.com/checkout/cart/";
	
	
	
	
//	String SuccessMessage = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div")).getText();
//	String ExpectedSuccessMassege = "Thank you for registering with Main Website Store.";
}

