$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/airlineBooking.feature");
formatter.feature({
  "name": "User should able to book airline ticket.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Select round trip with valid source and destination.",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User should launch chrome and search Nordica Airlines, select the URL.",
  "keyword": "Given "
});
formatter.match({
  "location": "AirlineBooking.user_should_launch_chrome_and_search_for_Nordica_Airlines_select_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the round trip radio",
  "keyword": "When "
});
formatter.match({
  "location": "AirlineBooking.user_should_click_the_round_trip_radio_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select the valid source",
  "rows": [
    {
      "cells": [
        "SrcLocation",
        "SrcCode"
      ]
    },
    {
      "cells": [
        "chennai",
        "c2"
      ]
    },
    {
      "cells": [
        "bangalore",
        "b2"
      ]
    },
    {
      "cells": [
        "madurai",
        "m2"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AirlineBooking.userShouldSelectTheValidSource(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select the valid destination",
  "rows": [
    {
      "cells": [
        "DestLocation",
        "DestCode"
      ]
    },
    {
      "cells": [
        "tiruvannamalai",
        "t01"
      ]
    },
    {
      "cells": [
        "tiruchy",
        "t02"
      ]
    },
    {
      "cells": [
        "tirupathi",
        "t03"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AirlineBooking.user_should_select_the_valid_destination(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select the start date and return date of travel",
  "keyword": "And "
});
formatter.match({
  "location": "AirlineBooking.user_should_select_the_start_date_and_return_date_of_travel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select the find flights button",
  "keyword": "And "
});
formatter.match({
  "location": "AirlineBooking.user_should_select_the_find_flights_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "List of available flights should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AirlineBooking.list_of_available_flights_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
});