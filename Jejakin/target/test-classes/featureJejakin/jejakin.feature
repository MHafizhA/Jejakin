@Jejakin
Feature: Test functionality Jejakin

  @TCJ-01-Jejakin-User-Start-Jejakin
  Scenario: User Start Jejakin
    Given User navigate to Jejakin
    When user click button Start
    Then User successfully Start Jejakin

  @TCJ-02-Jejakin-User-Calculate-Carbon-Footprint-Jejakin
  Scenario: User Calculate Carbon Footprint Jejakin
    Given User navigate to Jejakin Carbon Page
    When User click icon Pencil
      And User input Departure airport
      And User click the result Departure
      And User input Arrival airport
      And User click the result Arrival
    Then Summary Flight Route appear and the result Carbon Footprint appear

  @TCJ-03-Jejakin-User-Edit-Flight-Route
  Scenario: User Edit Flight Route
    Given User navigate to Jejakin Carbon Page
    When User click icon Pencil
      And User input Departure airport
      And User click the result Departure
      And User input Arrival airport
      And User click the result Arrival
    Then Summary Flight Route appear and the result Carbon Footprint appear Edit
    When User click icon Pencil Flight Route
      And User input Departure airport Edit
      And User click the result Departure Edit
      And User input Arrival airport Edit
      And User click the result Arrival Edit
    Then User Successfully Edit Flight Route

  @TCJ-04-Jejakin-User-can-Edit-Passenger-Info-after-summary-calculate-carbon-footprint-appear
  Scenario: User can Edit Passenger Info after summary calculate carbon footprint appear
  Given User navigate to Jejakin Carbon Page
    When User click icon Pencil
      And User input Departure airport
      And User click the result Departure
      And User input Arrival airport
      And User click the result Arrival
    Then Summary Flight Route appear and the result Carbon Footprint appear Passenger Info
    When User click icon pencil Passenger Info
      And User select Business in Cabin Class
      And User select 2 in Number of Passenger - Seat two
      And User click button Save
    Then User Successfully Edit Passenger info to Business Class
      And User can see the result Carbon footprint
    When User click icon pencil Passenger info - Economy Class
      And User select Economy in Cabin Class
      And User select 3 in Number of Passenger - Seat three
      And User click button Save
    Then User Successfully Edit Passenger info to Economy Class
      And User can see the result Carbon footprint
    When User click icon pencil Passenger info - First Class
      And User select First Class in Cabin Class
      And User select 4 in Number of Passenger - Seat four
      And User click button Save
    Then User Successfully Edit Passenger info to First Class
      And User can see the result Carbon footprint

  @TCJ-05-Jejakin-User-can-Edit-Travel-Purpose-after-summary-calculate-carbon-footprint-appear
  Scenario: User can Edit Travel Purpose after summary calculate carbon footprint appear
    Given User navigate to Jejakin Carbon Page
    When User click icon Pencil
      And User input Departure airport
      And User click the result Departure
      And User input Arrival airport
      And User click the result Arrival
    Then Summary Flight Route appear and the result Carbon Footprint appear Travel Purpose
    When User click icon Pencil Travel Purpose - Leisure trip
    And User click button text Leisure trip
    Then User Successfully Edit Travel Purpose - Leisure trip
    When User click icon Pencil Travel Purpose - Family trip
    And User click button text Family trip
    Then User Successfully Edit Travel Purpose - Family trip
    When User click icon Pencil Travel Purpose - Business trip
    And User click button text Business trip
    Then User Successfully Edit Travel Purpose - Business trip
    When User click icon Pencil Travel Purpose - Custom trip
      And And User click button text Custom trip
      And User select Hotel Star - 2(two) Stars
      And User select How long are you stay - 3(three) Days
      And User select Average car distance per trip - 5(five) Km
      And User click button save Custom Trip
    Then User Successfully Edit Travel Purpose - Custom trip


#  Prototype
  @TCJ-06-Jejakin-Prototype
  Scenario: Prototype
    Given User navigate to Jejakin Carbon Page
    When User click icon Pencil
    And User input Departure airport
    And User click the result Departure
    And User input Arrival airport
    And User click the result Arrival
    Then Summary Flight Route appear and the result Carbon Footprint appear test
    When User click Take Action
    Then User can see the summary total order

