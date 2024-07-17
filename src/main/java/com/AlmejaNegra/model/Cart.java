package com.AlmejaNegra.model;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.List;

@Getter @Setter @ToString

public class Cart {
    private List<Product> product;
}
