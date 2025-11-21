package app.model;

import lombok.Data;

@Data(staticConstructor = "EMPTY")
public class UserDetails {
    private Long id;
    private User user;
    private String postalCode;
    private String city;
    private String street;
    private String house;
    private String ipn;
    private String passport;
}
