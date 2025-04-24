package com.vitormvr.erp_mvp;

import org.springframework.boot.SpringApplication;

public class TestErpMvpApplication {

	public static void main(String[] args) {
		SpringApplication.from(ErpMvpApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
