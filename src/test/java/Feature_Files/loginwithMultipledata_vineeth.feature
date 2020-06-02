@Sample
Feature: ScenarioOutline

@Test
Scenario Outline: Login functionality

Given Launch url 

When I enter Username as "<username>" and Password as "<password>"

Then login should be unsuccessful


Examples:

| username  | password  | 
| vineeth | maveric@123 | 
| ram | Qwerty@63 |