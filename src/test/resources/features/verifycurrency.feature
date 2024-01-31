
Feature: verify currency GBP,EUR AND SEK
  As a user I want to verify different currency

Scenario Outline: : Verify currency
  When I send a get request to bingo endPoint with currency as a "<Currency>"
Then I verify currency as a "<Currency>"
  Examples:
  |Currency|
  |GBP     |
  |EUR     |
  |SEK     |
