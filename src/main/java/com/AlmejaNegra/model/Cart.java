package com.AlmejaNegra.model;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString

public class Cart extends Product {
    private Product product;
}
