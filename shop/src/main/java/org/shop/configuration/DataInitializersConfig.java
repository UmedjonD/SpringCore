package org.shop.configuration;

import org.shop.*;
import org.shop.api.ProductService;
import org.shop.api.UserService;
import org.shop.common.Sellers;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataInitializersConfig {

    @Bean
    public SellerInitializer sellerInitializer(){
        return new SellerInitializer();
    }
    @Bean
    public ProposalInitializer proposalInitializer() {
        return new ProposalInitializer();
    }
    @Bean
    public UserInitializer userInitializer(UserService userService) {
        return new UserInitializer(userService);
    }
    @Bean
    public ProductInitializer productInitializer(ProductService productService) {
        return new ProductInitializer(productService);
    }
    @Bean(initMethod = "initData")
    public DataInitializer dataInitializer() {
        return new DataInitializer();
    }
    @Bean
    public Map<Long, String> sellerNames() {
        Map<Long, String> sellerNames = new HashMap<>();
        sellerNames.put(1L, Sellers.AMAZON);
        sellerNames.put(2L, Sellers.SAMSUNG);
        return sellerNames;
    }

}
