Feature: visit facebook Homepage
#Scenario: login into facebook

#Given user can launch the url

#When user can enter the username and password in the textbox

#And user can click the login button

#Then user can login into their facebook page


Scenario Outline:login to the facebook

Given user can launch the url

When user can enter the username"<username>" and password"<password>" in the textbox

And user can click the login button

Then user can login into their facebook page

Examples:

|username|password|
|vigneshwaran269|vicky007|
|vicky369|vignesh007|





