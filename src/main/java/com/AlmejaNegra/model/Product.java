package com.AlmejaNegra.model;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString

public class Product {
    private int id;
    private int price;
    private String name;
    private String stock;
}
