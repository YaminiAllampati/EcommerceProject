package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProfileEditPage extends DDTFile{
	
	@FindBy(xpath="(//span[@class=\"a-color-secondary\"])[2]")
	WebElement loginAndSecurity;
	
	//name edit
	@FindBy(id="NAME_BUTTON")
	WebElement editName;
	
	@FindBy(name="customerName")
	WebElement textName;
	
	@FindBy(id="cnep_1C_submit_button")
	WebElement saveNameChge;
	
	//Email add 
	@FindBy(id="EMAIL_BUTTON")
	WebElement emailAddBtn;
	
	@FindBy(name="cvf_email")
	WebElement txtEmail;
	
	@FindBy(name="cvf_action")
	WebElement ctnBtn;
	
	//edit mobile num
	@FindBy(id="MOBILE_NUMBER_BUTTON")
	WebElement editMobNum;
	
	@FindBy(name="countryCode")
	WebElement countryCode;
	
	@FindBy(name="newMobilePhoneNumber")
	WebElement enterNewMB;
	
	@FindBy(id="auth-change-phone-cancel")
	WebElement cancelBtnMN;
	
	//address edit page
	@FindBy(xpath="(//span[@class=\"a-color-secondary\"])[4]")
	WebElement urAdddress;
	
	@FindBy(id="ya-myab-address-edit-btn-1")
	WebElement editOptn;
	
	@FindBy(name="address-ui-widgets-countryCode")
	WebElement contryDrp;
	
	@FindBy(css="#address-ui-widgets-enterAddressFullName")
	WebElement nameFld;
	
	@FindBy(name="address-ui-widgets-enterAddressPhoneNumber")
	WebElement mobFld;
	
	@FindBy(id="address-ui-widgets-enterAddressPostalCode")
	WebElement pincode;
	
	@FindBy(css="input#address-ui-widgets-enterAddressLine1")
	WebElement flatNo;
	
	@FindBy(name="address-ui-widgets-enterAddressLine2")
	WebElement streetName;
	
	
	@FindBy(name="address-ui-widgets-enterAddressCity")
	WebElement cityFld;
	
	@FindBy(id="address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId")
	WebElement stateFld;
	
	@FindBy(xpath="(//input[@class=\"a-button-input\"])[3]")
	public WebElement updateAdrressBtn;
	
	
	public void btnloginAndSecurity()
	{
		loginAndSecurity.click();
	}
	public void btnNameEdit()
	{
		editName.click();
	}
	public void updateNameFld()
	{
		textName.clear();
		textName.sendKeys("yamini Allampti");
	}
	public void btnSaveNameChge()
	{
		saveNameChge.click();
	}
	public void btnAddEmail()
	{
		emailAddBtn.click();
	}
	public void setEmail()
	{
		txtEmail.sendKeys("yaminireddy1428@gmail.com");
	}
	public void btnContinue()
	{
		ctnBtn.click();
	}
	public void btnEditMobNum()
	{
		editMobNum.click();
	}
	public void slctCountryCode()
	{
		Select s = new Select(countryCode);
		s.selectByValue("AD");
	}
	public void setNewMobNum()
	{
		enterNewMB.sendKeys("8878798909");
	}
	public void btnCancelMN()
	{
		cancelBtnMN.click();
	}
	
	
	//address edit page
	public void clckUserAddress()
	{
		urAdddress.click();
	}
	
	public void clckEditOptn()
	{
		editOptn.click();
	}
	public void slctContryDrp()
	{
		Select s = new Select(contryDrp);
		s.selectByVisibleText("Antarctica");
	}
	public void editNameFld()
	{
		nameFld.clear();
		nameFld.sendKeys(nm);
	}
	public void editMobFld()
	{
		mobFld.clear();
		mobFld.sendKeys(mobnum);
	}
	public void editPincode()
	{
		pincode.clear();
		pincode.sendKeys(pcode);
		
	}
	public void editFlatNo()
	{
		flatNo.clear();
		flatNo.sendKeys("116 village high raod");
	}
	public  void editStreetName()
	{
		streetName.clear();
		streetName.sendKeys("Royal Ladies Hostel, Sholinganallur");
	}
	public void editCityFld()
	{
		cityFld.clear();
		cityFld.sendKeys("Chennai");
	}
	public void editStateFld()
	{
		Select s = new Select(stateFld);
		s.selectByVisibleText("TAMIL NADU");
	}
	public void clckUpdateAdrressBtn()
	{
		updateAdrressBtn.click();
	}
	
	public ProfileEditPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
