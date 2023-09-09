Feature: Test Driven Development


  @SO @Smoke
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with "<name>" testing4
    When I check for the "<age>" in step testing4
    Then I verify the "<city>" in step testing4

    Examples: 
      | name  | age | city  |
      | Kalyani |     15 | Bhandara |
      | Ragini |     17 | Chandrapur|
      | Kauntubh |     27 | WB|
      | Surekha |     19 | Wardha|
      | Tanaya |     47 | Pune|
      | Shubhangi |     37 | MP|
      