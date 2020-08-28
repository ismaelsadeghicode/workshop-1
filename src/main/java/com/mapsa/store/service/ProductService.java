package com.mapsa.store.service;


import com.mapsa.store.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    List<Product> products;

    public List<Product> getAllProducts() {

        Product p1 = Product.builder().id(1L).name("chips").category("khoshgozaroni").build();
        Product p2 = Product.builder().id(2L).name("mast").category("khoshgozaroni").build();
        Product p3 = Product.builder().id(3L).name("bastani").category("khoshgozaroni").build();
        Product p4 = Product.builder().id(4L).name("kakao").category("khoshgozaroni").build();

        products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);

        return products;

    }

}
