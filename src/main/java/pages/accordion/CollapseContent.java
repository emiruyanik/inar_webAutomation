package pages.accordion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class CollapseContent extends BasePage {
    @FindBy(css = "#accordion-2-cc>h3")
    private List<WebElement>contents;
    @FindBy(css = "#accordion-2-cc>h3>span")
    private List<WebElement>arrows;

    public void clickOnElement(int index){
      arrows.get(index).click();
    }
    public boolean isClicked(int index){
        return contents.get(index).getAttribute("class").contains("ui-state-active");
    }
}
