package com.pi.shoppingcart;

import com.pi.shoppingcart.domain.ShoppingCard;
import com.pi.shoppingcart.repositories.ShoppingCardRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

@Slf4j
public class ShoppingCardRepositoryIT extends AbstractIntegrationTest{

    @Autowired
    public ShoppingCardRepository shoppingCardRepository;

    @Test
    public void shoppingCardTest() {
        ShoppingCard shoppingCard = new ShoppingCard()
                .setIsbn("1111")
                .setPublisher("Publisher Name")
                .setTitle("Title name");
        shoppingCardRepository.save(shoppingCard);

        List<ShoppingCard> shoppingCardList = shoppingCardRepository.findAll();

        
    }
}
