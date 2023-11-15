package Manuele.u5w3d3.ChainOfResponsibility;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Capitano extends Ufficiale {

    public Capitano(Ufficiale superiore, int salary) {
        super(superiore, salary);
    }

    @Override
    public void doCheck(int salary) {
        if (this.getSalary() >= salary) {
            System.out.println("dal capitano in su prendono più di " + salary + " euro");
        } else {
            this.goNext(salary);
        }
    }
}
