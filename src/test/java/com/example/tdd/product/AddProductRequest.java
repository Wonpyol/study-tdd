package com.example.tdd.product;

import org.springframework.util.Assert;

record AddProductRequest(String name, int price, DiscountPolicy discountPolicy) {
    AddProductRequest {
        Assert.hasText(name, "name must not be null");
        Assert.isTrue(price > 0, "price must be greater than zero");
        Assert.notNull(discountPolicy, "discountPolicy must be null");
    }
}
