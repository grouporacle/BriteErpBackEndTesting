$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\features\\Login.feature");
formatter.feature({
  "name": "login functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@BRIT-4441"
    }
  ]
});
formatter.background({
  "name": "automaticly gets in crm module every time",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user goes to url",
  "keyword": "Given "
});
formatter.match({
  "location": "login_step_definitions.the_user_goes_to_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"user\" enters valid email and password",
  "keyword": "When "
});
formatter.match({
  "location": "login_step_definitions.the_enters_valid_email_and_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on CRM module",
  "keyword": "When "
});
formatter.match({
  "location": "login_step_definitions.the_user_clicks_on_CRM_module()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check customer creation functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@BRIT-4441"
    }
  ]
});
formatter.step({
  "name": "the user clicks on Customers page",
  "keyword": "And "
});
formatter.match({
  "location": "login_step_definitions.the_user_clicks_on_Customers_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on Create button -Customers",
  "keyword": "Then "
});
formatter.match({
  "location": "login_step_definitions.the_user_clicks_on_Create_button_Customers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fill out file with proper informtion and create customer information",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "check if its match with db",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "name": "automaticly gets in crm module every time",
  "description": "",
  "keyword": "Background"
});
});