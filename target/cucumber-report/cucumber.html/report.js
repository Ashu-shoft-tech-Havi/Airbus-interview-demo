$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AirBus.feature");
formatter.feature({
  "line": 1,
  "name": "Airbus Careers Website",
  "description": "",
  "id": "airbus-careers-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10308781600,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "As  User I Verify functionality for applying job page to Airbus Careers website",
  "description": "",
  "id": "airbus-careers-website;as--user-i-verify-functionality-for-applying-job-page-to-airbus-careers-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on  Careers Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I accept all the cookies",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click On jobPage And and navigate to the Airbus Careers Website.",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter job id  \"JR10165372\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click On Weeks from Posting Date",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click On Engineering from Job Category",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click On search button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click On Job Title",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click On Apply",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I verify Text \"Start Your Application\"",
  "keyword": "And "
});
formatter.match({
  "location": "AirBusSteps.asAUserIAmOnCareersHomepage()"
});
formatter.result({
  "duration": 1548632100,
  "status": "passed"
});
formatter.match({
  "location": "AirBusSteps.asAUserIClickOnCookies()"
});
formatter.result({
  "duration": 204074300,
  "status": "passed"
});
formatter.match({
  "location": "AirBusSteps.iClickOnJobPage()"
});
formatter.result({
  "duration": 190651200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "JR10165372",
      "offset": 17
    }
  ],
  "location": "AirBusSteps.asAUserIAmWriting(String)"
});
formatter.result({
  "duration": 3903516200,
  "status": "passed"
});
formatter.match({
  "location": "AirBusSteps.iClickOnWeeksFromPOstingDate()"
});
formatter.result({
  "duration": 255179500,
  "status": "passed"
});
formatter.match({
  "location": "AirBusSteps.iClickOnEngeneeringFromJobCategory()"
});
formatter.result({
  "duration": 392885300,
  "status": "passed"
});
formatter.match({
  "location": "AirBusSteps.iClockOnSearchbutton()"
});
formatter.result({
  "duration": 226254200,
  "status": "passed"
});
formatter.match({
  "location": "AirBusSteps.iClickOnSoftwareTestEngineer()"
});
formatter.result({
  "duration": 761177900,
  "status": "passed"
});
formatter.match({
  "location": "AirBusSteps.iClickOnApply()"
});
formatter.result({
  "duration": 522635900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Start Your Application",
      "offset": 15
    }
  ],
  "location": "AirBusSteps.iVerifyText(String)"
});
formatter.result({
  "duration": 66533900,
  "status": "passed"
});
formatter.after({
  "duration": 1434871900,
  "status": "passed"
});
});