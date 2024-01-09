package pages.drppable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Accept extends BasePage {
    @FindBy(id = "draggable-nonvalid-accept")
    private WebElement webElement1;
    @FindBy(id = "draggable-accept")
    private WebElement webElement2;
    @FindBy(id = "droppable-accept")
    private WebElement webElement3;

    public Accept() {
        super();
    }

    public void dragAndDropElement1() {
        actions.dragAndDrop(webElement1, webElement3).build().perform();
    }

    public void dragAndDropElement2() {
        actions.dragAndDrop(webElement2, webElement3).build().perform();
    }

    public String getClassAttributeOfWebElement3() {
        return webElement3.getAttribute("class");
    }
}
