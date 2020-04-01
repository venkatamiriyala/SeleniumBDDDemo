$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Registration.feature");
formatter.feature({
  "name": "User Email Registration",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should Able to register in the site with a valid Email ID",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch a browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_launch_a_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Opens URL \"http://automationpractice.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_Opens_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on Sign in link",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_Click_on_Sign_in_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Header should be AUTHENTICATION page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.page_Header_should_be_to_AUTHENTICATION_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enters Email as \"Ven1126@ven.com\" and Submits",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_Enters_Email_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Create an Account page should displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.create_an_Account_page_should_displayed()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"noSlide\"]/h1\"}\n  (Session info: chrome\u003d80.0.3987.149)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027RAVI\u0027, ip: \u002710.0.0.26\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.149, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\Admin\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:62733}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 1f1c6b093c39385ee92df73cf253e044\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"noSlide\"]/h1}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat pageObjects.RegistrationPage.verifyPageContent(RegistrationPage.java:124)\r\n\tat pageObjects.RegistrationPage.verifyCutomerPageHeader(RegistrationPage.java:83)\r\n\tat stepDefinitions.Steps.create_an_Account_page_should_displayed(Steps.java:94)\r\n\tat ✽.Create an Account page should displayed(file:///C:/MyProjects/UIAutomationSeleniumBDD/./Features/Registration.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Enter User Details and Register",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Steps.enter_User_Details_and_Address()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Email Registration must be Successful",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.User_Email_Registration_must_be_Successfull()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("file:Features/SummerDresses.feature");
formatter.feature({
  "name": "Summer Dresses MegaMenu and Grid Features",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify MegaMenu should work on Summer Dresses page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch a browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_launch_a_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Opens URL \"http://automationpractice.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_Opens_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks on Dress Mega Menu",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.userClicksOnDressMegaMenu()"
});
formatter.result({
  "error_message": "java.lang.ClassCastException: org.openqa.selenium.By$ByXPath cannot be cast to org.openqa.selenium.WebElement\r\n\tat pageObjects.DressesPage.clickDress(DressesPage.java:36)\r\n\tat stepDefinitions.Steps.userClicksOnDressMegaMenu(Steps.java:119)\r\n\tat ✽.User Clicks on Dress Mega Menu(file:///C:/MyProjects/UIAutomationSeleniumBDD/./Features/SummerDresses.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Dresses page should load",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.dressesPageShouldLoad()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User User Clicks on Summer Dresses Sub Menu",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.userUserClicksOnSummerDressesSubMenu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Megamenu should work on Summer DressPage",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.summerDressesPageShouldLoadAndMegamenuShouldWork()"
});
formatter.result({
  "status": "skipped"
});
});