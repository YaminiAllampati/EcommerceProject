package testCases;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DDTFile;
import pageObjects.HomePage;
import pageObjects.ProfileEditPage;
import pageObjects.SignPage;

public class TestCase4_ extends LaunchQuit{
	
	@Test
	public void TC4_() throws EncryptedDocumentException, IOException
	{
		
	DDTFile d = new DDTFile();
	d.TestCrentials();
	d.editAddressDetails();
	HomePage h = new HomePage(driver);
	h.clickActList(driver);
	h.clickSign();
	SignPage s = new SignPage(driver);
	s.signMbNum();
	s.signCtnBtn();
	s.signPswrd();
			//s.signPswrd(pswrd);
	s.signBtn();
	Assert.assertEquals(driver.findElement(By.id("nav-logo")).getText(),".in");
	h.clickActList(driver);
	h.clkUrAccount();
	
	ProfileEditPage e = new ProfileEditPage(driver);
	e.clckUserAddress();
	e.clckEditOptn();
	//e.slctContryDrp();
	e.editNameFld();
	e.editMobFld();
	e.editPincode();
	e.editFlatNo();
	e.editStreetName();
	e.editCityFld();
	e.editStateFld();
	WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
	w.until(ExpectedConditions.elementToBeClickable(e.updateAdrressBtn));
	e.clckUpdateAdrressBtn();
	
	Assert.assertEquals(driver.findElement(By.cssSelector("h4.a-alert-heading")).getText(), "Address saved");
	/*e.btnloginAndSecurity();
	//name edit
	e.btnNameEdit();
	e.updateNameFld();
	e.btnSaveNameChge();
	//email add
	//e.btnAddEmail();
	//e.setEmail();
	//e.btnContinue();
	//edit mobile number
	e.btnEditMobNum();
	e.slctCountryCode();
	e.setNewMobNum();
	e.btnCancelMN(); */
	

}
}
