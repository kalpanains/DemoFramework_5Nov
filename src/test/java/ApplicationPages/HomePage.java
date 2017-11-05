package ApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage
{

	WebDriver driver;
	
	public HomePage(WebDriver ldriver)
	{
	this.driver=ldriver;
	}


	@FindBy(xpath ="//span[@class='hidden-xs'][text()='Home']")
	WebElement HomeLink;
	

	@FindBy(xpath = "//span[@class='hidden-xs'][text()='My Account']")
	WebElement myAccountLink;
	
	
	@FindBy(xpath ="//span[@class='hidden-xs'][text()='My Cart']")
	WebElement myCartLink;
	

	@FindBy(xpath ="//span[@class='hidden-xs'][text()='Wishlist']")
	WebElement Wishlist;
	
	
	@FindBy(xpath = "//span[text()=' Log In']")
	WebElement LogInLink;
	
	
	public void clickOnHome()
	{
		HomeLink.click();
	}
	
	public void clickOnMyAccountLink()
	{
		myAccountLink.click();
	}
	
	public void clickOnMycartLink()
	{
		myCartLink.click();
	}
	
	public void WishlistLink()
	{
		Wishlist.click();
	}
	
	public void LogInLink()
	{
		LogInLink.click();
	}
	
	public String getApplicationTitle()
	{
		String title = driver.getTitle();
		return title;
	}
}


