Feature: Customer Login Functonality
@smoke
Scenario: I Verify CustomerLogin Functionality
Given My landing page 
When click on the Login menu
Then Click on the Customer Login Menu
Then I Enter User Id david@gmail.com
And  I Enter the Password as 1234
And We click on the Login Button
Then We Verify the my Home page