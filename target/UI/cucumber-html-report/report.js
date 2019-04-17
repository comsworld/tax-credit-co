$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Kostadin Mladenov/Documents/Coding/IntelliJ Projects/onlineStore/src/test/resources/features/frontend/loginTest.feature");
formatter.feature({
  "name": "Login Action",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LoginTest"
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
  "name": "Validate username Kostadin Mladenov is displayed",
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
      "name": "@LoginTest"
    }
  ]
});
formatter.step({
  "name": "User navigates to Home Page using chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "UISteps.java:48"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters UserName",
  "keyword": "When "
});
formatter.match({
  "location": "UISteps.java:58"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Password",
  "keyword": "And "
});
formatter.match({
  "location": "UISteps.java:64"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate username Kostadin Mladenov is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "UISteps.java:73"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "LogOut",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginTest"
    }
  ]
});
formatter.step({
  "name": "User is logged in as Kostadin Mladenov",
  "keyword": "Given "
});
formatter.match({
  "location": "UISteps.java:77"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User LogOut from the Application",
  "keyword": "When "
});
formatter.match({
  "location": "UISteps.java:82"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Message displayed LogOut Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "UISteps.java:86"
});
formatter.result({
  "status": "passed"
});
});