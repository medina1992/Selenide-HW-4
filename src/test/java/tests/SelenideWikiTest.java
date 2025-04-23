package tests;

import com.codeborne.selenide.Condition;
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
        $("#wiki-wrapper").shouldHave(Condition.text("""
                @ExtendWith({SoftAssertsExtension.class})
                class Tests {
                  @Test
                  void test() {
                    Configuration.assertionMode = SOFT;
                    open("page.html");

                    $("#first").should(visible).click();
                    $("#second").should(visible).click();
                  }
                }"""));
    }


}












