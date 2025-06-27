Feature: Verify the login feature for the Naukri application

Scenario: Verify the login feature by using the valid credentials

Given User should landed into Naukri login page
When User should click Login Icon
And User should fill the UserName and Password
And User should click the Login Button
Then User can navigated into Home Page