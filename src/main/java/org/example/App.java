package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    // Main method to test the Spring Application
    public static void main(String[] args) {
        // Creating Spring Application context
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Accessing the beans and displaying their values
        AppConfig appConfig = context.getBean(AppConfig.class);

        // Display injected values
        System.out.println("Message: " + appConfig.getMessage());
        System.out.println("User Name: " + appConfig.getUserName());
        System.out.println("Operating System: " + appConfig.getOsName());
        System.out.println("Java Version: " + appConfig.getJavaVersion());
        System.out.println("User Home: " + appConfig.getUserHome());
        System.out.println("App Name: " + appConfig.getAppName());
        System.out.println("Server Port: " + appConfig.getServerPort());
        System.out.println("Calculated Value: " + appConfig.getCalculatedValue());
        System.out.println("PI Value: " + appConfig.getPiValue());
        System.out.println("Values List: " + appConfig.getValuesList());
        System.out.println("Service Name: " + appConfig.getServiceName());
        System.out.println("Resource File: " + appConfig.getResource().getFilename());
        System.out.println("Current Date: " + appConfig.getCurrentDate());

        // Close the context
        context.close();
    }
}