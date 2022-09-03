package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;





public class LoginPage extends TestBase{
	
	@FindBy(xpath="//input[@id='loginUser']")  private WebElement ClientCodetextBox;
     //input[@id='loginUser']
@FindBy(xpath= "//input[@id='loginPwd']")  private WebElement PasswordTexBox;
 @FindBy(xpath="//input[@id='loginDob']") private WebElement DateOfBirth;
 
 //  @FindBy(xpath= "//input[@id='eyeClick']")  private WebElement EyeButton; 
	@FindBy(xpath="(//div[@class='text-center'])[1]")private WebElement LoginSubmitButton;
	@FindBy(xpath="//input[@type='type']")private WebElement verify5paisaLogo;
    @FindBy(xpath="//h1[@class='text-center']") private WebElement Title;
//	@FindBy(xpath="//input[@autocomplete='new-password']") private WebElement DateOfBirth;
    
	public	LoginPage()
	{
	
PageFactory.initElements( driver,	this);
	
	}
	
	public	String	verifyTitle()
	{
	return	driver.getTitle();	//Title
	}
	
	
	public	void	login5PaisaApp()	throws	Throwable
    {
		Thread.sleep(2000);
    	ClientCodetextBox.sendKeys("mohitptl1995@gmail.com");
    	
    	Thread.sleep(2000);
    	PasswordTexBox.sendKeys("Tata@2022");
    	 Thread.sleep(2000);
    	DateOfBirth.sendKeys("07061995");
    	Thread.sleep(2000);
    	LoginSubmitButton.click();
    
    	Thread.sleep(1000);

    
    //    pinTextbox.sendKeys("");
//    continueBtn.click();
    }
//	public	boolean	verify5paisaLogo()
//	{
//	return	verify5paisaLogo.isEnabled();
//	}
}

