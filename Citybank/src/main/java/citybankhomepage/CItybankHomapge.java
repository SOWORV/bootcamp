package citybankhomepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CItybankHomapge extends CommonAPI {

    @FindBy(id = "banking")
    public WebElement banking;

    @FindBy(linkText = "Checking")
    public WebElement checking;





    public void SetsignIn(){
        typeByXpath("//*[@id='username']","ahmed@gmail.com");
        typeByXpath("//*[@id='password']","sfahflda");
        clickByXpath("//*[@id'signInBtn']");

    }
    public void search(){
        clickByXpath("//div[@role='search']");
        typeByXpath("//input[@placeholder='Tell us what you’re looking for']","cadit cards");
        clickByXpath("//*[@id=\"citi-autocomplete-content\"]/div[1]/button[2]");

    }
    public void chosebanking() {
        banking.click();
        checking.click();
    }

}
