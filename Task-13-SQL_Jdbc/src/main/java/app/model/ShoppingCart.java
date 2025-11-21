package app.model;

import lombok.Data;

@Data(staticConstructor = "EMPTY")
public class ShoppingCart {
    private Long id;
    private User user;
    private Product product;
    private Integer amount;
}
