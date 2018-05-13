Feature: Loan application screen

Scenario Outline: As a customer, I want to borrow information about my spending goal
Given the customer wants information about a loan
When the customer wants a loan for "<loan type>"
Then the customer receives the information text "<target information>"
Examples:
| loan type          | target information                                                                |
| Boodschappen       | U kunt wellicht beter geen lening nemen als deze enkel voor boodschappen bedoeld is.                         |
| Beleggingen        | U kunt wellicht beter geen lening nemen als deze enkel voor beleggingen bedoeld is.                          |
| Rekeningen betalen | Waarschijnlijk is een Doorlopend krediet of een Persoonlijke lening de beste keus voor u.                    |
| Meubels            | Waarschijnlijk is een Flitskrediet of een Persoonlijke lening de beste keus voor u.                          |
| Auto               | Voor de aankoop van een auto is de Autolening de beste keus.                                                 |
| Verbouwing         | Bij een verbouwing aan een huis is een Persoonlijke lening, Doorlopend krediet of WOZ-krediet de beste keus. |
| Huis               | Voor een huis is een Hypotheek de beste keus qua lening.                                                     |

#Scenario Outline: As a customer, I want to be able to indicate how much I want to borrow with which type of loan
#Given the customer has made a loan choice
#When the customer chooses a "<loan type>" of "<amount>" euro
#Then the customer can confirm his choice
#Examples:
#| loan type           | amount |
#| Flitskrediet        | 300    |
#| Persoonlijke lening | 1500   |
#| Doorlopend krediet  | 2500   |
#| Autolening          | 2000   |
#| WOZ-krediet         | 10000  |
#| Hypotheek           | 50000  |