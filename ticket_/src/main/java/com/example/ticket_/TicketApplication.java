// package com.example.ticket_;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication  
// public class TicketApplication {

// 	public static void main(String[] args) {
// 		SpringApplication.run(TicketApplication.class, args);
// 	} 

// }
package com.example.ticket_;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.controller", "com.config"}) // ✅ Include your actual packages
public class TicketApplication {
    public static void main(String[] args) {
        SpringApplication.run(TicketApplication.class, args);
    }
}
