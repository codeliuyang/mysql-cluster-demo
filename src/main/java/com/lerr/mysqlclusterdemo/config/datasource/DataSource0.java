package com.lerr.mysqlclusterdemo.config.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Data
@Configuration
@ConfigurationProperties(prefix = "database.cluster.db0")
public class DataSource0 {

    private String name;
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    public DataSource createDruid() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setName(getName());
        druidDataSource.setDriverClassName(getDriverClassName());
        druidDataSource.setUrl(getUrl());
        druidDataSource.setUsername(getUsername());
        druidDataSource.setPassword(getPassword());
        return druidDataSource;
    }

}
