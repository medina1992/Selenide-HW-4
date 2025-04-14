package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class SelenideWikiTest {

    @BeforeAll
    static void setUp() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void checkJUnit5ExampleInSoftAssertions() {
        open("https://github.com/selenide/selenide");

        $("a[href$='/selenide/wiki']").click();
        $("button.js-wiki-more-pages-link").click();
        $$("a.Truncate-text").findBy(text("SoftAssertions")).click();
        $$("span.pl-c1").findBy(text("ExtendWith")).shouldBe(visible);
    }
}
