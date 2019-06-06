package pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdactinHomePageObjects {
	
	WebDriver driver = null;
	
	//Page objects
	By usernametextbox = By.xpath("//input[@id='username']");
	By passwordtextbox = By.xpath("//input[@id='password']");
	By loginbutton = By.xpath("//input[@id='login']");
	By forgetpasswordlink = By.xpath("//a[contains(text(),'Forgot Password?')]");
	By newuserregisterlink = By.xpath("//a[contains(text(),'New User Register Here')]");
	By logoutlink = By.xpath("//a[contains(text(),'Logout')]");
	By loginagainlink = By.xpath("//a[contains(text(),'Click here to login again')]");
	
	
	//Page methods
	public AdactinHomePageObjects(WebDriver driver){
		this.driver = driver;
	}

	public void setTextInUsername(String text){
		driver.findElement(usernametextbox).sendKeys(text);
	}
	
	public void setTextInPassword(String text){
		driver.findElement(passwordtextbox).sendKeys(text);
	}
	
	public void clickLoginButton(){
		driver.findElement(loginbutton).click();;
	}
	
	public void clickForgetPasswordLink(){
		driver.findElement(forgetpasswordlink).click();;
	}
	
	public void clickRegisterLink(){
		driver.findElement(newuserregisterlink).click();
	}
	
	public void clickLogoutButton(){
		driver.findElement(logoutlink).click();
	}
	
	public void clickLoginAgainButton(){
		driver.findElement(loginagainlink).click();
	}
}