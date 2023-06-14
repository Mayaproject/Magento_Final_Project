import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.Assertion;

public class parameter_for_test {

	WebDriver driver = new EdgeDriver();

	Assertion myAssert = new Assertion();

	Random rand = new Random();
//--------------------------
	//URLs to deal with 
	
	String TheWebsite = "https://magento.softwaretestingboard.com/";
	String SignUpBage = "https://magento.softwaretestingboard.com/customer/account/create/";
	String SignInPage = "https://magento.softwaretestingboard.com/customer/account/login/";
	String SignOut = "href=\"https://magento.softwaretestingboard.com/customer/account/logout/";
	String CheckOutCart = "https://magento.softwaretestingboard.com/checkout/cart/";
//-------------------------
	//Information for registration 
	String[] FirstNameList = { "Khaledd", "saea", "Maysa", "Ansaom", "shukrri", "saed" };
	String[] LastNameList = { "Ahmed", "Ismail", "Moh", "mosab", "saeeed", "motasem" };
	//Random
	int RandomIndex = rand.nextInt(0, 5);
	int RandomIndexEmail = rand.nextInt(50, 199);
//-------------
	//Information to Login 
	String EmailUser = "user";
	String EmailComplete = "@yahoo.com";
	String theEmailToLogin;
	String PasswordIn = "Maya1234@@!!";

// --------------------------------------------------
   // URLs to deal with 
	String[] URLSForItems = { "https://magento.softwaretestingboard.com/radiant-tee.html",
			"https://magento.softwaretestingboard.com/breathe-easy-tank.html",
			"https://magento.softwaretestingboard.com/argus-all-weather-tank.html",
			"https://magento.softwaretestingboard.com/hero-hoodie.html",
			"https://magento.softwaretestingboard.com/fusion-backpack.html" };

//-----------------------------------------
	//number of items for Add items test
	String radiantNumberToAdd = "3";
	String  breatheNumberToAdd  = "2";
	String  argusNumberToAdd  = "4";
	String  heroNumberToAdd  = "1";
	String  backpackNumberToAdd  = "5";

// -----------------------------------
	// number of items to add for check test
			int radiantNumber = 3;
			int breatheNumber = 2;
			int argusNumber = 4;
			int heroNumber = 1;
			int backpackNumber = 5;
			
//-------------------------------------
			
}
