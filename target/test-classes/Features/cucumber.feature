Feature: Verify the loginpage of facebook

  Scenario Outline: verify the facebook login data
    Given i am in login page
    When i enter valid "<username>" and "<password>"
    And i am enter login button
    Then i am verify th login successfull msg

    Examples: 
      | username | password    |
      | raja     | raja@7236   |
      | maruth   | maruthu@123 |
