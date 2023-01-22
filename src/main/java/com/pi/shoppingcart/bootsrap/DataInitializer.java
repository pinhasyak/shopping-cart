package com.pi.shoppingcart.bootsrap;


import com.pi.shoppingcart.domain.ShoppingCard;
import com.pi.shoppingcart.repositories.ShoppingCardRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
@Slf4j
public class DataInitializer implements CommandLineRunner {

    private final ShoppingCardRepository shoppingCardRepository;

    @Override
    public void run(String... args) throws Exception {




    }
}
