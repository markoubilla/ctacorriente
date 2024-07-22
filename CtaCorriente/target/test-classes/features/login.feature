Feature: User login

Scenario: Ingreso de nombre de usuario con datos almacenados en BD
  Given I am on the login page
  When I enter a valid username
  Then I should see the welcome message

Scenario: Ingreso de nombre de usuario y password con datos erróneos
  Given I am on the login page
  When I enter an invalid username and password
  Then I should see an error message

Scenario: Registro de hora medica veterinaria
  Given I am on the appointment page
  When I schedule a veterinary appointment
  Then I should see the appointment confirmation
