package Manuele.u5w3d3.Adapter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class RunnerAdapter implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Info info = new Info("manuele", "seretti", LocalDate.of(1991, 7, 26));
        DataSource infoForUserData = new InfoForUserData(info);
        UserData userData = new UserData();
        userData.getData(infoForUserData);
        System.out.println("il nome completo è " + userData.getFullName());
        System.out.println("l'eta è " + userData.getAge());
    }
}
