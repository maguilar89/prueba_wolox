package com.wolox.prueba.infrastructure.adapter.jpa.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableJpaRepositories(
        basePackages = "com.wolox.prueba.infrastructure.adapter.jpa",
        entityManagerFactoryRef = "entityManager",
        transactionManagerRef = "transactionManager"
)
public class PruebaConfig {
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.driver-class-name}")
    private String driverClass;
    @Value("${spring.jpa.properties.hibernate-dialect}")
    private String hibernateDialect;
    @Value("${spring.datasource.url}")
    private String ulr;

    @Bean
    public DataSource datasource() {
        return DataSourceBuilder.create().driverClassName(driverClass).username(username)
                .password(password).url(ulr).build();
    }

    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean entityManager() {
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean
                = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setPersistenceUnitName("entityManager");
        entityManagerFactoryBean.setDataSource(datasource());
        entityManagerFactoryBean.setPackagesToScan("com.wolox.prueba.infrastructure.adapter.entity");
        HibernateJpaVendorAdapter vendorAdapter
                = new HibernateJpaVendorAdapter();
        Map<String, Object> properties = new HashMap<>();
        properties.put("hibernate.dialect", hibernateDialect);
        entityManagerFactoryBean.setJpaPropertyMap(properties);
        entityManagerFactoryBean.setJpaVendorAdapter(vendorAdapter);
        return entityManagerFactoryBean;
    }

    @Primary
    @Bean
    public PlatformTransactionManager transactionManager() {

        JpaTransactionManager transactionManager
                = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(
                entityManager().getObject());
        return transactionManager;
    }



}
