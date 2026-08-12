package tests.testdata;

import java.util.List;

public class TestData {
    public final String mainPageTitle = "Инновационные ИТ-решения для роста бизнеса";
    public final String vacanciesPageTitle = "Карьера в Модсен: вакансии для ИТ-специалистов";
    public List<String> expectedSectionNames = List.of(
        "Показатели, гарантирующие результат",
        "Наши услуги",
        "Получите бесплатную экспертную консультацию",
        "Международно признанная экспертиза",
        "Технологические компетенции",
        "Активное участие в мировом ИТ-сообществе",
        "Принципы нашей работы",
        "Проекты Модсен");

    public List<String> expectedButtonNames = List.of(
        "Портфолио",
        "О компании",
        "Вакансии",
        "Стажировка",
        "Контакты");
}