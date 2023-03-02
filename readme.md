How to set up Maven project using java selenium cucumber and BDD
-
Introduction
-
This project is written in java selenium and cucumber.
Couple of functionality are covered in the Test Cases:


* Populate and verified valid and invalid data filed in "Contact Us" page
* Verify "Company" and "Leadership" section
* Verify one Social media section
* Verify "Careers menu" and "Join Us" pages
* Select and verify open position by cities
* Apply for a job flow and upload a CV
* List open position by city

Technologies
- 
  *  Java
  *  Selenium
  *  Cucumber
  *  Maven
  * Intelij IDEA

Architecture
-
* In the stepDefinitions folder are Runner/SetUp class and the step definitions classes for each Cucumber TC located in the Feature file
  * SetuUp class is created for the driver and for other main functions
  * Runner class is created for running the project with cucumber
* In the resources file is located the chrome driver
* In the Features files are the Scenarios for TC that are written in for the Cucumber
* In the target files is there are reports for the executed TC
  * The target is generating new report files for each time when the TC are executed
  * You can use clean/test in the maven setting to solve error related with the reports
* In the pom file there are all dependency for this new project:
  * selenium-java | cucumber-junit | junit | cucumber-java | SeleniumCucumberBDD | maven compiler
* The URL is stored in the ReadConfiq file
* Logger class is created for all the logs in the console
* Pretty report is created and visible in the target folder

Launch
-
* Run all Test Cases with the "Runner" class
* Run separately each Test Case by selecting the specific one and run only that one isolated
* Navigate to the target file where the report is created and stored 
* Open report.html file stored in the cucumber-reports folder in the target file and open with browser(desire browser)

Note:
* All together the Test Cases at ones can be run with the "Runner" class
* Select the "Runner" class from the dialog and press Play to run all the Test Cases at ones





  
