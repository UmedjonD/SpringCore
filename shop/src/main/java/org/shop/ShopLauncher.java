package org.shop;


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
        UserService userService = ac.getBean(UserService.class);
        userService.getUsers().forEach(System.out::println);
//        DataInitializer dataInitializer = ac.getBean(DataInitializer.class);
//        dataInitializer.initData();
    }
}
