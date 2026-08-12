package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class VacanciesPage {

    private final SelenideElement vacanciesPageTitle = $("[class*='headlines']");
    private final SelenideElement aqaJavaVacancy = $("[href*='aqa-java']");

    public void openPage() {
        open("/vacancies");
    }

    public void checkPageTitle(String title) {
        vacanciesPageTitle.shouldHave(text(title));
    }

    public void checkThatVacancyAqaJavaIsActual() {
        aqaJavaVacancy.shouldBe(visible);
    }
}
