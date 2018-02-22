package com.capgemini.infra.adminDashboard;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
public class AdminDashboardApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminDashboardApplication.class, args);
    }
}
