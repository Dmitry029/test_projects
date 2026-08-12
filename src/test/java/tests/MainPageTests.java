package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@DisplayName("Main page tests")
public class MainPageTests extends BaseTest {

    @Test
    @DisplayName("Check that main page has correct title")
    void checkPageTitle() {

        step("Open main page", () -> {
            mainPage.openPage();
        });

        step("Check main page title", () -> {
            mainPage.checkPageTitle(data.mainPageTitle);
        });
    }

    @Test
    @DisplayName("Check main page section names")
    void checkSectionNames() {

        step("Open main page", () -> {
            mainPage.openPage();
        });

        step("Check main page section names", () -> {
            mainPage.checkSectionNames(data.expectedSectionNames);
        });
    }
}
