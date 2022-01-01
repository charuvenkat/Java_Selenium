Feature: Login functionality of leaftaps application

Background:
Given open the chrome browser
And load the application url

Scenario Outline: Login with positive credential

Given Enter the username as <username>
And Enter the psssword as <password>

When click on login button
Then Homepage should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

Scenario Outline: Login with Negative credential
Given open the chrome browser
And load the application url
And Enter the username as 'demo'
And Enter the psssword as 'crmsf'

When click on login button
Then Error message should be displayed