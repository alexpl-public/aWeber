@smoke
Feature: User validations in actions
    Background:
        Given I landed on the my profile page

@smoke @run
Scenario: User should be able to change details in profile
    When I change my first name
    Then I change my last name
    And I change public display name
    When I add about me section
    Then I press on hide my Gravatar profile button
    And I press Save Profile Details button
    Then I verify that my personal data saved successfully


@smoke @run
Scenario: User should be able to add URL to the personal
    When I press Add button on profile link section
    And I enter URL together with description
    Then I press add site button
    And I verify url saved successfully






