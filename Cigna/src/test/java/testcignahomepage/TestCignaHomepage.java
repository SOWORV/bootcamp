package testcignahomepage;

import base.CommonAPI;
import cignahomepage.CignaHomepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCignaHomepage extends CommonAPI {

    CignaHomepage testcigna;

    String url ="https://www.cigna.com/";

    @BeforeMethod
    public void initialization(){
        testcigna = PageFactory.initElements(driver, CignaHomepage.class);
        driver.get(url);
    }

    @Test
    public void SignIn(){
        testcigna.clickonSignIn();
        driver.navigate().to("https://my.cigna.com/web/public/guest");
        testcigna.setSignIn();
        driver.navigate().to(url);
    }
    @Test
    public void resetaccout(){
        testcigna.clickonSignIn();

        //driver.navigate().to("https://my.cigna.com/web/public/guest");
        testcigna.resetidandpass();
        driver.navigate().to(url);
    }
    @Test
    public void clickfinddoctor(){
        testcigna.helthcare();
        driver.navigate().to(url);
    }
}
