package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LiveVidoPage extends PageBase{
    public LiveVidoPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(linkText ="live")
    WebElement Live ;

    @FindBy(linkText = "see how it played out")
    WebElement Topic;

    @FindBy(id= "comments")
    WebElement CommentIcon;

    @FindBy(id = "field text")
    WebElement TextBox;

    @FindBy(id = "EmojiIcon")
    WebElement EmojiIcon;

    @FindBy(id = "Emoji")
    WebElement Emoji;

    @FindBy(id = "sendButton")
    WebElement SendButton;

    public void commentProcess(){
        Live.click();
        Topic.click();
        CommentIcon.click();
        TextBox.click();
        TextBox.sendKeys("this mesg should display successfully");
        EmojiIcon.click();
        Emoji.click();
        SendButton.click();
    }
}
