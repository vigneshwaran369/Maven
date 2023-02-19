Feature: Order and cancel the Natural Sandlewood an Orange peel face wash in Nykaa website

Scenario: Select the product

Given User can launch the Nykaa url

When user can select the  face wash option  under the skin tab

And user can select the Nykaa Naturals face wash

Then user can successfully choose sandlewood and orange peel in the given shade


Scenario: Add to selected product in the bag

Given user can click the Add to bag

When user can click the Add to cart icon

And user can select the quantity in the given field

Then user can successfully click the Proceed button

Scenario: Sign in for get the product

Given user can click the login  button

When user can click the Enter the mobile number and enters the mobile number

And user can click the proceed button and enter the OTP which is received in the given mobile number

Then user can successfully navigate to the choose address option

Scenario: Add the delivery Address

Given user can click the Add new address

When user can enter the pincode

And user can enter the House/Flat/Office No

And user can enter the Road Name/Area/Colony

And user can click the default address 

And user can enters the Name, Mobile Number and email id in the given field

Then user can successfully  click the ship to this address button

Scenario: Payment for choosed product and take the screenshot for oder confimed page 

Given user can select the cash on delivery option

When user can click the place order button 

Then user can successfully see the oder confirmation id

Scenario: cancel the ordered product and take the screenshot of the order cancel page

Given user can click the profile icon 
 
When user can click the my orders for cancel the product

And user can click the order details 

And user can click the cancel order button

And user can click the reason for cancellation and click the cancel order button

Then user can successfully cancel the order by clicking the confirm button













 