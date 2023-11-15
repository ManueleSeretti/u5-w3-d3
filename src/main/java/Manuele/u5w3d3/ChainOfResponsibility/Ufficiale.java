package Manuele.u5w3d3.ChainOfResponsibility;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Ufficiale {
    private Ufficiale superiore;
    private int salary;

    public Ufficiale(Ufficiale superiore, int salary) {
        this.superiore = superiore;
        this.salary = salary;
    }

    public abstract void doCheck(int salary); // Ogni filtro implementerà la sua logica di controlli qua dentro

    public void goNext(int salary) {
        if (this.superiore != null) { // C'è un filtro successivo
            // Andiamo al prossimo
            this.superiore.doCheck(salary);
        } else { // Non c'è un filtro successivo
            System.out.println("nessuno prende questo stipendio");
        }
    }


}
