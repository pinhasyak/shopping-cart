package com.pi.shoppingcart.repositories;

import com.pi.shoppingcart.domain.ShoppingCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCardRepository extends JpaRepository<ShoppingCard, Long> {
}
