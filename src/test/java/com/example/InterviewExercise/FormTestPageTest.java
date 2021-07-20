package com.example.InterviewExercise;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class FormTestPageTest {
    FormTestPage formTestPage = new FormTestPage();

    @BeforeClass
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeMethod
    public void setUp() {
        open("https://www.techlistic.com/p/selenium-practice-form.html");
    }

    @Test
    public void shouldFillTheForm() {
        formTestPage.firstName.setValue("Monika");
        formTestPage.lastName.setValue("Brataniec");
        formTestPage.gender.selectRadio("Female");
        formTestPage.yearsOfExperience.selectRadio("4");
        formTestPage.date.setValue("20-07-2021");
        formTestPage.professionManualTester.setSelected(true);
        formTestPage.professionAutomationTester.setSelected(true);
        formTestPage.protractor.setSelected(true);
        formTestPage.seleniumWebdriver.setSelected(true);
        formTestPage.continent.selectOption("Europe");
        formTestPage.multiCommands.selectOption("Wait Commands", "Browser Commands");
        //TODO: upload image
        formTestPage.submitButton.click();
    }
}
