import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import pages.*;
import constants.Constant;

public class BrowserExtensionTest extends TestBase  {
    SettingsPage settingsPage = new SettingsPage();
    @Test
    @DisplayName("Simple rules test")
    @Tag("Broken")
    void simpleRulesTest() throws Exception {

        //открываем настройки расширения
        settingsPage.openExtensionSettingsPage();
        // возвращаемся во вкладку настройки расширения, ибо назойливая welcome page
        switchTo().window(0);
        // выключаем все группы фильтров
        settingsPage.disableAllFiltersGroup();
        // включаем Custom группу
        settingsPage.enableCustomFiltersGroup();

        // добавляем кастомный фильтр
        settingsPage.addCustomFilter(Constant.SIMPLE_RULES_TXT);
        //необходимо подождать, потому что правила не применяются мгновенно
        sleep(2000);

        // закрываем welcome page чтобы не мешалась
        settingsPage.closeWelcomePage();

        // открываем тестовую страницу
        open(Constant.SIMPLE_RULES_HTML);

        // проверяем что тесты пройдены
        settingsPage.checkQUnit();
        settingsPage.testsPassed();
    }

    @Test
    @DisplayName("Generichide rules test")
    void generichideTest() throws Exception {

        //открываем настройки расширения
        settingsPage.openExtensionSettingsPage();
        // возвращаемся в настройки расширения, ибо назойливая welcome page
        switchTo().window(0);
        // выключаем все группы фильтров
        settingsPage.disableAllFiltersGroup();
        // включаем Custom группу
        settingsPage.enableCustomFiltersGroup();
        // добавляем кастомный фильтр
        settingsPage.addCustomFilter(Constant.GENERICHIDE_TXT);
        //необходимо подождать, потому что правила не применяются мгновенно
        sleep(2000);
        // закрываем welcome page чтобы не мешалась
        settingsPage.closeWelcomePage();
        // открываем тестовую страницу
        open(Constant.GENERICHIDE_HTML);
        // проверяем что тесты пройдены
        settingsPage.checkQUnit();
        settingsPage.testsPassed();
    }
    @Test
    @DisplayName("Scriptlet rules test")
    void scriptletTest() throws Exception {

        settingsPage.openExtensionSettingsPage();
        switchTo().window(0);
        settingsPage.disableAllFiltersGroup();
        settingsPage.enableCustomFiltersGroup();
        settingsPage.addCustomFilter(Constant.SCRIPTLET_RULES_TXT);
        sleep(2000);
        // закрываем welcome page чтобы не мешалась
        settingsPage.closeWelcomePage();

        open(Constant.SCRIPTLET_RULES_HTML);

        // проверяем что тесты пройдены
        settingsPage.checkQUnit();
        settingsPage.testsPassed();
    }
}
