$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:FeatureFiles/conferenceBooking.feature");
formatter.feature({
  "name": "Conference Booking",
  "description": "This feature will test conferenece booking for an event",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Register"
    }
  ]
});
formatter.scenario({
  "name": "User click next without entering any details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Register"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User  should on Registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_should_on_Registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is on Registration page",
  "keyword": "When "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_is_on_registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select Next without filling FirstName",
  "keyword": "When "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_select_without_filling()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027Please fill the First Name\u0027 message will display",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.message_will_display(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User click next after entering FirstName.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Register"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User  should on Registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_should_on_Registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select Next without filling LastName in Registration",
  "keyword": "When "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_select_Next_without_filling_LastName_in_Registration()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027Please fill the Last Nam\u0027 message will display",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.message_will_display(java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c...se fill the Last Nam[e]\u003e but was:\u003c...se fill the Last Nam[]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.cg.project.stepdefs.GoogleSearchStepDef.message_will_display(GoogleSearchStepDef.java:311)\r\n\tat ✽.\u0027Please fill the Last Nam\u0027 message will display(file:///C:/Users/1%20able%20technology/Desktop/JAVA_PROGRAMS/ConferenceBooking/FeatureFiles/conferenceBooking.feature:14)\r\n",
  "status": "failed"
});
formatter.after({
  "error_message": "org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : Please fill the Last Name}\n  (Session info: chrome\u003d91.0.4472.164): Please fill the Last Name\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-06IF3GL\u0027, ip: \u0027192.168.43.225\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 91.0.4472.164, chrome: {chromedriverVersion: 91.0.4472.101 (af52a90bf870..., userDataDir: C:\\Users\\1ABLET~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:56805}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: c7df85d2c38ee012043a4a3f197f7901\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:120)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:295)\r\n\tat com.cg.project.stepdefs.GoogleSearchStepDef.tearDownScenarioEnv(GoogleSearchStepDef.java:409)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "User click next after entering FirstName",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Register"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User  should on Registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_should_on_Registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select Next without filling LastName",
  "keyword": "When "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_select_Next_without_filling_LastName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027Please fill the Last Name\u0027 message will display",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.message_will_display(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User click next after entering LastName",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Register"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User  should on Registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_should_on_Registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select Next without filling Email",
  "keyword": "When "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_select_Next_without_filling_Email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027Please fill the Email\u0027 message will display",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.message_will_display(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User clicks Next after entering invalid Email",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Register"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User  should on Registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_should_on_Registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select Next on filling invalid email",
  "keyword": "When "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_select_Next_on_filling_invalid_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027Please enter valid Email Id.\u0027 message will display",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.message_will_display(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User clicks Next after entering valid email",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Register"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User  should on Registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_should_on_Registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select Next without filling contact",
  "keyword": "When "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_select_Next_without_filling_contact()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027Please fill the Contact No.\u0027 message will display",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.message_will_display(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User clicks Next after entering invalid contact",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Register"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User  should on Registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_should_on_Registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select Next on filling invalid contact",
  "keyword": "When "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_select_Next_on_filling_invalid_contact()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027Enter 10-digit Contact no.\u0027 message will display",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.message_will_display(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User select Next without selecting Number of people attending",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Register"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User  should on Registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_should_on_Registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select Next without selecting Number of people attending",
  "keyword": "When "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_select_Next_without_selecting_Number_of_people_attending()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027Please fill the Number of people attendin\u0027 message will display",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.message_will_display(java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c...r of people attendin[g]\u003e but was:\u003c...r of people attendin[]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.cg.project.stepdefs.GoogleSearchStepDef.message_will_display(GoogleSearchStepDef.java:311)\r\n\tat ✽.\u0027Please fill the Number of people attendin\u0027 message will display(file:///C:/Users/1%20able%20technology/Desktop/JAVA_PROGRAMS/ConferenceBooking/FeatureFiles/conferenceBooking.feature:49)\r\n",
  "status": "failed"
});
formatter.after({
  "error_message": "org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : Please fill the Number of people attending}\n  (Session info: chrome\u003d91.0.4472.164): Please fill the Number of people attending\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-06IF3GL\u0027, ip: \u0027192.168.43.225\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 91.0.4472.164, chrome: {chromedriverVersion: 91.0.4472.101 (af52a90bf870..., userDataDir: C:\\Users\\1ABLET~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:50245}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 725578085624f02b10d10a9864fa7486\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:120)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:295)\r\n\tat com.cg.project.stepdefs.GoogleSearchStepDef.tearDownScenarioEnv(GoogleSearchStepDef.java:409)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "User select Next without filling Building Name \u0026 Room No",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Register"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User  should on Registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_should_on_Registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select Next without filling Building Name \u0026 Room No",
  "keyword": "When "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_select_Next_without_filling_Building_Name_Room_No()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027Please fill the Building \u0026 Room No\u0027 message will display",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.message_will_display(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User select Next without filling Area Name",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Register"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User  should on Registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_should_on_Registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select Next without filling Area Name",
  "keyword": "When "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_select_Next_without_filling_Area_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027Please fill the Area name\u0027 message will display",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.message_will_display(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User select Next without selecting City",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Register"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User  should on Registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_should_on_Registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select Next without selecting City",
  "keyword": "When "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_select_Next_without_selecting_City()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027Please select city\u0027 message will display",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.message_will_display(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User select Next without selecting State",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Register"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User  should on Registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_should_on_Registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select Next without selecting State",
  "keyword": "When "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_select_Next_without_selecting_State()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027Please select stat\u0027 message will display",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.message_will_display(java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003cPlease select stat[e]\u003e but was:\u003cPlease select stat[]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.cg.project.stepdefs.GoogleSearchStepDef.message_will_display(GoogleSearchStepDef.java:311)\r\n\tat ✽.\u0027Please select stat\u0027 message will display(file:///C:/Users/1%20able%20technology/Desktop/JAVA_PROGRAMS/ConferenceBooking/FeatureFiles/conferenceBooking.feature:69)\r\n",
  "status": "failed"
});
formatter.after({
  "error_message": "org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : Please select state}\n  (Session info: chrome\u003d91.0.4472.164): Please select state\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-06IF3GL\u0027, ip: \u0027192.168.43.225\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 91.0.4472.164, chrome: {chromedriverVersion: 91.0.4472.101 (af52a90bf870..., userDataDir: C:\\Users\\1ABLET~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:55565}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: f487e2e278c66e0d5771ae5f34f09352\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:120)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:295)\r\n\tat com.cg.project.stepdefs.GoogleSearchStepDef.tearDownScenarioEnv(GoogleSearchStepDef.java:409)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "User select Next without selecting Membership Status",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Register"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User  should on Registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_should_on_Registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select Next without selecting Membership Status",
  "keyword": "When "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_select_Next_without_selecting_Membership_Status()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027Please Select MemeberShip status\u0027 message will display",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.message_will_display(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User enters all details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Register"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User  should on Registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_should_on_Registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters all details",
  "keyword": "When "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_enters_all_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User goes on payment page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_goes_on_payment_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is on payment page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_is_on_payment_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters all payment details",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.user_enters_all_payment_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "message \u0027Registarion successful!!!\u0027 is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.GoogleSearchStepDef.message_is_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});