package com.lerr.mysqlclusterdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableTransactionManagement(proxyTargetClass = true)
public class MysqlClusterDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysqlClusterDemoApplication.class, args);
    }

}
