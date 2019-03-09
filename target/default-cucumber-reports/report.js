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
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for title to be \"New - Odoo\". Current title: \"\" (tried for 20 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat utilities.BrowserUtils.explicitWaitTitleIs(BrowserUtils.java:75)\r\n\tat step_definitions.customerInfoCard_step_definition.sendkeys_from_excel_sheet(customerInfoCard_step_definition.java:43)\r\n\tat ✽.\"User\" sendKeys \"fill all lines out\" from excel \"Phase V\", \"CustomerCardInformation\" sheet(src\\test\\resources\\features\\CustomerInfoCard.feature:14)\r\nCaused by: org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d72.0.3626.121)\n  (Driver info: chromedriver\u003d2.45.615291 (ec3682e3c9061c10f26ea9e5cdcf3c53f3f74387),platform\u003dWindows NT 10.0.17763 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-VF4B918\u0027, ip: \u0027192.168.1.94\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.45.615291 (ec3682e3c9061c..., userDataDir: C:\\Users\\enes\\AppData\\Local...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:58217}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 72.0.3626.121, webStorageEnabled: true}\nSession ID: c9012f8435e679b6a485552e71bb5e0c\r\n\tat sun.reflect.GeneratedConstructorAccessor22.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getTitle(RemoteWebDriver.java:281)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$1.apply(ExpectedConditions.java:63)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$1.apply(ExpectedConditions.java:58)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:249)\r\n\tat utilities.BrowserUtils.explicitWaitTitleIs(BrowserUtils.java:75)\r\n\tat step_definitions.customerInfoCard_step_definition.sendkeys_from_excel_sheet(customerInfoCard_step_definition.java:43)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:57)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:44)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:67)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:22)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:72)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:122)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:64)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:131)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\r\n",
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