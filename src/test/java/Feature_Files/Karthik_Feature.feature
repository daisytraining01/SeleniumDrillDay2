@Sample
Feature:Login to bank URL
  
	@Register
	Scenario: Registration
		Given Launching application url on the Browser 
		And user clicks signUp buttton for registration
		When user enters  Registration form details
		And user submit signUp button 
		Then user will navigate to login page 
		
  
  @Register
  Scenario: login
    Given Launching application url on the Browser
    And login with userName and password
    Then click sign in button for succesfull login
    