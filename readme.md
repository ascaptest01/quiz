#Yieldmo QA Automation Quiz

###Welcome to the quiz!

Hello Quiz taker,

in about a min or so you will be the lucky individual to take this small automation quiz. This quiz is nothing to complicated, but will allow the interviewer to gauge at how well you understand the following items.

Quiz coverage:
* Java
* Selenium
* lookup strategies
* TestNG
* POM

You will have around 1 hour to complete this quiz. please feel free to ask the interviewer any question you may have. This quiz follows a basic modular framework design.

Objectives:
* complete the selenium rodeo exercise
* complete assigned testing tasks listed in the testng suite xml file

####Where things live
* PageFactories - should be under Page
* Driver + selenium server logic - should be under utils
* Tests - lives under /test/ directory

---

###Setup (mainly for whoever is giving this quiz):
* pull down this repo
* open it in any IDE
* go to https://chromedriver.chromium.org/downloads and download the chromedriver 
* place the chromedriver in /qa-automtion-quiz/src/main/resources/drivers/chromedriver

####Notes:
* selenium server is kicked up pragmatically, so any logic around that is handled
* Chromedriver is required since the logic does not know what chromeversion you are using on this machine