package org.shop.configuration;


import org.shop.DataInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DataInitializer.class, FactoryConfig.class, RepositoryConfig.class, ServiceConfig.class})
public class EverythingConfig {

}
