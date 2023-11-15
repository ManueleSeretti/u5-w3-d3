package Manuele.u5w3d3.Adapter;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Info {
    private String name;
    private String surname;
    private LocalDate birthday;

    public Info(String name, String surname, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }
}
