Feature: User Login to TestMe Application

Scenario Outline: TestMe
When user launches the chrome and given the testme link  
When user click the sign-in link
When user enter the "<username>" in name field
When user enters the "<password>" in word field
When user click the login button
And validates the product

 Examples:
|name|word|
|choco111|icecream|
|akurat111|gnana111|