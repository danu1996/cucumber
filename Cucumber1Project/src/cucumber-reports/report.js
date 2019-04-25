$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeleton/orderproductcs.feature");
formatter.feature({
  "name": "order product feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "login scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "url of TestMeApp",
  "keyword": "Given "
});
formatter.match({
  "location": "orderproductcs.url_of_TestMeApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters  userName and password",
  "keyword": "When "
});
formatter.match({
  "location": "orderproductcs.user_enters_userName_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add a new product",
  "keyword": "And "
});
formatter.match({
  "location": "orderproductcs.add_a_new_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "loginpage is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "orderproductcs.loginpage_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});