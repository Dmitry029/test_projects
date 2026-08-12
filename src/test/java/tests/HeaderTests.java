package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@DisplayName("Header tests")
public class HeaderTests extends BaseTest {

    @DisplayName("Check header button names")
    @Test
    public void checkHeaderButtonNames() {
        step("Open main page", () -> {
            mainPage.openPage();
        });

        step("Check header button names", () -> {
            header.checkButtonNames(data.expectedButtonNames);
        });
    }
}
