package pages.autocomplete;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class AccentFolding extends BasePage {
    @FindBy(css = "#ui-id-40>li")
    private List<WebElement> names;
    @FindBy(id = "developer-accentFolding")
    private WebElement inputField;

    public AccentFolding() {
        super();
    }

    public void sendKeysToTheText(String name) {
        inputField.sendKeys(name);
    }

    public List<String> getNames() {
        return names.stream().map(WebElement::getText).toList();
    }

    public void cleanInputText() {
        inputField.clear();
    }
}
