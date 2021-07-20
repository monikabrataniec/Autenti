package com.example.InterviewExercise;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class FormTestPage {
    public SelenideElement firstName = $x("//*[@id=\"post-body-3077692503353518311\"]/div/div/div[3]/input");
    public SelenideElement lastName = $x("//*[@id=\"post-body-3077692503353518311\"]/div/div/div[6]/input");
    public SelenideElement gender = $x("//*[@id=\"sex-1\"]");
    public SelenideElement yearsOfExperience = $x("//*[@id=\"exp-3\"]");
    public SelenideElement date = $x("//*[@id=\"datepicker\"]");
    public SelenideElement professionManualTester = $x("//*[@id=\"profession-0\"]");
    public SelenideElement professionAutomationTester = $x("//*[@id=\"profession-1\"]");
    public SelenideElement protractor = $x("//*[@id=\"tool-1\"]");
    public SelenideElement seleniumWebdriver = $x("//*[@id=\"tool-2\"]");
    public SelenideElement continent = $x("//*[@id=\"continents\"]");
    public SelenideElement multiCommands = $x("//*[@id=\"selenium_commands\"]");
    public SelenideElement submitButton = $x("//*[@id=\"submit\"]");
}
