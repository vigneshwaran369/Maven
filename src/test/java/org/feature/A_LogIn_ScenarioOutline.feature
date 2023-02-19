Feature: visit facebook  home page for fb
Scenario Outline:login to the facebook for fb

Given user  launch the url for fb

When user  enter the username"<user>" and password"<pass>" in the textbox for fb

And user  click the login button for fb

Then user  login into their facebook  page for fb
 



Examples:

|user|pass| 
|vigneshwaran269|vicky007|
|vicky369|vignesh007|
