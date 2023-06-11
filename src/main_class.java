import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.gson.annotations.Since;

public class main_class extends parameter_for_test{
	
	@BeforeTest
	public void bf () {
		driver.get(TheWebsite);
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void SignUpTest() throws InterruptedException {
		driver.get(SignUpBage);
		WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
		//FirstName.sendKeys(FirstNameList[rand.nextInt(0,4)]);
		FirstName.sendKeys(FirstNameList[RandomIndex]);
		
		WebElement LastName = driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
		LastName.sendKeys(FirstNameList[rand.nextInt(0,4)]);
		LastName.sendKeys(FirstNameList[RandomIndex]);
		
		WebElement Email = driver.findElement(By.xpath("//*[@id=\"email_address\"]")) ;
		Email.sendKeys(EmailUser+RandomIndexEmail+EmailComplete);
		
		theEmailToLogin = EmailUser+RandomIndexEmail+EmailComplete ;
		
		WebElement Password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Password.sendKeys(PasswordIn);
		
		WebElement ConfirmPassword = driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]")); 
		ConfirmPassword.sendKeys(PasswordIn);
		
		WebElement SignUpButtons = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button"));
		SignUpButtons.click();
		
		Thread.sleep(5000);
		
		driver.get(SignOut);
		
		
		
		
		
		
//		myAssert.assertEquals(SuccessMessage, ExpectedSuccessMassege );
	
	}
	@Test(priority = 2)
	public void SignInTest() throws InterruptedException {
		driver.get(SignInPage);
		Thread.sleep(3000);
		WebElement EmailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		EmailField.sendKeys(theEmailToLogin);
		
		
		WebElement PasswordFiled = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		PasswordFiled.sendKeys(PasswordIn);
		
		WebElement SignInButtons = driver.findElement(By.xpath("//*[@id=\"send2\"]"));
		SignInButtons.click();
		
		
	}
	
	@AfterTest
	public void at () {}
	
	

}
