package pages;

import com.codeborne.selenide.Condition;
import constants.Constant;
import io.qameta.allure.Step;

import java.util.concurrent.TimeoutException;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.switchTo;


public class SettingsPage {

    @Step("открываем настройки расширения")
    public void openExtensionSettingsPage() {
        open(Constant.EXTENSION_SETTINGS_PAGE);
    }

    @Step("выключаем все группы фильтров")
    public void disableAllFiltersGroup() {
        $("a[data-tab=\"#antibanner\"]").click();
        $("#category1 > div.opt-state").click();
        $("#category6 > div.opt-state").click();
    }

    @Step("включаем Custom группу")
    public void enableCustomFiltersGroup() {
        $("#category0 > div.opt-state").click();
    }

    @Step("добавляем кастомный фильтр")
    public void addCustomFilter(String s) {
        $("#category0 > a").click();
        $(".empty-filters__btn").click();
        $("#custom-filter-popup-url").sendKeys(s);
        $(".custom-filter-popup-next").click();
        $("#add-custom-filter-step-4  #custom-filter-popup-added-url").shouldHave(Condition.text(s));
        $("#add-custom-filter-step-4  .settings-checkboxes__label").click();
        $("#add-custom-filter-step-4  #custom-filter-popup-added-subscribe").click();
    }

    @Step("закрываем welcome page чтобы не мешалась")
    public void closeWelcomePage() {
        switchTo().window(1);
        closeWindow();
        switchTo().window(0);
    }

    @Step("проверяем, что тесты пройдены")
    public void checkQUnit() throws TimeoutException {
        long TIMEOUT = 10000;
        long startTime = System.currentTimeMillis();
        long elapsed = 0;
        Boolean finished = false;

        while (elapsed < TIMEOUT) {
            finished = executeJavaScript("return QUnit.config.currentModule.testsRun == QUnit.config.currentModule.tests.length");
            if (finished != null && finished) {
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // Ignore
            }
            elapsed = System.currentTimeMillis() - startTime;
        }
        if (finished == null || !finished) {
            throw new TimeoutException("timeout exceeded");
        }

    }

    @Step("и на странице есть текст \"0 failed\"")
    public void testsPassed() {
        $("#qunit-testresult-display").shouldHave(Condition.text("0 failed"));
    }
}
