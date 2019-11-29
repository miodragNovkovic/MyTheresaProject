package pageObjects;

import Logic.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BagsPage extends BasePage {


    //	Elements
    @FindBy(xpath = "//div[@class=\"search-result-intro\"]/p")
    public WebElement searchResults;



    public BagsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    //Methods




}



