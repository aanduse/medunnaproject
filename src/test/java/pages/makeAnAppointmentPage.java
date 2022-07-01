package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class makeAnAppointmentPage {
    public makeAnAppointmentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="(//a[@href='#appointment'])[1]" )
    public WebElement makeAnAppointmentButton;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName;
}
