package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class VacanciesPageTests extends BaseTest{

    @Test
    @DisplayName("Check that vacancies page has correct title")
    void checkPageTitle() {

        step("Open vacancies page", () -> {
            vacanciesPage.openPage();
        });

        step("Check vacancies page title", () -> {
            vacanciesPage.checkPageTitle(data.vacanciesPageTitle);
        });
    }

    @Test
    @DisplayName("Check that vacancy AQA (Java) Engineer is actual")
    void checkVacancy() {

        step("Open vacancies page", () -> {
            vacanciesPage.openPage();
        });

        step("Check is vacancy AQA (Java) Engineer is actual", () -> {
            vacanciesPage.checkThatVacancyAqaJavaIsActual();
        });
    }
}
