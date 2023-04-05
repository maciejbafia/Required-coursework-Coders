  Feature: Updating profile address

  Scenario Outline: Login into app then add and remove address from user info

    Given Not logged in but have created account while on the main page of app
    When Click Sign in on main page
    And Login to your account with "<email>" and "<password>"
    Then Create new address and fill address form, with "<alias>" "<address>" "<city>" "<postal code>" "<country_value>" "<phone>"
    And Check your Addresses tab to see if "<user>" information "<alias>" "<address>" "<city>" "<postal code>" "<country>" "<phone>" was updated and correct
    But Delete updated address and check if changes occurred
    Examples:
    |user|alias|address|city|postal code|country_value|phone|email|password|country|
    |Domino Jachas|Daniel|Wspolna|Wuxue|3310|17|911|takpachniestozlotych@mail.pl|testtest|United Kingdom|
    |Domino Jachas|Marian|Nasza|Krakow|90210|17|222222222222|takpachniestozlotych@mail.pl|testtest|United Kingdom|



