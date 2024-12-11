package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import java.util.Date;


import java.util.List;


@Configuration
@ComponentScan("org.example")
@PropertySource("classpath:application.properties")
public class AppConfig {

    // Injecting constant values
    @Value("Hello World")
    private String message;

    // Injecting system properties
    @Value("#{systemProperties['user.name']}")
    private String userName;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{systemProperties['java.version']}")
    private String javaVersion;

    @Value("#{systemProperties['user.home']}")
    private String userHome;

    // Injecting values from property files (application.properties)
    @Value("${app.name}")
    private String appName;

    @Value("${server.port}")
    private int serverPort;

    // Injecting SpEL expressions
    @Value("#{2 * 3}")
    private int calculatedValue;

    @Value("#{T(java.lang.Math).PI}")
    private double piValue;

    // Injecting list values using SpEL
    @Value("#{'${list.of.values}'.split(',')}")
    private List<String> valuesList;

    // Injecting values into a bean
    @Value("#{myService.getServiceName()}")
    private String serviceName;

    // Injecting Resource file (file from classpath)
    @Value("classpath:application.properties")
    private org.springframework.core.io.Resource resource;

    @Value("#{T(java.text.SimpleDateFormat).getInstance().format(new java.util.Date())}")
    private String currentDate;



    @Bean
    public MyService myService() {
        return new MyService("My Spring Service");
    }


    public String getMessage() {
        return message;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public Resource getResource() {
        return resource;
    }

    public String getServiceName() {
        return serviceName;
    }

    public List<String> getValuesList() {
        return valuesList;
    }

    public double getPiValue() {
        return piValue;
    }

    public int getCalculatedValue() {
        return calculatedValue;
    }

    public int getServerPort() {
        return serverPort;
    }

    public String getAppName() {
        return appName;
    }

    public String getUserHome() {
        return userHome;
    }

    public String getJavaVersion() {
        return javaVersion;
    }

    public String getOsName() {
        return osName;
    }

    public String getUserName() {
        return userName;
    }
}
