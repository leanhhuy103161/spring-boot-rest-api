package com.example.demo;

import com.example.demo.components.Dress;
import com.example.demo.components.GirlFriend;
import com.example.demo.components.Outfit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);

//        Outfit outfit = applicationContext.getBean(Outfit.class);
//
//        System.out.println("Instance: " + outfit);
//        outfit.wear();

//        vi du ve Autowired
//        GirlFriend girlFriend = applicationContext.getBean(GirlFriend.class);
//
//        System.out.println("Instance GirlFriend: "+ girlFriend );
//        System.out.println("Outfit of girlfriend: "+ girlFriend.outfit);
//        girlFriend.outfit.wear();

//        vi du ve scope singleton va prototype
//        Dress dress1 = applicationContext.getBean(Dress.class);
//        Dress dress2 = applicationContext.getBean(Dress.class);
//        System.out.println("Dress1: "+ dress1);
//        System.out.println("Dress2:"+ dress2);

//        vi du ve Primary va Qualifier
        GirlFriend girlFriend = applicationContext.getBean(GirlFriend.class);
        System.out.println("GirlFriend: "+ girlFriend);
        System.out.println("Outfit of girlFriend: "+ girlFriend.outfit);
    }

}
