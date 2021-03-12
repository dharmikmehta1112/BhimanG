Feature: Check Brokers test scenarios

Scenario: To verify and validate Brokers option in Masters.
	Given Mouse Hover to master for brokers
	And Verify Brokers option
	
Scenario: To verify and validate after click on Brokers option in Masters
	Given Mouse Hover to master for brokers
	Then Click on Brokers
	And Verify and validate Brokers URL 
	
Scenario: Verifying click on Copy button in Brokers page.
	Given Mouse Hover to master for brokers
	Then Click on Brokers
	Then Click on Copy button on brokers
	And Verify Copy to Clipboard Text
	
Scenario: To verify and validate click on Excel button.
	Given Mouse Hover to master for brokers
	Then Click on Brokers
	Then Click on Excel button on brokers 
	And Verify excel file in path for brokers
	
Scenario: To verify and validate click on CSV button.
	Given Mouse Hover to master for brokers
	Then Click on Brokers
	Then Click on CSV button on brokers
	And Verify CSV file in path for brokers
	
Scenario: To verify and validate click on PDF button.
	Given Mouse Hover to master for brokers
	Then Click on Brokers
	Then Click on PDF button on brokers
	And Verify PDF file in path for brokers

Scenario: To verify and validate click on Print button.
	Given Mouse Hover to master for brokers
	Then Click on Brokers
	Then Click on Print button on brokers
	And Verify Print URL for brokers

