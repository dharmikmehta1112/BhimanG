Feature: Check Users test scenarios


Scenario: To verify and validate Users option in Masters.
					Given Mouse Hover to master
					And Verify Users option.
	
Scenario: To verify and validate after click on Users option in Masters.
					Given Mouse Hover to master
					Then Click on users
					And Verify users URL
					
Scenario: To verify and validate after click on View Users btn.
					Given Mouse Hover to master
					Then Click on users
					Then Click on add User
					Then click on view User
					And Verify view users URL

Scenario: To verify when enter a In-Valid user Name
					Given Mouse Hover to master
					Then Click on users
					And Click on add User
					Then varify and valid user name format

Scenario: To verify when enter a In-Valid user Name
					Given Mouse Hover to master
					Then Click on users
					And Click on add User
					Then varify and valid user name format
Scenario: To verify when enter a Valid mobile no
					Given Mouse Hover to master
					Then Click on users
					And Click on add User
					Then varify users enter a Valid mobile no

Scenario: To verify users  enter a Valid Email_id
					Given Mouse Hover to master
					Then Click on users
					And Click on add User
					Then varify users enter a Valid Email_id

Scenario: To verify users enter a  in valid joining date format
					Given Mouse Hover to master
					Then Click on users
					And Click on add User
					Then varify users enter a  in valid joining date format

Scenario: To verify users enter valid bank name for user
					Given Mouse Hover to master
					Then Click on users
					And Click on add User
					Then varify users enter a  valid bank name for user
					
Scenario: To verify users enter valid Account no for user Bank
					Given Mouse Hover to master
					Then Click on users
					And Click on add User
					Then varify users enter a  valid Account no for user Bank

Scenario: To verify and validate click on Copy button on User page
					Given Mouse Hover to master
					Then Click on users
					And Click on add User
					Then verify and validate click on Copy button on User page

Scenario: To verify and validate click on Excel button on User page
					Given Mouse Hover to master
					Then Click on users
					And Click on add User
					Then verify and validate click onExcel button and Users_download_filePath

Scenario: To verify and validate click on CSV button in User page
					Given Mouse Hover to master
					Then Click on users
					And Click on add User
					Then verify and validate click on CSV button and Users_download_filePath

Scenario: To verify and validate click on 'PDF' button in User page.
					Given Mouse Hover to master
					Then Click on users
					And Click on add User
					Then verify and validate click on PDF button and Users_download_filePath

Scenario: To verify and validate users should enter father name format
					Given Mouse Hover to master
					When Click on users
					And Click on add User
					Then Scroll page Vertically upto visibility of element
					And verify and validate users should enter father name 
					
Scenario: To verify and validate users should enter father_mobile no format 
					Given Mouse Hover to master
					When Click on users
					And Click on add User
					Then Scroll page Vertically upto visibility of element
					And verify and validate father_mobile no 

Scenario: To verify users enter a Valid occupation string format
					Given Mouse Hover to master
					When Click on users
					And Click on add User
					Then Scroll page Vertically upto visibility of element
					And verify and validate fatherV occupation string format is consider
					