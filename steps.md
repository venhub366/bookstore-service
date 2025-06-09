Feature: Add a new book to the catalog

1. Create parent module bookstore-service
2. Add Catalog Service module
3. Resolve dependencies
4. Add run method in TestcontainersConfiguration and add @TestConfiguration annotation 
5. Start the docker desktop in local
6. Run the testcontainersConfiguration class
7. Add actuator endpoint in application.properties along with server.port and server.shutdown
8. Add actuator endpoint in application.properties along with management.endpoints.web.exposure.include=* 
9. Create git repo bookstore-service.git
10. Add actuartor build and git commit id plugin infos to catalog-service pom.xml
11. Add git info in app properties file then add Open api dependency along with rest assured 
12. Add maven spotless plugin for formatting the code.
13. Create a Container config to run the integration test . Create class Container config and move the bean impl of postgresContainer to it and add the import of Container in CatalogServiceApplicationTests main test class and add the spotless plug to main pom.
Add Docker compose file.
Add DB config in catalog-service app properties
Add the github actions for catalog service then verify ./mvnw -ntp verify in powershell build must be success







