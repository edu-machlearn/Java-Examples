package com.aditri;

import java.util.Arrays;
import java.util.List;

public class StreamMapFilterReduce {
    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(23, "bread"), new Product(13, "sugar"));

        List<String> names = productList.stream().map(Product::getName).filter(n -> n.equals("orange")).toList();
        names.forEach(System.out::println);
    }
}
