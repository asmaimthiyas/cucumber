Feature: newtours login

Scenario: login with valid id

Given user opens the newtours app
When user enters uname and pwd
And user clicks on login
Then verify the login process