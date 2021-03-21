Feature: Test cases to verify and validate Enquiry in Masters

@Regression
Scenario: Verify user should be able to navigate to enquiry page through master navigation tab
	Given User should be logged in
	When User move to master tab and clicks on enquiry subtab
	Then User should be navigated to enquiry page 
	
	@Regression
	Scenario: Verify user should be able to see Copy, Excel, CSV, PDF and Print buttons on enquiry page
	Given User should be logged in
	When User move to master tab and clicks on enquiry subtab
	Then user should be able to see Copy, Excel, CSV, PDF and Print buttons on enquiry page
	
	@Regression
	Scenario: Verify user should be able to see 'Add Enquiry' button on enquiry page
	Given User should be logged in
	When User move to master tab and clicks on enquiry subtab
	Then user should be able to see Add Enquiry buttons on enquiry page
	
	@Regression
	Scenario: Verify user should be able to see existing added enquiries in a table on enquiry page
	Given User should be logged in
	When User move to master tab and clicks on enquiry subtab
	Then user should be able to see existing added enquiries in a table on enquiry page
	
	@Regression
	Scenario: Verify user should be able to add enquiry using 'Add Enquiry' button on enquiry page
	Given User should be logged in
	When User move to master tab and clicks on enquiry subtab
	Then user should be able to  add enquiry using 'Add Enquiry' button on enquiry page
	
	@Regression
	Scenario: Verify user should be able to edit existing enquiry using 'Edit Enquiry' icon on enquiry page
	Given User should be logged in
	When User move to master tab and clicks on enquiry subtab
	Then user should be able to edit existing enquiry using 'Edit Enquiry' icon on enquiry page
	
	
	
	
