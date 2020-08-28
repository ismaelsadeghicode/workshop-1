package com.mapsa.store.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;


@Builder
@Data
@AllArgsConstructor
public class Product {

//    @NonNull
    private Long id;
    private String name;
    private String category;

}
