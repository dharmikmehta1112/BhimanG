Feature: Check Banks test scenarios

Scenario: To verify and validate Banks option in Masters.
	Given Mouse Hover to master
	And Verify Banks option
	
Scenario: To verify and validate after click on Banks option in Masters
	Given Mouse Hover to master
	Then Click on Banks
	And Verify Banks URL
	
Scenario: Verifying click on Copy button in Banks page.
	Given Mouse Hover to master
	Then Click on Banks
	Then Click on Copy button
	
	
Scenario: To verify and validate click on Excel button.
	Given Mouse Hover to master
	Then Click on Banks
	Then Click on Excel button
	And Verify excel file in path
	
Scenario: To verify and validate click on CSV button.
	Given Mouse Hover to master
	Then Click on Banks
	Then Click on CSV button
	And Verify CSV file in path
	
Scenario: To verify and validate click on PDF button.
	Given Mouse Hover to master
	Then Click on Banks
	Then Click on PDF button
	And Verify PDF file in path

Scenario: To verify and validate click on Print button.
	Given Mouse Hover to master
	Then Click on Banks
	Then Click on Print button
	And Verify Print URL

