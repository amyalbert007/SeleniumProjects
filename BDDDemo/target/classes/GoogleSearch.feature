Feature: Google search feature
  This feature helps user to search an appropriate information using google search engin.
  
   Scenario: User want to search an information on given topic
    Given User should open Google Home Page
    When User enterd 'Agile Methodolgy' in search box  
    And click on submit button
    Then Multiple Links should be displayed on 'Agile Methodolgy' topic
    
    Scenario: User wants to search distance between two cities
    Given User should open Google Home Page
    When User enterd 'Pune Mumbai Distance' in serach box
    And click on submit button
    Then google should display map between 'Pune and Mumbai' and also display the distance in KM
    
     Scenario Outline: User wants to translate word from one language to another language
    	Given User should open Google translater page
    	When User enterd "<Word>" into "<From>" language and select "<To>" language
    	Then Google translater should display "<Word>" into "<To>" language

    Examples: 
      |Word        | From    	| To      |
      |Abstraction | English 	| Marathi |
      |Fire     	 | English 	| French  |
      |Happy 			 | English 	| Marathi |