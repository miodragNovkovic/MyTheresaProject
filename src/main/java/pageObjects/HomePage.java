package pageObjects;

import Logic.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {


    //	Elements
    @FindBy(xpath = "//input[@id=\"search\"]")
    private WebElement btnSearch;
    @FindBy(xpath = "//span[@id=\"search_callout\"]")
    private WebElement bttnClickOnSearch;

    //	Constructor
    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);

    }

    //Methods

    public HomePage clickOnSeachBox() {
        clickOnElement(btnSearch);
        return new HomePage(driver, wait);
    }

    public HomePage enterSearchText() {
        enterText(btnSearch, "Gucci Bags");
        return new HomePage(driver, wait);
    }

    public BasePage clickOnSearchBttn() {
      clickOnElement(bttnClickOnSearch);
        return new BagsPage(driver, wait);
    }


}
