package Github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Githubi2 {


    @Test
    void homework6() {

        Configuration.browserSize = "1920x1080";
        open("https://github.com/");
        $(byText("Pricing")).scrollTo().hover();
        $(byText("Compare plans")).click();
        $("Header body").shouldHave(text("Choose the plan that’s right for you."));


    }

}
