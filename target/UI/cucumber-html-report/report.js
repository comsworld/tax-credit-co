$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Kostadin Mladenov/Documents/Coding/IntelliJ Projects/onlineStore/src/test/resources/features/frontend/loginTest.feature");
formatter.feature({
  "name": "Login Action",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@UITest"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Login with Valid Credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to Home Page using \u003cbrowser\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters UserName",
  "keyword": "When "
});
formatter.step({
  "name": "User enters Password",
  "keyword": "And "
});
formatter.step({
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "browser"
      ]
    },
    {
      "cells": [
        "chrome"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with Valid Credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@UITest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to Home Page using chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "UISteps.User_is_on_Home_Page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters UserName",
  "keyword": "When "
});
formatter.match({
  "location": "UISteps.User_enters_UserName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Password",
  "keyword": "And "
});
formatter.match({
  "location": "UISteps.User_enters_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "UISteps.Message_displayed_Login_Successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "LogOut",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UITest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "UISteps.User_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User LogOut from the Application",
  "keyword": "When "
});
formatter.match({
  "location": "UISteps.User_LogOut_from_the_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Message displayed LogOut Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "UISteps.Message_displayed_LogOut_Successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});