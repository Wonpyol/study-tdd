package com.example.tdd.product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductTest {

    private ProductService productService;

    private ProductPort productPort;

    private ProductRepository repository;

    @BeforeEach
    void setUp() {
        this.repository = new ProductRepository();
        this.productPort = new ProductPort(this.repository);
        this.productService = new ProductService(this.productPort);

    }

    @Test
    void 상품등록() {
        String name = "상품명";
        int price = 1000;
        DiscountPolicy discountPolicy = DiscountPolicy.RATE_PER_ORDER;
        final AddProductRequest request = new AddProductRequest(name, price, discountPolicy);

        productService.register(request);
    }

}
