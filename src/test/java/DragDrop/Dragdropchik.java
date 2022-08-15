package DragDrop;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Dragdropchik {

    @Test

    public void homeworkpatch2() {

        Configuration.browserSize = "1920x1080";
        open("https://the-internet.herokuapp.com/drag_and_drop");
        //НЕ РАБОТАЕТ
        //  actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(700,0).release().perform();
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-a").shouldHave(text("B"));


    }


}
