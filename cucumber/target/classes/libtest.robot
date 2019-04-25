*** Settings ***
Library     robotclass.Robottest
Library     SeleniumLibrary
*** Test Case ***
java Test
    open baidu
    open amazon
    close driver
