package Manuele.u5w3d3.ChainOfResponsibility;

public class Tenente extends Ufficiale {
    public Tenente(Ufficiale superiore, int salary) {
        super(superiore, salary);
    }

    @Override
    public void doCheck(int salary) {
        if (this.getSalary() > salary) {
            System.out.println("dal tenente in su prendono più di " + salary + " euro");
        } else {
            this.goNext(salary);
        }
    }
}
