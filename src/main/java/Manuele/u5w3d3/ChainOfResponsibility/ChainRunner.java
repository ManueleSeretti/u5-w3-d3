package Manuele.u5w3d3.ChainOfResponsibility;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class ChainRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("----------------------------ESERCIZO 3--------------------------------");
        Ufficiale generale = new Generale(null, 5000);
        Ufficiale colonnello = new Colonnello(generale, 4000);
        Ufficiale tenente = new Tenente(colonnello, 3000);
        Ufficiale maggiore = new Maggiore(tenente, 2000);
        Ufficiale capitano = new Capitano(maggiore, 1000);

        capitano.doCheck(3000);

    }
}
