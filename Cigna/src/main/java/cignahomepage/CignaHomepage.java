package cignahomepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.nio.file.Watchable;

public class CignaHomepage extends CommonAPI {


//testing if user can signin by providing log in information
    public void setSignIn(){
        typeByXpath("//*[@id='username']","ahmed@gmail.com");
        typeByXpath("//*[@id='password']","strdg");
        clickByXpath("//*[@id='loginbutton']");


    }

    //tesing for user to reet the id and passwrod
    public void resetidandpass(){
        clickByXpath("//*[@id='forgotusername']/a");
        clickByXpath("//*[@id='forgotpassword']/a");
    }

    //tesing for user to click the sign in botton
    public void clickonSignIn(){
        clickByXpath("//*[@id=\"includes-content\"]/div[1]/nav[2]/div/ul/li[2]/a");



    }

    //testing for user to be able to click the health care providers
    public void helthcare(){
        clickByXpath("//*[@id=\"includes-content\"]/div[1]/nav[3]/div/ul/li[3]/a");
    }



}
