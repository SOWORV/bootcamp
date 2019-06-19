package testfacebookhomepage;

import base.CommonAPI;
import facebookhomepage.FaceBookHomepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFacebookHomepage extends CommonAPI {

    FaceBookHomepage testfacebook;

    String url = "https://www.facebook.com/";

    @BeforeMethod
    public void initialization(){
        testfacebook = PageFactory.initElements(driver, FaceBookHomepage.class);
        driver.get(url);
    }
    @Test
    public void logintoFacebook(){
        testfacebook.facebooklogin();
    }


}
