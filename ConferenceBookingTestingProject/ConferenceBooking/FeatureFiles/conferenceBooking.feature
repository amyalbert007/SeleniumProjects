#@Register
Feature: Conference Booking
This feature will test conferenece booking for an event

Scenario: User click next without entering any details
Given User  should on Registration page
When User is on Registration page
When User select Next without filling FirstName
Then 'Please fill the First Name' message will display

Scenario: User click next after entering FirstName.
Given User  should on Registration page
When User select Next without filling LastName in Registration
Then 'Please fill the Last Nam' message will display

Scenario: User click next after entering FirstName
Given User  should on Registration page
When User select Next without filling LastName
Then 'Please fill the Last Name' message will display


Scenario: User click next after entering LastName
Given User  should on Registration page
When User select Next without filling Email
Then 'Please fill the Email' message will display



Scenario: User clicks Next after entering invalid Email
Given User  should on Registration page
When User select Next on filling invalid email
Then 'Please enter valid Email Id.' message will display


Scenario: User clicks Next after entering valid email
Given User  should on Registration page
When User select Next without filling contact
Then 'Please fill the Contact No.' message will display


Scenario: User clicks Next after entering invalid contact
Given User  should on Registration page
When User select Next on filling invalid contact
Then 'Enter 10-digit Contact no.' message will display

Scenario: User select Next without selecting Number of people attending
Given User  should on Registration page
When User select Next without selecting Number of people attending
Then 'Please fill the Number of people attendin' message will display

Scenario: User select Next without filling Building Name & Room No
Given User  should on Registration page
When User select Next without filling Building Name & Room No
Then 'Please fill the Building & Room No' message will display

Scenario: User select Next without filling Area Name
Given User  should on Registration page
When User select Next without filling Area Name
Then 'Please fill the Area name' message will display

Scenario: User select Next without selecting City
Given User  should on Registration page
When User select Next without selecting City
Then 'Please select city' message will display

Scenario: User select Next without selecting State
Given User  should on Registration page
When User select Next without selecting State
Then 'Please select stat' message will display

Scenario: User select Next without selecting Membership Status
Given User  should on Registration page
When User select Next without selecting Membership Status
Then 'Please Select MemeberShip status' message will display

Scenario: User enters all details
Given User  should on Registration page
When User enters all details
Then User goes on payment page
Then User is on payment page
Then User enters all payment details
Then message 'Registarion successful!!!' is displayed