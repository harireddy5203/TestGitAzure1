/*
 * Copyright (c) 2021 REPLACE_CUSTOMER_NAME. All rights reserved.
 *
 * This file is part of TestGitAzure1.
 *
 * TestGitAzure1 project and associated code cannot be copied
 * and/or distributed without a written permission of REPLACE_CUSTOMER_NAME,
 * and/or its subsidiaries.
 */
package com.abc.infra.service.discovery;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Main application class that is responsible to start the db auth service and exposes the functionality over the specified
 * port.
 *
 * @author Admin
 */
@SpringBootApplication
@EnableEurekaServer
public class PlatformDiscoveryService {

	public static void main(String[] args) {
		SpringApplication.run(PlatformDiscoveryService.class, args);
	}
}