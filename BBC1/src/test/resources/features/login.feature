@login
Feature: Login

Scenario: Verify the functionality with invalid credentials
Given I am in homepage
When I click on signin icon
And I enters invalid credentials for login
|email|admin@gmail.com|
|password|Apple@12345|
And I click on login button
Then I should see the error message

@login-1
Scenario: Verify the login with blank plassword
Given I am in homepage
When I click on signin icon
And I enters invalid credentials for login
|email|admin@gmail.com|
|password||
And I click on login button
Then I should see the error message

@login-2
Scenario: Verify the login with blank email
Given I am in homepage
When I click on signin icon
And I enters invalid credentials for login
|email||
|password|Apple@12345|
And I click on login button
Then I should see the error message

@login-3
Scenario: Verify the login with invalid emailform
Given I am in homepage
When I click on signin icon
And I enters invalid credentials for login
|email|adminapple|
|password|Apple@12345|
And I click on login button
Then I should see the error message

@login-4
Scenario: Verify the login with only numeric password
Given I am in homepage
When I click on signin icon
And I enters invalid credentials for login
|email|admin@gmail.com|
|password|12|
And I click on login button
Then I should see the error message

@login-5
Scenario: Verify the login with blank field
Given I am in homepage
When I click on signin icon
And I enters invalid credentials for login
|email||
|password||
And I click on login button
Then I should see the error message
