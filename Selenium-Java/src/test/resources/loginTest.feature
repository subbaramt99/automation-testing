#Author: Subbaram T

Feature: Login page test                             # feature

	Background:
	Given launch the browser with url
		
		Scenario: Testing the login page1
		When user enter username and password "rahulshettyacademy" "learning"
		And select the admin user as student
		Then click on login buttom
		And closing the browser
		
	  Scenario: Testing the login page2
		When user enter username and password "rahulshettyacademy" "learning"
		And select the admin user as teacher
		Then click on login buttom
		And closing the browser
		
		Scenario Outline: Testing the login page3
		When user enter username and password "rahulshettyacademy" "learning"
		And select the admin user as consultant
		Then click on login buttom
		And add the product in cart "<phone>"
		And closing the browser
		
		Examples:
		|phone|
		|Blackberry|
		|iphone|
		|Samsung|
		
		

 