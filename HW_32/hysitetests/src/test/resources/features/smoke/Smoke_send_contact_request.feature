Feature: I as a customer I WTBAT have a possibility to send contact request.
Scenario:
Given I go to  https://www.hys-enterprise.com/
And I click on ‘Contact us’  button.
And on the opened page I find  ‘You Full Name’ field and enter there  ‘Full Name’ value.
And  I find  ‘You Email’ field and enter there  ‘_____@hys-enterprise.com’ value.
And  I find  ‘Your Phone Number’ field and enter there  ‘123456789’ value.
And  I find  ‘Your Country’ field and enter there  ‘Country’ value.
And  I find  ‘Message’ field and enter there  ‘Message’ value.
And I mark all necessary check-boxes.
When I click on ‘Send’ button
Then confirmation  message ‘Thank you for contacting us! Our team will respond to your request shortly!’ is displayed.
