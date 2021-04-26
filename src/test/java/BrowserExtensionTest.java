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

    @Test
    @DisplayName("Extended Css rules test")
    void extendedsccrulesTest() throws Exception {

        settingsPage.openExtensionSettingsPage();
        switchTo().window(0);
        settingsPage.disableAllFiltersGroup();
        settingsPage.enableCustomFiltersGroup();
        settingsPage.addCustomFilter(Constant.EXTENDED_CSS_RULES_TXT);
        sleep(2000);
        // закрываем welcome page чтобы не мешалась
        settingsPage.closeWelcomePage();

        open(Constant.EXTENDED_CSS_RULES_HTML);

        // проверяем что тесты пройдены
        settingsPage.checkQUnit();
        settingsPage.testsPassed();
    }
    @Test
    @DisplayName("Extended CSS rules injection into iframe created with js test")
    void extendedcssrulesinjTest() throws Exception {

        settingsPage.openExtensionSettingsPage();
        switchTo().window(0);
        settingsPage.disableAllFiltersGroup();
        settingsPage.enableCustomFiltersGroup();
        settingsPage.addCustomFilter(Constant.EXTENDED_CSS_RULES_INJECTION_INTO_IFRAME_CREATED_WITH_JS_TXT);
        sleep(2000);
        // закрываем welcome page чтобы не мешалась
        settingsPage.closeWelcomePage();

        open(Constant.EXTENDED_CSS_RULES_INJECTION_INTO_IFRAME_CREATED_WITH_JS_HTML);

        // проверяем что тесты пройдены
        settingsPage.checkQUnit();
        settingsPage.testsPassed();
    }

    @Test
    @DisplayName("Important rules test")
    void importantrulesTest() throws Exception {

        settingsPage.openExtensionSettingsPage();
        switchTo().window(0);
        settingsPage.disableAllFiltersGroup();
        settingsPage.enableCustomFiltersGroup();
        settingsPage.addCustomFilter(Constant.$IMPORTANT_RULES_TXT);
        sleep(2000);
        // закрываем welcome page чтобы не мешалась
        settingsPage.closeWelcomePage();

        open(Constant.$IMPORTANT_RULES_HTML);

        // проверяем что тесты пройдены
        settingsPage.checkQUnit();
        settingsPage.testsPassed();
    }

    @Test
    @DisplayName("Important rules vs urlblock exception test")
    void importantvsurlblockTest() throws Exception {

        settingsPage.openExtensionSettingsPage();
        switchTo().window(0);
        settingsPage.disableAllFiltersGroup();
        settingsPage.enableCustomFiltersGroup();
        settingsPage.addCustomFilter(Constant.$IMPORTANT_RULES_VS_$URLBLOCK_EXCEPTION_TXT);
        sleep(2000);
        // закрываем welcome page чтобы не мешалась
        settingsPage.closeWelcomePage();

        open(Constant.$IMPORTANT_RULES_VS_$URLBLOCK_EXCEPTION_HTML);

        // проверяем что тесты пройдены
        settingsPage.checkQUnit();
        settingsPage.testsPassed();
    }

    @Test
    @DisplayName("CSP rules test")
    void csprulesTest() throws Exception {

        settingsPage.openExtensionSettingsPage();
        switchTo().window(0);
        settingsPage.disableAllFiltersGroup();
        settingsPage.enableCustomFiltersGroup();
        settingsPage.addCustomFilter(Constant.$CSP_RULES_TXT);
        sleep(2000);
        // закрываем welcome page чтобы не мешалась
        settingsPage.closeWelcomePage();

        open(Constant.$CSP_RULES_HTML);

        // проверяем что тесты пройдены
        settingsPage.checkQUnit();
        settingsPage.testsPassed();
    }

    @Test
    @DisplayName("CSP exception rules test")
    void cspexceptionrulesTest() throws Exception {

        settingsPage.openExtensionSettingsPage();
        switchTo().window(0);
        settingsPage.disableAllFiltersGroup();
        settingsPage.enableCustomFiltersGroup();
        settingsPage.addCustomFilter(Constant.$CSP_EXCEPTION_RULES_TXT);
        sleep(2000);
        // закрываем welcome page чтобы не мешалась
        settingsPage.closeWelcomePage();

        open(Constant.$CSP_EXCEPTION_RULES_HTML);

        // проверяем что тесты пройдены
        settingsPage.checkQUnit();
        settingsPage.testsPassed();
    }

    @Test
    @DisplayName("Websocket blocking rules test")
    void websocketblockingrulesTest() throws Exception {

        settingsPage.openExtensionSettingsPage();
        switchTo().window(0);
        settingsPage.disableAllFiltersGroup();
        settingsPage.enableCustomFiltersGroup();
        settingsPage.addCustomFilter(Constant.$WEBSOCKET_BLOCKING_RULES_TXT);
        sleep(2000);
        // закрываем welcome page чтобы не мешалась
        settingsPage.closeWelcomePage();

        open(Constant.$WEBSOCKET_BLOCKING_RULES_HTML);

        // проверяем что тесты пройдены
        settingsPage.checkQUnit();
        settingsPage.testsPassed();
    }

    @Test
    @DisplayName("Script rules test")
    void scriptrulesTest() throws Exception {

        settingsPage.openExtensionSettingsPage();
        switchTo().window(0);
        settingsPage.disableAllFiltersGroup();
        settingsPage.enableCustomFiltersGroup();
        settingsPage.addCustomFilter(Constant.SCRIPT_RULES_TXT);
        sleep(2000);
        // закрываем welcome page чтобы не мешалась
        settingsPage.closeWelcomePage();

        open(Constant.SCRIPT_RULES_HTML);

        // проверяем что тесты пройдены
        settingsPage.checkQUnit();
        settingsPage.testsPassed();
    }

    @Test
    @DisplayName("Badfilter rules test")
    void badfilterrulesTest() throws Exception {

        settingsPage.openExtensionSettingsPage();
        switchTo().window(0);
        settingsPage.disableAllFiltersGroup();
        settingsPage.enableCustomFiltersGroup();
        settingsPage.addCustomFilter(Constant.$BADFILTER_RULES_TXT);
        sleep(2000);
        // закрываем welcome page чтобы не мешалась
        settingsPage.closeWelcomePage();

        open(Constant.$BADFILTER_RULES_HTML);

        // проверяем что тесты пройдены
        settingsPage.checkQUnit();
        settingsPage.testsPassed();
    }

    @Test
    @DisplayName("Redirect rules test")
    void redirectrulesTest() throws Exception {

        settingsPage.openExtensionSettingsPage();
        switchTo().window(0);
        settingsPage.disableAllFiltersGroup();
        settingsPage.enableCustomFiltersGroup();
        settingsPage.addCustomFilter(Constant.$REDIRECT_RULES_TXT);
        sleep(2000);
        // закрываем welcome page чтобы не мешалась
        settingsPage.closeWelcomePage();

        open(Constant.$REDIRECT_RULES_HTML);

        // проверяем что тесты пройдены
        settingsPage.checkQUnit();
        settingsPage.testsPassed();
    }

    @Test
    @DisplayName("Redirect resources security test")
    void redirectresourcessecurityTest() throws Exception {

        settingsPage.openExtensionSettingsPage();
        switchTo().window(0);
        settingsPage.disableAllFiltersGroup();
        settingsPage.enableCustomFiltersGroup();
        settingsPage.addCustomFilter(Constant.$REDIRECT_RESOURCES_SECURITY_TEST_TXT);
        sleep(2000);
        // закрываем welcome page чтобы не мешалась
        settingsPage.closeWelcomePage();

        open(Constant.$REDIRECT_RESOURCES_SECURITY_TEST_HTML);

        // проверяем что тесты пройдены
        settingsPage.checkQUnit();
        settingsPage.testsPassed();
    }

    @Test
    @DisplayName("Jsinject rules test")
    void jsinjectrulesTest() throws Exception {

        settingsPage.openExtensionSettingsPage();
        switchTo().window(0);
        settingsPage.disableAllFiltersGroup();
        settingsPage.enableCustomFiltersGroup();
        settingsPage.addCustomFilter(Constant.$JSINJECT_RULES_TXT);
        sleep(2000);
        // закрываем welcome page чтобы не мешалась
        settingsPage.closeWelcomePage();

        open(Constant.$JSINJECT_RULES_HTML);

        // проверяем что тесты пройдены
        settingsPage.checkQUnit();
        settingsPage.testsPassed();
    }

}
