package app.model;

import java.math.BigDecimal;
import lombok.Data;

@Data(staticConstructor = "EMPTY")
public class Product {
    private Long id;
    private String name;
    private BigDecimal price;
}
