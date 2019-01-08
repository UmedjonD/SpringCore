package org.shop.configuration;

import org.shop.repository.UserRepository;
import org.shop.repository.factory.UserRepositoryFactory;
import org.testng.annotations.Configuration;

@Configuration
public class FactoryConfig {

    @Bean
    public UserRepository userRepositoryFactory(){
        return new UserRepositoryFactory().createUserRepository();
    }

}
