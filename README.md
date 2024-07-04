Defining Terminology
Before diving into the technical details, I want to explicitly define the terminology used in the Spring Security context just to be sure that we all speak the same language.

These are the terms we need to address:

Authentication refers to the process of verifying the identity of a user, based on provided credentials. A common example is entering a username and a password when you log in to a website. You can think of it as an answer to the question Who are you?.
Authorization refers to the process of determining if a user has proper permission to perform a particular action or read particular data, assuming that the user is successfully authenticated. You can think of it as an answer to the question Can a user do/read this?.
Principle refers to the currently authenticated user.
Granted authority refers to the permission of the authenticated user.
Role refers to a group of permissions of the authenticated user.
Creating a Basic Spring Application
Before moving to the configuration of the Spring Security framework, let’s create a basic Spring web application. For this, we can use a Spring Initializr and generate a template project. For a simple web application, only a Spring web framework dependency is enough:



<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
</dependencies>



Once we have created the project, we can add a simple REST controller to it as follows:
