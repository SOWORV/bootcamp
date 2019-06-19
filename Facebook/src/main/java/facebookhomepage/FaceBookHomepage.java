package facebookhomepage;

import base.CommonAPI;

public class FaceBookHomepage extends CommonAPI {

    //testing for user to be able to log in using log in information ane are ble to click sign in

    public void facebooklogin(){
        typeByXpath("//*[@id=\"email\"]","sowrovahmed.410@gmail.com");
        typeByXpath("//*[@id=\"pass\"]","showrov3478");
        clickByXpath("//*[@id=\"u_0_2\"]");
    }


}
