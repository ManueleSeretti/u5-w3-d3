package Manuele.u5w3d3.Adapter;

import java.time.LocalDate;

public class InfoForUserData implements DataSource {
    private Info infoUser;

    public InfoForUserData(Info infoUser) {
        this.infoUser = infoUser;
    }

    @Override
    public String getFullName() {

        return infoUser.getName() + " " + infoUser.getSurname();
    }

    @Override
    public int getAge() {

        long d1 = LocalDate.now().toEpochDay();
        long d2 = infoUser.getBirthday().toEpochDay();
        return (int) ((d1 - d2) / 365);

    }
}
