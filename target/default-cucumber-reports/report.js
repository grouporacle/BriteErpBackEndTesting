$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\features\\CustomerInfoCard.feature");
formatter.feature({
  "name": "BriteErp Database and UI Data verification (user perspective)",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@BRIT-4441"
    }
  ]
});
formatter.background({
  "name": "",
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
formatter.scenario({
  "name": "The user fills out required lines from excel \"Phase V\", \"CustomerCardInformation\" sheet",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@BRIT-4441"
    }
  ]
});
formatter.step({
  "name": "the user is on Customers page",
  "keyword": "Given "
});
formatter.match({
  "location": "customerInfoCard_step_definition.the_user_is_on_Customers_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"User\" sendKeys \"fill all lines out\" from excel \"Phase V\", \"CustomerCardInformation\" sheet",
  "keyword": "When "
});
formatter.match({
  "location": "customerInfoCard_step_definition.sendkeys_from_excel_sheet(String,String,String,String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for title to be \"Aiman_LLC, Aiman\". Current title: \"Aiman_LLC, Aiman - Odoo\" (tried for 5 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-VF4B918\u0027, ip: \u0027192.168.1.94\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.45.615291 (ec3682e3c9061c..., userDataDir: C:\\Users\\enes\\AppData\\Local...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:55864}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 72.0.3626.121, webStorageEnabled: true}\nSession ID: 04dd590542174e8cf6da02f03b3232c3\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat utilities.BrowserUtils.explicitWaitTitleIs(BrowserUtils.java:75)\r\n\tat step_definitions.customerInfoCard_step_definition.sendkeys_from_excel_sheet(customerInfoCard_step_definition.java:97)\r\n\tat ✽.\"User\" sendKeys \"fill all lines out\" from excel \"Phase V\", \"CustomerCardInformation\" sheet(src\\test\\resources\\features\\CustomerInfoCard.feature:14)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "\"User\" clicks \"Save\" button",
  "keyword": "When "
});
formatter.match({
  "location": "customerInfoCard_step_definition.clicks_button(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "\"User\" should be able to see \"all new information\" on page from excel \"Phase V\", \"CustomerCardInformation\" sheet",
  "keyword": "Then "
});
formatter.match({
  "location": "customerInfoCard_step_definition.should_be_able_to_see_on_page_from_excel_sheet(String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "\"User\" should be able to see \"all new information\" in Database from excel \"Phase V\", \"CustomerCardInformation\" sheet",
  "keyword": "Then "
});
formatter.match({
  "location": "customerInfoCard_step_definition.should_be_able_to_see_in_Database_from_excel_sheet(String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
});