package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebAutomationPage extends BasePage{
    @FindBy(linkText = "Draggable")
    private WebElement draggableLink;
    @FindBy(linkText = "Constrain Movement")
    private WebElement constrainMovementLink;

    public WebAutomationPage(){
        super();
    }
    public void clickOnDraggableLink(){
        draggableLink.click();
    }
    public void clickOnConstrainMovementLink(){
        constrainMovementLink.click();
    }

}
