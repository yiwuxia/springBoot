package com.beenoisy.springboot.way;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.jin.springboot.util.SpringContextUtil;

@SpringBootApplication
public class BeenoisySpringBootWayApplication implements CommandLineRunner{

	@Autowired
	JdbcTemplate JdbcTemplate;
	
	public static void main(String[] args) {
		 ApplicationContext ctx =	SpringApplication.run(BeenoisySpringBootWayApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}
}
