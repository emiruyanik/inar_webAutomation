package pages.autocomplete;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import java.util.List;

public class MultipleAndRemote extends BasePage {

    @FindBy(css = "#ui-id-43>li>div")
    private List<WebElement> birdNames;
    @FindBy(id = "tags-multipleremotes")
    private WebElement inputField;
    @FindBy(xpath = "//input[@id='tags-multipleremotes']/../span")
    private WebElement loadingSuggestionMessage;

    public MultipleAndRemote() {
        super();
    }

    public void sendLettersToTheTextField(String value) {
        inputField.sendKeys(value);
    }

    public List<String> getBirdNames() {
        return birdNames.stream().map(WebElement::getText).toList();
    }

    public String getLoadingMessage() {
        return loadingSuggestionMessage.getText();
    }

    public void clearTextField() {
        inputField.clear();
    }
}
