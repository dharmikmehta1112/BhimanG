Feature: Test cases to verify and validate Branches option in Masters

@Regression
Scenario: To verify and validate Branches option in Masters.
	Given Mouse Hover to master for branches
	And Verify Branches option

@Regression	
Scenario: To verify and validate after click on Branches option in Masters
	Given Mouse Hover to master for branches
	Then Click on Branches
	And Verify Branches URL for branches
	
@Regression
Scenario: Verifying click on Copy button in Branches page.
	Given Mouse Hover to master for branches
	Then Click on Branches
	Then Click on Copy button for branches
	And Verify click on copy action for branches
	
@Regression
Scenario: To verify and validate click on Excel button.
	Given Mouse Hover to master for branches
	Then Click on Branches
	Then Click on Excel button for branches
	And Verify excel file in path for branches
	
@Regression
Scenario: To verify and validate click on CSV button.
	Given Mouse Hover to master for branches
	Then Click on Branches
	Then Click on CSV button for branches
	And Verify CSV file in path for branches
	
@Regression
Scenario: To verify and validate click on PDF button.
	Given Mouse Hover to master for branches
	Then Click on Branches
	Then Click on PDF button for branches
	And Verify PDF file in path for branches

@Regression
Scenario: To verify and validate click on Print button.
	Given Mouse Hover to master for branches
	Then Click on Branches
	Then Click on Print button for branches
	And Verify Print URL for branches

