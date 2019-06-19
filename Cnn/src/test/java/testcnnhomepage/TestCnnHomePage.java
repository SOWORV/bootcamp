package testcnnhomepage;

import base.CommonAPI;
import cnnhomepage.CnnHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCnnHomePage extends CommonAPI {
    CnnHomePage testcnnnews;

    String url ="https://www.cnn.com/";

    @BeforeMethod
    public void initialization(){
        testcnnnews = PageFactory.initElements(driver, CnnHomePage.class);
        driver.get(url);

    }
    @Test
    public void searchnews(){
        testcnnnews.searchFor();
    }
    @Test
    public void setnewsforus(){
        testcnnnews.setforus();
    }
    @Test
    public void checkpolitics(){
        testcnnnews.checkplitics();
    }
}
