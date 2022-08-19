Feature: Checking the hotel booking functionality in the Adactin application

@SmokeTest
Scenario Outline: Login functionality
Given user Must Launch The Url
When user Enter The "<username>" In The Username Field
And user Enter The "<password>" In The Password Field
Then user Click The Login Key It Navigates To The Search Hotel Page

Examples:
|username|password|
|abc|123|
|xyz|456|
|nopassword|34567|
|dhanush5|dhanush5|

@SmokeTest
Scenario: Search hotel functionality
When user Select The Location In The Location Field
And user Select The Hotels In The Hotels Field
And user Select The Room In The Room Field
And user Select The Number Of Rooms In The Number Of Rooms Field
And user Enter The Check In Date In The Check In Date Field
And user Enter The Check Out Date In The Check Out Date Field
And user Select The Adults Per Room In The Adults Per Room Field
And user Select The Children Per Room In The Children Per Room Field
Then user Click The Search Key It Navigate To The Select Hotel Page

@SmokeTest
Scenario: Select hotel functionality
When user Select Hotel In The Select Hotel Field 
Then user Click The Continue Key It Navigate To The Book Hotel Page

@SmokeTest
Scenario: Book hotel functionality
When user Enter The First Name In The First Name Field
And user Enter The Last Name In The Last Name Field 
And user Enter The Billing Address In The Billing Address Field
And user Enter The Credit Card Number In The Credit Card Number Field
And user Select The Credit Card Type In The Credit Card Type Field
And user Select Expiry Month And Year In The Expiry Date Field
And user Enter The Cvv Number In The Cvv Number Field
And user Click The Book Now Key And Hotel Is Booked
Then user Click The Logout Key And It Navigate To First Page



