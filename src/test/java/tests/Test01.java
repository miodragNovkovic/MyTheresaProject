package tests;


import Logic.BasePage;
import Logic.Browser;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.BagsPage;
import pageObjects.HomePage;

public class Test01 {
    HomePage homePage;
    BagsPage bagsPage;

    @BeforeClass

    public void beforeClass(){
        Browser.initializeDriver();
        Browser.openURL("https://www.mytheresa.com/en-de/women.html" );
        homePage = new HomePage(Browser.driver, Browser.wait);
        bagsPage= new BagsPage(Browser.driver,Browser.wait);
    }

    @Test
    public void GucciBagsTest(){
        homePage.clickOnSeachBox();
        homePage.enterSearchText();
        homePage.clickOnSearchBttn();
        String actualResult= bagsPage.searchResults.getText();


        //Validating Test Case
        String expectedResult="SEARCH RESULTS FOR 'GUCCI BAGS'";

        Assert.assertEquals(actualResult,expectedResult);
        System.out.println(actualResult);


    }


    @AfterClass

    public void afterClass(){
        Browser.closeBrowser();

    }
}
