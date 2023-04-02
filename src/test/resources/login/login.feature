
Feature: Test orangehrm  #goal
Scenario: To test the login functionality 
Given open the browser and navigate to the login page 
When Enter the username "Admin"
And Enter the password "admin123"
And Click on login
Then I should see the login page  #outcome