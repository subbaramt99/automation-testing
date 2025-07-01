#Author: Subbaram T

Feature: Login page test                             # feature

  @tag
  Scenario: Testing the login page
    Given launch the browser with url
		When user enter username and password
		And select the admin user as student
		Then click on login buttom
		

 