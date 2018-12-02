Feature: Login test for facebook
Scenario: Successful login with valid credentials
Given user in login page
When  i enter username and password
Then login should be sucessful