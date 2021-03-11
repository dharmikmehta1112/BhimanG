Feature: Check Materials test scenarios

Scenario: To verify and validate Material tab
					Given click on material 
					Then verify and validate Material URL

Scenario: To verify and validate Text of Material
					Given verify and validate Material text 

Scenario: To verify and validate add material tab is clickable
					Given click on material 
					When click on add material 
					Then verify and validate add material tab	with URL	

Scenario: To verify and validate view material tab is clickable
					Given click on material
					When click on add material 
					Then click on view material tab
					Then verify and validate view material tab with URL		
	
Scenario: To verify and validate Date format in addMaterial
					Given click on material
					When click on add material 
					Then vrify and validate the Date format
					
Scenario: To verify and validate material name format
					Given click on material
					When click on add material 
					Then vrify and validate the valid material name enter

