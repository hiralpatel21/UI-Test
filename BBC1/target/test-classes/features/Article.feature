@record2
Feature: Read Article

Scenario Outline: Read Articles about all sport
Given I am in homepage
When I click on sport icon
And I click on "<keyword>" keyword
Then I should see the article about sport

Examples:
|Football|
|Cricket|
|Formula 1|
|Rugby U|
|Rugby L|
|Tennis|
|Golf|
|Boxing|
|Athletics|
|Olympic Games|

