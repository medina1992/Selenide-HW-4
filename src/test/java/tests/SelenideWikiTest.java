package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


public class SelenideWikiTest {

    @BeforeAll
    static void configureBrowser() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        baseUrl = "https://github.com/";


    }

    @Test
    void checkJUnit5ExampleInSoftAssertionsTest() {
        open(baseUrl + "/selenide/selenide");
        $("#wiki-tab").click();
        $(byXpath("//button[contains(text(), 'Show 3 more pages')]")).click();
        $$("a.Truncate-text").findBy(text("SoftAssertions")).click();

        $$("div.highlight-source-java pre")
                .findBy(text("@ExtendWith({SoftAssertsExtension.class})"))
                .shouldHave(
                        text("Configuration.assertionMode = SOFT"),
                        text("open(\"page.html\")"),
                        text("$(\"#first\").should(visible).click()"),
                        text("$(\"#second\").should(visible).click()")
                );
    }


}












