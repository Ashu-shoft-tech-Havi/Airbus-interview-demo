Feature: Airbus Careers Website

  Scenario: As  User I Verify functionality for applying job page to Airbus Careers website
    Given I am on  Careers Homepage
    When  I accept all the cookies
    And I click On jobPage And and navigate to the Airbus Careers Website.
    And I enter job id  "JR10165372"
    And I click On Weeks from Posting Date
    And I click On Engineering from Job Category
    And I click On search button
    And I click On Job Title
    Then I click On Apply
    And I verify Text "Start Your Application"


