package com.uniquindio.sanrafael;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.DriverManager;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DatabaseConfig {

    Logger log = LoggerFactory.getLogger(getClass());


  @Value("${spring.datasource.url}")
  private String dbUrl;
  
  @Value("${spring.datasource.username}")
  private String user;
  
  @Value("${spring.datasource.password}")
  private String password;
  
  @Value("${spring.datasource.driverClassName}")
  private String driver;
  
  @Bean
  public DataSource dataSource() {
	  
	  String dbUrl = System.getenv("JDBC_DATABASE_URL");
      String username = System.getenv("JDBC_DATABASE_USERNAME");
      String password = System.getenv("JDBC_DATABASE_PASSWORD");

      DriverManagerDataSource dataSource = new DriverManagerDataSource();
      dataSource.setDriverClassName(driver);
      dataSource.setUrl(dbUrl);
      dataSource.setUsername(username);
      dataSource.setPassword(password);

      return dataSource;
  }
  
  
}
