package pages.components;

import com.codeborne.selenide.ElementsCollection;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;
import static org.assertj.core.api.Assertions.assertThat;

public class Header {

    private final ElementsCollection headerButtons = $$("[data-burger-link='false']");

    public void checkButtonNames(List<String> expectedNames) {
        List<String> actualNames = headerButtons.texts();
        assertThat(actualNames).containsAll(expectedNames);
    }
}
