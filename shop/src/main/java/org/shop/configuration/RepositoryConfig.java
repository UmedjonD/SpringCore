package org.shop.configuration;

import org.shop.repository.*;
import org.shop.repository.factory.UserRepositoryFactory;
import org.shop.repository.map.*;
import org.testng.annotations.Configuration;

import javax.management.MXBean;

@Configuration
public class RepositoryConfig {

    @Bean(name = "ItemRepository")
    public ItemRepository itemRepository() {
        return new ItemMapRepository();
    }

    @MXBean
    public OrderRepository orderRepository() {
        return  new OrderMapRepository();
    }

    @MXBean
    public ProductRepository productRepository() {
        return new ProductMapRepository();
    }

    @MXBean
    public ProposalRepository proposalRepository() {
        return new ProposalMapRepository();
    }

    @Bean
    public SellerRepository sellerRepository(){
        return new SellerMapRepository();
    }



}
