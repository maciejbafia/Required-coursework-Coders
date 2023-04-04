  Feature: Updating profile address

  Scenario Outline: Login into app then add and remove address from user info

    Given Not logged in but have created account while on the main page of app
    When Click Sign in on main page
    And Login to your account with "<email>" and "<password>"
    Then Create new address and fill address form, with "<alias>" "<address>" "<city>" "<postal code>" "<country>" "<state>" "<phone>"
    And Check your Addresses tab to see if "<user>" information like was updated and correct and match
    Examples:
    |user|alias|address|city|postal code|country|state|phone|email|password|
    |Domino|Dominik|polska 101|Krakow|90-210|UnitedStates|34|7777|takpachniestozlotych@mail.pl|testtest|
