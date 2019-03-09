$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\features\\CustomerInfoCard.feature");
formatter.feature({
  "name": "BriteErp Database and UI Data verification (user perspective)",
  "description": "",
  "keyword": "Feature"
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
formatter.before({
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
  "status": "passed"
});
});