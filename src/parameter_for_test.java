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
	String [] FirstNameList = {"Khale","sae","Mayaa","Ansamm","shukrri","saed"};
	String [] LastNameList = {"Ahmed","Ismail","Moh","mosab","saeeed","motasem"};
	int RandomIndex = rand.nextInt(0,4);
	int RandomIndexEmail = rand.nextInt(0,100);
	String EmailUser = "user" ;
	String EmailComplete = "@yahoo.com";
	
	String PasswordIn = "Maya1234@@!!";
	
	String theEmailToLogin ;
	String SignOut = "href=\"https://magento.softwaretestingboard.com/customer/account/logout/";
	
//	String SuccessMessage = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div")).getText();
//	String ExpectedSuccessMassege = "Thank you for registering with Main Website Store.";
}

