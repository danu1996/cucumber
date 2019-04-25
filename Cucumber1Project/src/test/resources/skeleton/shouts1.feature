Feature: Login Feature
@valid
Scenario Outline: Valid User scenario
   Given The Url of TestMe App
   When Uesr Enters <Username> as Username
   And  Uesr Enters <Password> as Password
  Then User is in <Page>
  
Examples:
|Username |Password |Page|
|Lalitha |Password123|Home|
|admin|Password456|Admin Home|
@invalid
Scenario: inValid  scenario
 Given The Url of TestMe App
  When User Enters invalid date
  |abcxyz|Password123|
  |Lalitha|abc1223|
  |abc123|abc123|
Then User is in loginpage
  
|abc|
|ddc|
|hdc|



#Scenario: Valid User scenario
  # Given The Url of TestMe App
 #  When Uesr Enters "admin" as Username
   #And  Uesr Enters "Password456" as Password
 # Then User is in Home Page
 
  