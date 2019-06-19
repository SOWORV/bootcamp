package cignahomepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.nio.file.Watchable;

public class CignaHomepage extends CommonAPI {



    public void setSignIn(){
        typeByXpath("//*[@id='username']","ahmed@gmail.com");
        typeByXpath("//*[@id='password']","strdg");
        clickByXpath("//*[@id='loginbutton']");


    }
    public void resetidandpass(){
        clickByXpath("//*[@id='forgotusername']/a");
        clickByXpath("//*[@id='forgotpassword']/a");
    }



    public void clickonSignIn(){
        clickByXpath("//*[@id=\"includes-content\"]/div[1]/nav[2]/div/ul/li[2]/a");



    }
    public void helthcare(){
        clickByXpath("//*[@id=\"includes-content\"]/div[1]/nav[3]/div/ul/li[3]/a");
    }



}
