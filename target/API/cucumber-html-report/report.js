$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Kostadin Mladenov/Documents/Coding/IntelliJ Projects/onlineStore/src/test/resources/features/backend/Users.feature");
formatter.feature({
  "name": "Test for user get",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@APITest"
    }
  ]
});
formatter.scenario({
  "name": "Test individual user get",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@APITest"
    }
  ]
});
formatter.step({
  "name": "I request user information for userId 100",
  "keyword": "Given "
});
formatter.match({
  "location": "APIUserSteps.java:54"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Title contains at nam consequatur ea labore ea harum",
  "keyword": "Then "
});
formatter.match({
  "location": "APIUserSteps.java:69"
});
formatter.result({
  "status": "passed"
});
});