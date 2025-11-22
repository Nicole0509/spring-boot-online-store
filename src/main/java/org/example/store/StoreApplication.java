package org.example.store;

import org.example.store.entities.Address;
import org.example.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
//        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);

        var user = User.builder()
                .name("Nicole")
                .password("Nicole1234")
                .email("nicole@gmail.com")
                .build();

        var address = Address.builder()
                .street("Kigali")
                .city("Nyarugenge")
                .state("Isibo")
                .zip("Isibo2")
                .build();

        user.addAddress(address);
        System.out.println(user);
        user.removeAddress(address);
        System.out.println(user);
    }

}
