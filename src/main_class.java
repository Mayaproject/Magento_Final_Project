import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

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

		WebElement ScrollDown = driver
				.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/span/button"));
		ScrollDown.click();
		WebElement LogOutButtons = driver
				.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a"));
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
				Quintyt.sendKeys(radiantNumberToAdd);
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
				Quintyt.sendKeys("breatheNumberToAdd ");

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
				Quintyt.sendKeys("argusNumberToAdd ");

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
				Quintyt.sendKeys(heroNumberToAdd);

				WebElement AddtoCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
				AddtoCart.click();
				Thread.sleep(1000);

			} else if (driver.getCurrentUrl().contains("backpack")) {
				WebElement Quintyt = driver.findElement(By.xpath("//*[@id=\"qty\"]"));
				Quintyt.clear();
				Quintyt.sendKeys(backpackNumberToAdd);

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
		Thread.sleep(2000);
		WebElement Check = driver
				.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button"));
		Check.click();
		Thread.sleep(5000);

		WebElement StreetAddress = driver.findElement(By.name("street[0]"));
		StreetAddress.sendKeys("Gardenz street");
		WebElement City = driver.findElement(By.name("city"));
		City.sendKeys("Amman");

		WebElement region = driver.findElement(By.name("region_id"));
		Select Selector = new Select(region);
		Selector.selectByIndex(RandomIndex);

		WebElement ZipCode = driver.findElement(By.name("postcode"));
		ZipCode.sendKeys("1195");

		WebElement Country = driver.findElement(By.name("country_id"));
		Select Selector2 = new Select(Country);
		Selector2.selectByIndex(RandomIndex);

		WebElement PhoneNumber = driver.findElement(By.name("telephone"));
		PhoneNumber.sendKeys("0770706728");

		Thread.sleep(10000);
		WebElement Next = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button"));
		Next.click();

	}

//	@Test()
//	public void CheckPriceTest() {
//		// -------------------
//		// To make a List and convert it from String to Int
//		List<String> PriceList = new ArrayList<String>();
//		PriceList.add(radiantPrice);
//		PriceList.add(breathePrice);
//		PriceList.add(argusPrice);
//		PriceList.add(heroPrice);
//		PriceList.add(backpackPrice);
//
//		for (int i = 0; i < PriceList.size(); i++) {
//
//			String ListPriceUpdated = PriceList.get(i);
//			String SplitPrice = ListPriceUpdated.replaceAll("\\$|\\.\\d+", "");
//			int FinalPrice = Integer.parseInt(SplitPrice);
//			System.out.println(FinalPrice);
//		}
//
//		List<String> ItemsNumberList = new ArrayList<String>();
//
//		ItemsNumberList.add(radiantNumber);
//		ItemsNumberList.add(breatheNumber);
//		ItemsNumberList.add(argusNumber);
//		ItemsNumberList.add(heroNumber);
//		ItemsNumberList.add(backpackNumber);
//
//		for (int i = 0; i < ItemsNumberList.size(); i++) {
//
//			String ListNumberUpdated = ItemsNumberList.get(i);
//			int Finalnumber = Integer.parseInt(ListNumberUpdated);
//			System.out.println(Finalnumber);
//
//		}
//
//	}

	@Test(priority = 5)
	public void CheckThePrice() {

		// price of items
		WebElement radiantPrice = driver.findElement(By.xpath("//*[@id=\"old-price-1556-widget-product-grid\"]"));
		WebElement breathePrice = driver.findElement(By.xpath("//*[@id=\"old-price-1812-widget-product-grid\"]"));
		WebElement argusPrice = driver.findElement(By.xpath("//*[@id=\"old-price-694-widget-product-grid\"]"));
		WebElement heroPrice = driver.findElement(By.xpath("//*[@id=\"old-price-158-widget-product-grid\"]"));
		WebElement backpackPrice = driver.findElement(By.xpath("//*[@id=\"old-price-6-widget-product-grid\"]"));
//------------------------------------

		String radiantString = radiantPrice.getText().replace("$", "").replace(".", "");
		int radiantInt = Integer.parseInt(radiantString);
		int Finalradiantprice = radiantInt / 100;

		String breatheString = breathePrice.getText().replace("$", "").replace(".", "");
		int breatheInt = Integer.parseInt(breatheString);
		int Finalbreatheprice = breatheInt / 100;

		String argusString = argusPrice.getText().replace("$", "").replace(".", "");
		int argusInt = Integer.parseInt(argusString);
		int Finalargusprice = argusInt / 100;

		String heroString = heroPrice.getText().replace("$", "").replace(".", "");
		int heroInt = Integer.parseInt(heroString);
		int Finalheroprice = heroInt / 100;

		String backpackString = backpackPrice.getText().replace("$", "").replace(".", "");
		int backpackInt = Integer.parseInt(backpackString);
		int Finalbackpackprice = backpackInt / 100;

		int ExpectedPriceOfItems = (Finalradiantprice * radiantNumber) + (Finalargusprice * argusNumber)
				+ (Finalheroprice * heroNumber) + (Finalbreatheprice * breatheNumber)
				+ (Finalbackpackprice * backpackNumber);
		WebElement ActuallPrice = driver.findElement(By.xpath("//*[@id=\"opc-sidebar\"]/div[1]/table/tbody/tr[3]/td/strong/span"));
		String StringActuall = ActuallPrice.getText().replace("$", "").replace(".", "");
		int PriceInt = Integer.parseInt(StringActuall);
		int Actuall = PriceInt/100 ; 
		
		assertEquals(Actuall, ExpectedPriceOfItems);
		
	
	}
}
