$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("scenario.feature");
formatter.feature({
  "line": 1,
  "name": "my scenario",
  "description": "",
  "id": "my-scenario",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "#first scenario"
    }
  ],
  "line": 3,
  "name": "test monpower login page",
  "description": "",
  "id": "my-scenario;test-monpower-login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "enter usen name \"alim\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "passwor \"12345678\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "click the submit button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "goto the main page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "alim",
      "offset": 17
    }
  ],
  "location": "Newstep.enter_usen_name(String)"
});
formatter.result({
  "duration": 75637685,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345678",
      "offset": 9
    }
  ],
  "location": "Newstep.passwor(String)"
});
formatter.result({
  "duration": 139395,
  "status": "passed"
});
formatter.match({
  "location": "Newstep.click_the_submit_button()"
});
formatter.result({
  "duration": 84438,
  "status": "passed"
});
formatter.match({
  "location": "Newstep.goto_the_main_page()"
});
formatter.result({
  "duration": 72336,
  "status": "passed"
});
});