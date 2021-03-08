Feature: Check Login test scenarios.

Scenario:
		Given Enter valid mobile no.
		Given Enter valid password
		Then Click on Login button
		Then Click on OK button
		
Scenario:
		Given Enter invalid mobile no.
		Given Enter valid password
		Then Click on Login button
		Then Click on OK button
		
Scenario:
		Given Enter valid mobile no.
		Given Enter invalid password
		Then Click on Login button
		Then Click on OK button
		
Scenario:
		Given Enter invalid mobile no.
		Given Enter invalid password
		Then Click on Login button
		Then Click on OK button