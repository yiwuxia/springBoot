package com.beenoisy.springboot.way.common.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import com.jin.springboot.util.SpringContextUtil;
import com.redare.devframework.common.spring.db.MySqlJdbcHelper;
import com.redare.devframework.common.spring.db.SpringJdbcHelper;

@Configuration
public class CorsConfig {
	
	@Autowired
	JdbcTemplate JdbcTemplate;
	
	
    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*"); // 1
        corsConfiguration.addAllowedHeader("*"); // 2
        corsConfiguration.addAllowedMethod("*"); // 3
        return corsConfiguration;
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig()); // 4
        System.out.println("helo====="+JdbcTemplate+"=========");
        return new CorsFilter(source);
    }
    
    @Bean
    public SpringJdbcHelper mySqlJdbcHelper(){
    	SpringJdbcHelper s= new MySqlJdbcHelper();
    	s.setDataSource(JdbcTemplate.getDataSource());
		return s;
    	
    }
    
}
