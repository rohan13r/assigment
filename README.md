# assigment
steps how i made the api in intellij IDEA CE
its a layered structure containg entityes , repo, controller and services and configration of application properties for connection localserver for testing in postman 
first i add the dependency in pom.xml file and added the dependency for building web applications using Spring MVC and used the tomcat as the default embedded container.
well after that i have used lombok dependency that  reduce the boilerplate code that we usually write inside every entity class like setters, getters, and toString
next i created Laptopclass inside the my entity package and add the @Data annotation which is a Lombok annotation, that will automatically create setters, getters, toString, and equals
then i created an interface LaptopRepository inside the springbootrepos package and add @Repository annotates classes at the persistence layer, which will act as a database repository. We have extended this interface with JPARepository interface which will provide built-in methods to interact with the database also we can define finder methods. We have defined 1 finder methods findByNameContaining() which will return the List<branch>
  then i create controller inside the controller package and add 
  LaptopRepository using @Autowired annotation. We have created 1 handler methods, getLaptopsByNameContaining(branch)  which will call the repository methods findByNameContaining()
  and at last Run the application using the maven command-mvn spring-boot:run
  
  Time taken by me to complete this project was 2 hours as I was understanding the JPA and spring framework
