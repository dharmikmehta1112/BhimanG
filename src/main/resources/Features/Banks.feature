Feature: Test cases to verify and validate Banks option in Masters

@Regression
Scenario: To verify and validate Banks option in Masters.
	Given Mouse Hover to master for banks
	And Verify Banks option

@Regression	
Scenario: To verify and validate after click on Banks option in Masters
	Given Mouse Hover to master for banks
	Then Click on Banks
	And Verify Banks URL
	
@Regression
Scenario: Verifying click on Copy button in Banks page.
	Given Mouse Hover to master for banks
	Then Click on Banks
	Then Click on Copy button for banks
	And Verify copy text as 'Copy to clipboard' for banks
	
@Regression
Scenario: To verify and validate click on Excel button.
	Given Mouse Hover to master for banks
	Then Click on Banks
	Then Click on Excel button for banks
	And Verify excel file in path for banks
	
@Regression
Scenario: To verify and validate click on CSV button.
	Given Mouse Hover to master for banks
	Then Click on Banks
	Then Click on CSV button for banks
	And Verify CSV file in path for banks
	
@Regression
Scenario: To verify and validate click on PDF button.
	Given Mouse Hover to master for banks
	Then Click on Banks
	Then Click on PDF button for banks
	And Verify PDF file in path for banks

@Regression
Scenario: To verify and validate click on Print button.
	Given Mouse Hover to master for banks
	Then Click on Banks
	Then Click on Print button for banks
	And Verify Print URL for banks

