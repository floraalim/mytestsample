*** Settings ***
Library	HttpRequestLibrary
*** Test Cases ***
Get Requests
    Create Session  google  http://www.google.com
    Create Session  httpbin     http://httpbin.org
    ${resp}=  Get Request  google  /
    Log To Console    ${resp.status_code} 
    Should Be Equal As Strings  ${resp.status_code}  200
    
    ${resp}=  Get Request  httpbin  /
    Should Be Equal As Strings  ${resp.status_code}  400
