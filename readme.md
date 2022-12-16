How to set up Maven project using java selenium cucumber and BDD
-

Install IntelliJ IDE
-
- Create new Maven project 

- Add maven dependencies for :
  * Cucumber Java 
  * Cucumber JUnit 
  * JUnit
  * Selenium Java

- Download cucumber plugin

Project implementation
-
* In the stepDefinitions folder are Runner/SetUp class and the step definitions classes for each Cucumber TC located in the Feature file
  * SetuUp class is created for the driver and for other main functions
  * Runner class is created for running the project with cucumber in a specific report
* In the resources file is located the chrome driver
* In the Features files are the Scenarios for TC that are written in for the Cucumber
* In the target files is there are reports for the executed TC
  * The target is generating new report files for each time when the TC are executed
  * You can use clean/test in the maven setting to solve error related with the reports
* In the pom file there are all dependency for this project:
  * selenium-java | cucumber-junit | junit | cucumber-java | SeleniumCucumberBDD | maven compiler 


  
