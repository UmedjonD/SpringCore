package org.shop.configuration;

import org.shop.api.*;
import org.shop.api.impl.*;
import org.shop.repository.ItemRepository;
import org.shop.repository.ProductRepository;
import org.shop.repository.ProposalRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public ItemService itemService(ItemRepository repository) {
        return new ItemServiceImpl(repository);
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl();
    }

    @Bean
    @Qualifier("productService")
    public ProductService productService(ProductRepository repository) {
        return new ProductServiceImpl(repository);
    }

    @Bean
    @Qualifier("proposalService")
    public ProposalService proposalService(ProposalRepository repository) {
        return new ProposalServiceImpl(repository);
    }
    @Bean
    @Qualifier("sellerService")
    public SellerService sellerService() {
        return new SellerServiceImpl();
    }

    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }

}
