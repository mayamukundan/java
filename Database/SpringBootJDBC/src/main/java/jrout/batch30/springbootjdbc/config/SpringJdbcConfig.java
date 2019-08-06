package jrout.batch30.springbootjdbc.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class SpringJdbcConfig {
    String url = "jdbc:mysql://localhost:3306/employees?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    String driverClassName = "com.mysql.cj.jdbc.Driver";

    @Value("${mysql.user.name}")
    private String mysqlUserName;

    @Value("${mysql.password}")
    private String mysqlPassword;

//    @Bean
    public DataSource mysqlDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(mysqlUserName);
        dataSource.setPassword(mysqlPassword);
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        DataSource dataSource = mysqlDataSource();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }
}
