Feature: Summer Dresses MegaMenu and Grid Features

  @sanity
  Scenario: Verify MegaMenu should work on Summer Dresses page
    Given 	User launch a browser
    When User Opens URL "http://automationpractice.com/"
    And User Clicks on Dress Mega Menu
    Then Dresses page should load
    When User User Clicks on Summer Dresses Sub Menu
    Then Megamenu should work on Summer DressPage
