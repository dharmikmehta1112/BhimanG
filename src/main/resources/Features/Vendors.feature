Feature: Check Vendors test scenarios


Scenario: To verify and validate Vendors option in Masters.
	Given Mouse Hover to master for vendors
	And Verify Vendors option
	
Scenario: To verify and validate after click on Vendors option in Masters
	Given Mouse Hover to master for vendors
	Then Click on Vendors
	And Verify and validate Vendors URL 
	
Scenario: Verifying click on Copy button in Vendors page.
	Given Mouse Hover to master for vendors
	Then Click on Vendors
	Then Click on Copy button on vendors
	And Verify Copy to Clipboard Text
	
Scenario: To verify and validate click on Excel button.
	Given Mouse Hover to master for vendors
	Then Click on Vendors
	Then Click on Excel button on vendors 
	And Verify excel file in path for vendors
	
Scenario: To verify and validate click on CSV button.
	Given Mouse Hover to master for vendors
	Then Click on Vendors
	Then Click on CSV button on vendors
	And Verify CSV file in path for vendors
	
Scenario: To verify and validate click on PDF button.
	Given Mouse Hover to master for vendors
	Then Click on Vendors
	Then Click on PDF button on vendors
	And Verify PDF file in path for vendors

Scenario: To verify and validate click on Print button.
	Given Mouse Hover to master for vendors
	Then Click on Vendors
	Then Click on Print button on vendors
	And Verify Print URL for vendors