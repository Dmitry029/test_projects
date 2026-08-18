package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

public class MainPage {
    private final SelenideElement pageLogo = $("[aria-label='modsen']");
    private final SelenideElement mainPageTitle = $("[class*='headlines']");
    private final ElementsCollection sections = $$("h2");

    public void openPage() {
        open("");
        pageLogo.shouldBe(visible);
    }

    public void checkPageTitle(String title) {
        mainPageTitle.shouldHave(text(title));
    }

    public void checkSectionNames(List<String> expectedNames) {
        List<String> actualNames = sections.texts();
        assertThat(actualNames).containsAll(expectedNames);
    }
}
