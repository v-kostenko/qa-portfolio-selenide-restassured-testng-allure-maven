# qa-portfolio-selenide-restassured-testng-allure-maven

## About the project
Automated testing framework for UI and API using:
- Selenide
- RestAssured
- TestNG
- Allure


## How to run tests:
mvn clean test

# Run tests with a specific TestNG suite file:
mvn clean test -DsuiteXmlFile=src/test/resources/testng.xml

# After running the tests, generate and view the Allure report locally:
allure serve allure-results  

