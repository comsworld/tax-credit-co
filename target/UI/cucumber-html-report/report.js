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
formatter.uri("C:/Users/Kostadin Mladenov/Documents/Coding/IntelliJ Projects/onlineStore/src/test/resources/features/frontend/newRegistration.feature");
formatter.feature({
  "name": "New Registration",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@NewRegistration"
    }
  ]
});
formatter.scenarioOutline({
  "name": ": User navigates to new registration page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to Home Page using \u003cbrowser\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks on new registration link",
  "keyword": "When "
});
formatter.step({
  "name": "User is taken to New Registration page",
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
  "name": ": User navigates to new registration page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@NewRegistration"
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
  "name": "User clicks on new registration link",
  "keyword": "When "
});
formatter.match({
  "location": "UISteps.java:100"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is taken to New Registration page",
  "keyword": "Then "
});
formatter.match({
  "location": "UISteps.java:104"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User fills required fields in New registration form",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@NewRegistration"
    }
  ]
});
formatter.step({
  "name": "The user is on the new registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "UISteps.java:108"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Name",
  "keyword": "When "
});
formatter.match({
  "location": "UISteps.java:112"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects България nationality from dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "UISteps.java:117"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Personal ID Number 7511133333",
  "keyword": "And "
});
formatter.match({
  "location": "UISteps.java:122"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters User Name SomeUsername",
  "keyword": "And "
});
formatter.match({
  "location": "UISteps.java:126"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email test@gmail.com",
  "keyword": "And "
});
formatter.match({
  "location": "UISteps.java:130"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters new password SomePassword",
  "keyword": "And "
});
formatter.match({
  "location": "UISteps.java:134"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User confirms password SomePassword",
  "keyword": "And "
});
formatter.match({
  "location": "UISteps.java:138"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User check Terms and Conditions box",
  "keyword": "And "
});
formatter.match({
  "location": "UISteps.java:142"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User checks the privacy policy box",
  "keyword": "And "
});
formatter.match({
  "location": "UISteps.java:147"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on cancel button",
  "keyword": "And "
});
formatter.match({
  "location": "UISteps.java:152"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is taken to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "UISteps.java:156"
});
formatter.result({
  "status": "passed"
});
});