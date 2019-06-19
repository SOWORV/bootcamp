package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {
   @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
   WebElement searchbox;
   @FindBy(xpath = "//*[@id='nav-link-accountList']")
   WebElement signin;




//tsting mousehover to click on the sign in
    public void clicksignIn() {
       if(signin.isDisplayed())
       mouseHoverByXpath("//*[@id='nav-link-accountList']");
       driver.findElement(By.linkText("Sign in")).click();

    }
    //testing if user are able to provide log on informations
    public void signin(){
       typeByXpath("//*[@id='ap_email']","ahmedshowrov21@gmail.com");
       typeByXpath("//*[@id='ap_password']","asdfgh");
       clickByXpath("//*[@id='signInSubmit']");
   }

   //testing if useer is able to reset the password

   public void forgetpass(){
       clickByXpath("//*[@id='auth-fpp-link-bottom']");

   }

   //testing if the search bar is displayed and user can type
    //and search for product and user are able to add the product to the cart
   public void purchase(){
       if (searchbox.isDisplayed())
       typeByXpath("//*[@id='twotabsearchtextbox']","books");
       clickByXpath("//*[@type='submit']");
       clickByXpath("//*[@id=\"widgetFilters\"]/div/div[3]/div[4]/a/div/div[1]/img");
       clickByXpath("//*[@id=\"merchandised-content\"]/div[4]/div[2]/ul/span[1]/li/span/div/a/div[1]");
       clickByXpath("//*[@id=\"anonCarousel1\"]/ol/li[1]/a[1]/img");
       clickByXpath("//*[@id='add-to-cart-button']");
       clickByXpath("//*[@id=\"nav-cart\"]");
   }
}
