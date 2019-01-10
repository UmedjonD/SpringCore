package org.shop.configuration;

import org.shop.repository.UserRepository;
import org.shop.repository.factory.UserRepositoryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class FactoryConfig {

    @Bean
    public UserRepository userRepositoryFactory(){
        return new UserRepositoryFactory().createUserRepository();
    }

}
