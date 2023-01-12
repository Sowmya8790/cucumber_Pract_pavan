$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Customer.feature");
formatter.feature({
  "name": "Customer",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Common steps in every scenario",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "- Launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "- User launch the URL -\"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_launch_the_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "- user should give email as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_should_give_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "- user should click on login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_should_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_can_view_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add new Customer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User click on customers men",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_click_on_customers_men()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on customers meny iteam",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.click_on_customers_meny_iteam()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Add new button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.click_on_Add_new_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view add new customer page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_can_view_add_new_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter customer info",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_enter_customer_info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on save button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.click_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can view confirmation message \"The new customer has been added successfully.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_can_view_confirmation_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "- I close the the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_close_the_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Common steps in every scenario",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "- Launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "- User launch the URL -\"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_launch_the_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "- user should give email as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_should_give_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "- user should click on login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_should_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_can_view_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search Custoer by EmailID",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "User click on customers men",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_click_on_customers_men()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on customers meny iteam",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.click_on_customers_meny_iteam()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter customer Email",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.enter_customer_Email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should found email in search table",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_should_found_email_in_search_table()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//table[@role\u003d\u0027grid\u0027]//tbody/tr/td[2]\"}\n  (Session info: chrome\u003d107.0.5304.107)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027IN-PG02LY71\u0027, ip: \u0027192.168.0.152\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 107.0.5304.107, chrome: {chromedriverVersion: 106.0.5249.61 (511755355844..., userDataDir: C:\\Users\\VSOWMY~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:58299}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: b9a3200e49a679ed06da8160981fe03e\n*** Element info: {Using\u003dxpath, value\u003d//table[@role\u003d\u0027grid\u0027]//tbody/tr/td[2]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat PageObjects.SearchCustPage.checkmail(SearchCustPage.java:122)\r\n\tat StepDefinitions.LoginSteps.user_should_found_email_in_search_table(LoginSteps.java:228)\r\n\tat ✽.User should found email in search table(file:Features/Customer.feature:27)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "- I close the the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_close_the_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "Common steps in every scenario",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "- Launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "- User launch the URL -\"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_launch_the_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "- user should give email as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_should_give_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "- user should click on login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_should_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_can_view_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search Customer by Name",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User click on customers men",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_click_on_customers_men()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on customers meny iteam",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.click_on_customers_meny_iteam()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter customer First name",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.enter_customer_First_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter customer Last name",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.enter_customer_Last_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should found Name in the Search Table",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_should_found_Name_in_the_Search_Table()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "- I close the the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_close_the_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/Login.feature");
formatter.feature({
  "name": "login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "test driven login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "- Launch the browser",
  "keyword": "Given "
});
formatter.step({
  "name": "- User launch the URL -\"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "name": "- user should give email as \"\u003cuser\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "- user should click on login",
  "keyword": "And "
});
formatter.step({
  "name": "- Page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "name": "- User click on logout link",
  "keyword": "When "
});
formatter.step({
  "name": "Page title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.step({
  "name": "- I close the the browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "user",
        "password"
      ]
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin"
      ]
    },
    {
      "cells": [
        "in6789@yourstore.com",
        "mi"
      ]
    }
  ]
});
formatter.scenario({
  "name": "test driven login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "- Launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "- User launch the URL -\"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_launch_the_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "- user should give email as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_should_give_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "- user should click on login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_should_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "- Page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "- User click on logout link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_click_on_logout_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "- I close the the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_close_the_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "test driven login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "- Launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "- User launch the URL -\"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_launch_the_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "- user should give email as \"in6789@yourstore.com\" and password as \"mi\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_should_give_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "- user should click on login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_should_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "- Page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.page_Title_should_be(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat StepDefinitions.LoginSteps.page_Title_should_be(LoginSteps.java:101)\r\n\tat ✽.- Page Title should be \"Dashboard / nopCommerce administration\"(file:Features/Login.feature:18)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "- User click on logout link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_click_on_logout_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Page title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.page_title_should_be(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "- I close the the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_close_the_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});