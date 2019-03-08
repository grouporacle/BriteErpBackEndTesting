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
  "name": "",
  "description": "",
  "keyword": "Background"
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
formatter.scenario({
  "name": "user login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@BRIT-4441"
    }
  ]
});
formatter.step({
  "name": "the \"user\" enters valid email and password",
  "keyword": "When "
});
formatter.match({
  "location": "login_step_definitions.the_enters_valid_email_and_password(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"id\",\"selector\":\"login\"}\n  (Session info: chrome\u003d72.0.3626.121)\n  (Driver info: chromedriver\u003d2.45.615291 (ec3682e3c9061c10f26ea9e5cdcf3c53f3f74387),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-2KH7HMM\u0027, ip: \u0027192.168.12.38\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.45.615291 (ec3682e3c9061c..., userDataDir: C:\\Users\\aibek\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:60520}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 72.0.3626.121, webStorageEnabled: true}\nSession ID: e379812813690ad6eb3874daf23d596d\n*** Element info: {Using\u003did, value\u003dlogin}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy14.sendKeys(Unknown Source)\r\n\tat pages.LoginPage.login(LoginPage.java:28)\r\n\tat step_definitions.login_step_definitions.the_enters_valid_email_and_password(login_step_definitions.java:29)\r\n\tat ✽.the \"user\" enters valid email and password(src\\test\\resources\\features\\Login.feature:13)\r\n",
  "status": "failed"
});
});