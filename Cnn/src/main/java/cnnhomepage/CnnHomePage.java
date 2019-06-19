package cnnhomepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CnnHomePage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"nav\"]/div[2]/div[2]/a[1]")
    WebElement us;
    @FindBy(xpath = "//*[@id=\"nav-section-submenu\"]/a[1]")
    WebElement submenu;
    @FindBy(xpath = "//*[@id=\"nav-section-submenu\"]/a[2]")
    WebElement energy;



    public void searchFor(){
        clickByXpath("//*[@id='search-button']");
        typeByXpath("//*[@id='search-input-field']","queens news");
        clickByXpath("//*[@id='submit-button']");
    }

    public void checkplitics(){
        clickByXpath("//*[@id=\"nav\"]/div[2]/div[2]/a[3]");
        clickByXpath("//*[@id=\"nav\"]/div/div[2]/div[2]/ul[1]/li[2]/a");
        driver.navigate().back();
        clickByXpath("//*[@id=\"nav\"]/div/div[2]/div[2]/ul[1]/li[3]/a");
    }
    public void setforus() {
        us.click();
        submenu.click();
        driver.navigate().back();
        energy.click();
    }



}
