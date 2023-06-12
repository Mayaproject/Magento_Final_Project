import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.gson.annotations.Since;

public class main_class extends parameter_for_test {

	@BeforeTest
	public void bf() {
		driver.get(TheWebsite);
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void SignUpTest() throws InterruptedException {
		driver.get(SignUpBage);
		WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
		// FirstName.sendKeys(FirstNameList[rand.nextInt(0,4)]);
		FirstName.sendKeys(FirstNameList[RandomIndex]);

		WebElement LastName = driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
		LastName.sendKeys(FirstNameList[rand.nextInt(0, 4)]);
		LastName.sendKeys(FirstNameList[RandomIndex]);

		WebElement Email = driver.findElement(By.xpath("//*[@id=\"email_address\"]"));
		Email.sendKeys(EmailUser + RandomIndexEmail + EmailComplete);

		theEmailToLogin = EmailUser + RandomIndexEmail + EmailComplete;

		WebElement Password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Password.sendKeys(PasswordIn);

		WebElement ConfirmPassword = driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]"));
		ConfirmPassword.sendKeys(PasswordIn);

		WebElement SignUpButtons = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button"));
		SignUpButtons.click();

		Thread.sleep(5000);
		
		WebElement ScrollDown = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/span/button"));
		ScrollDown.click();
		WebElement LogOutButtons = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a"));
		LogOutButtons.click();

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

	@Test(priority = 3)
	public void AddItems() throws InterruptedException {

		for (int i = 0; i < URLSForItems.length; i++) {
			driver.get(URLSForItems[i]);
			Thread.sleep(3000);

			if (driver.getCurrentUrl().contains("radiant")) {

				WebElement SizeBox = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
				List<WebElement> sizes = SizeBox.findElements(By.tagName("div"));
				int randomIndex = rand.nextInt(0, sizes.size());
				sizes.get(randomIndex).click();

				WebElement ColorBox = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
				List<WebElement> Colors = ColorBox.findElements(By.tagName("div"));
				int randomIndexcolor = rand.nextInt(0, Colors.size());
				Colors.get(randomIndexcolor).click();

				WebElement Quintyt = driver.findElement(By.xpath("//*[@id=\"qty\"]"));
				Quintyt.clear();
				Quintyt.sendKeys("3");
				Thread.sleep(1000);

			} else if (driver.getCurrentUrl().contains("breathe")) {

				WebElement SizeBox = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
				List<WebElement> sizes = SizeBox.findElements(By.tagName("div"));
				int randomIndex = rand.nextInt(0, sizes.size());
				sizes.get(randomIndex).click();

				WebElement ColorBox = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
				List<WebElement> Colors = ColorBox.findElements(By.tagName("div"));
				int randomIndexcolor = rand.nextInt(0, Colors.size());
				Colors.get(randomIndexcolor).click();

				WebElement Quintyt = driver.findElement(By.xpath("//*[@id=\"qty\"]"));
				Quintyt.clear();
				Quintyt.sendKeys("2");

				WebElement AddtoCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
				AddtoCart.click();
				Thread.sleep(1000);

			} else if (driver.getCurrentUrl().contains("argus")) {

				WebElement SizeBox = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
				List<WebElement> sizes = SizeBox.findElements(By.tagName("div"));
				int randomIndex = rand.nextInt(0, sizes.size());
				sizes.get(randomIndex).click();

				WebElement ColorBox = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
				List<WebElement> Colors = ColorBox.findElements(By.tagName("div"));
				int randomIndexcolor = rand.nextInt(0, Colors.size());
				Colors.get(randomIndexcolor).click();

				WebElement Quintyt = driver.findElement(By.xpath("//*[@id=\"qty\"]"));
				Quintyt.clear();
				Quintyt.sendKeys("4");

				WebElement AddtoCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
				AddtoCart.click();
				Thread.sleep(1000);

			} else if (driver.getCurrentUrl().contains("hero")) {

				WebElement SizeBox = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
				List<WebElement> sizes = SizeBox.findElements(By.tagName("div"));
				int randomIndex = rand.nextInt(0, sizes.size());
				sizes.get(randomIndex).click();

				WebElement ColorBox = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
				List<WebElement> Colors = ColorBox.findElements(By.tagName("div"));
				int randomIndexcolor = rand.nextInt(0, Colors.size());
				Colors.get(randomIndexcolor).click();

				WebElement Quintyt = driver.findElement(By.xpath("//*[@id=\"qty\"]"));
				Quintyt.clear();
				Quintyt.sendKeys("1");

				WebElement AddtoCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
				AddtoCart.click();
				Thread.sleep(1000);

			} else if (driver.getCurrentUrl().contains("backpack")) {
				WebElement Quintyt = driver.findElement(By.xpath("//*[@id=\"qty\"]"));
				Quintyt.clear();
				Quintyt.sendKeys("5");

				WebElement AddtoCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
				AddtoCart.click();
				Thread.sleep(1000);

			}

		}
		
	}

	@Test(priority = 4)
	public void CheckOutProcess() throws InterruptedException {
		
		// if any items still doesn't exist we make duration to let the system wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(CheckOutCart);
		
		WebElement Check = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button"));
		Check.click();

	}
	@Test(priority = 5)
	public void ShippingDetails() throws InterruptedException {
		
		WebElement Company   = driver.findElement(By.xpath("//*[@id=\"IT1NX62\"]"));
		Company.sendKeys("null");
		WebElement StreetAddress = driver.findElement(By.xpath("//*[@id=\"RSXB3PI\"]"));
		StreetAddress.sendKeys("Gardenz street");
		WebElement City = driver.findElement(By.xpath("//*[@id=\"SXO7UOL\"]"));
		City.sendKeys("Amman");
		Select Selector = new Select(driver.findElement(By.xpath("//*[@id=\"IVSIU6J\"]")));
		Selector.selectByIndex(RandomIndex);
		WebElement ZipCode = driver.findElement(By.xpath("//*[@id=\"APN736Y\"]"));
		ZipCode.sendKeys("1195");
		WebElement PhoneNumber= driver.findElement(By.xpath("//*[@id=\"JMKMT1M\"]"));
		PhoneNumber.sendKeys("0770706728");
		
		
		Thread.sleep(2000);
		WebElement Next = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button"));
		Next.click();
		
	}

	@AfterTest
	public void at() {
	}

}
