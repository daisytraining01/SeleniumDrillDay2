@Sample
Feature: Test to Add Recipient(Benificiary)
  
  @Test
  Scenario: Case is to add the recipient(Beneficiary)
    	
    	Given Launch url
    	And login with userName and password
    	When Home Page has Launched - Deposit Options are only available in Home Page
    	And Click on Transfer Menu
    	Then Click Add/Edit Recipient from Transfer Menu
    	Then Enter all the inputs
    	And Click on Add/Edit Recipient
    	Then check the added Recipient
    	
   @Test
   Scenario: Case is to Edit the Recipient(Beneficiary)
   		Given Launch url
    	And login with userName and password
    	When Home Page has Launched - Deposit Options are only available in Home Page
    	And Click on Transfer Menu
    	Then Click Add/Edit Recipient from Transfer Menu
    	And Click the First Entry
    	Then Enter all the inputs
    	And Click on Add/Edit Recipient
    	Then check the added Recipient
    	
    	
    	
    	
 


