package testcitybankhomepage;

import base.CommonAPI;
import citybankhomepage.CItybankHomapge;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCitybankHomepage extends CommonAPI {

    CItybankHomapge testcitybank;
    String url ="https://citibank.com/";

    @BeforeMethod
    public void initialixation(){
        testcitybank = PageFactory.initElements(driver, CItybankHomapge.class);
        driver.get(url);
    }

    @Test
    public void SignIn(){
        testcitybank.SetsignIn();
    }
    @Test
    public void searchfor(){
        testcitybank.search();
    }
    @Test
    public void chosinaccount(){
        testcitybank.chosebanking();
    }
}
