*** Settings ***
Library   SeleniumLibrary
*** Variable ***
${myname}       mamat
*** Keywords ***
sign mypage
    Log     sign for me
login monpower
    Log To Console      visit monpower and begin to login
    Input Text          id=loginUsername    floraalim
    Input Text          id=loginPwd         paz8187527
    Click Button        xpath=//*[@id="form"]/div/button
    Title Should Be     My Account2
login with invalid user
    Log To Console      visit monpower and begin to login
    Close Browser
    Open Browser    https://www.firstenergycorp.com/content/customer/mon_power.html    chrome
    Input Text          id=loginUsername    alimablat
    Input Text          id=loginPwd         paz8187527
    Click Button        xpath=//*[@id="form"]/div/button
    Sleep   2
    Element Should Be Visible   xpath=//*[@id="main-content-wrap"]/section/article/div/div[2]/div[1]/div[2]/div/div/div/div/h1
*** Test Case ***
test1
    log    my name is ${myname}
    Open Browser  http://www.google.com      chrome
    Maximize Browser Window
    Set Browser Implicit Wait   4
    Input Text   name=q    monpower
    Click Button        xpath=//*[@id="tsf"]/div[2]/div/div[3]/center/input[1]
    Sleep       2
    Click Element       class=LC20lb
    Title Should Be     Mon Power
    login monpower
   sign mypage
test2: register with invalid user 
       login with invalid user

           Close Browser
    
    
     
