package app.model;

import java.time.LocalDateTime;
import lombok.Data;

@Data(staticConstructor = "EMPTY")
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private LocalDateTime timeStamp;
}
