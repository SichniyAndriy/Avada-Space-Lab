package app.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;

@Data(staticConstructor = "EMPTY")
public class Order {
    private Long id;
    private User user;
    private BigDecimal totalPrice;
    private String description;
    private LocalDateTime timeStamp;
}
