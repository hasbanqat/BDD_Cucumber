package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage{


    @FindBy( xpath= "xpath=//input[@type='search']")
    public WebElement search;

}
