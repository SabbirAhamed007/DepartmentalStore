$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MacysSmoke.feature");
formatter.feature({
  "line": 1,
  "name": "Test Macysdepartmentalstore",
  "description": "",
  "id": "test-macysdepartmentalstore",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Smoke Test of Macysdepartmentalstore scenario",
  "description": "",
  "id": "test-macysdepartmentalstore;smoke-test-of-macysdepartmentalstore-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I want to open chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I verify shop by department button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "MacysSmokeTest.i_want_to_open_chrome_browser()"
});
formatter.result({
  "duration": 16727393400,
  "status": "passed"
});
formatter.match({
  "location": "MacysSmokeTest.i_verify_shop_by_department_button()"
});
formatter.result({
  "duration": 696774500,
  "status": "passed"
});
formatter.match({
  "location": "MacysSmokeTest.i_close_the_browser()"
});
formatter.result({
  "duration": 1129677500,
  "status": "passed"
});
});