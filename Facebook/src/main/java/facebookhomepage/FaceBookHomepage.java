package facebookhomepage;

import base.CommonAPI;

public class FaceBookHomepage extends CommonAPI {

    public void facebooklogin(){
        typeByXpath("//*[@id=\"email\"]","sowrovahmed.410@gmail.com");
        typeByXpath("//*[@id=\"pass\"]","showrov3478");
        clickByXpath("//*[@id=\"u_0_2\"]");
    }

    public void clickhelp(){
        clickByXpath("//*[@title='Visit our Help Center.']");
    }
}
