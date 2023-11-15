package Manuele.u5w3d3.ChainOfResponsibility;

public class Colonnello extends Ufficiale {
    public Colonnello(Ufficiale superiore, int salary) {
        super(superiore, salary);
    }

    @Override
    public void doCheck(int salary) {
        if (this.getSalary() >= salary) {
            System.out.println("dal colonnello in su prendono più di " + salary + " euro");
        } else {
            this.goNext(salary);
        }
    }
}
