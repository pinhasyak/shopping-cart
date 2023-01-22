package com.pi.shoppingcart.domain;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class ShoppingCard {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String isbn;
    private String publisher;
}
