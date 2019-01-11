package org.shop;


import org.shop.api.ProductService;
import org.shop.api.ProposalService;
import org.shop.api.SellerService;
import org.shop.api.UserService;
import org.shop.configuration.EverythingConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * The ShopLauncher class.
 */
public class ShopLauncher {
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        //TODO: implement using Spring Framework ApplicationContext
        ApplicationContext ac = new AnnotationConfigApplicationContext(EverythingConfig.class);
        System.out.println("Пользователи:");
        System.out.println(ac.getBean(UserService.class).getUsers());
        System.out.println("Продукты:");
        System.out.println(ac.getBean(ProductService.class).getProducts());
        System.out.println("Селлеры:");
        System.out.println(ac.getBean(SellerService.class).getSellers());



    }
}
