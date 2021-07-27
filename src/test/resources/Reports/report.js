$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/LoginScenario.feature");
formatter.feature({
  "name": "To validate the login functionality of Facebook application",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "The user should be in Facebook page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginFunction.the_user_should_be_in_Facebook_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the signup page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "The user Click the SignUp button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginFunction.the_user_Click_the_SignUp_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[@data-testid\u003d\u0027open-registration-form-button\u0027]\"}\n  (Session info: chrome\u003d45.0.2454.85)\n  (Driver info: chromedriver\u003d2.20.353145 (343b531d31eeb933ec778dbcf7081628a1396067),platform\u003dWindows NT 5.2 SP2 x86) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027YOURPC\u0027, ip: \u0027192.168.43.59\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCapabilities {acceptSslCerts: true, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {userDataDir: C:\\Windows\\proxy\\scoped_dir...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, platform: XP, platformName: XP, rotatable: false, takesHeapSnapshot: true, takesScreenshot: true, version: 45.0.2454.85, webStorageEnabled: true, webdriver.remote.sessionid: 4bf09d9b5598d8a672543a21dd1...}\nSession ID: 4bf09d9b5598d8a672543a21dd12bc80d6dc0d98\n*** Element info: {Using\u003dxpath, value\u003d//a[@data-testid\u003d\u0027open-registration-form-button\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat org.Base.BaseClass.ButtonClick(BaseClass.java:93)\r\n\tat stepdefinitions.LoginFunction.the_user_Click_the_SignUp_button(LoginFunction.java:49)\r\n\tat ✽.The user Click the SignUp button(file:src/test/resources/Features/LoginScenario.feature:15)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "The user Enter the firstname and lastname \"krishna\" \"priya\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginFunction.the_user_Enter_the_firstname_and_lastname(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The user verified the signup page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginFunction.the_user_verified_the_signup_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});