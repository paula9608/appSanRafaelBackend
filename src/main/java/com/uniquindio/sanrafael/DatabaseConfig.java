package com.uniquindio.sanrafael;

import java.net.URI;
import java.net.URISyntaxException;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

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
  
  @Value("${spring.datasource.password}")
  private String driver;
  
  @Bean
  public DataSource dataSource() {
      HikariConfig config = new HikariConfig();
      config.setJdbcUrl(dbUrl);
      config.setUsername(user);
      config.setPassword(password);
      config.setDriverClassName(driver);
      return new HikariDataSource(config);
  }
  
  
}
