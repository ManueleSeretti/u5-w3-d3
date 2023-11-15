package Manuele.u5w3d3.ChainOfResponsibility;

public class Generale extends Ufficiale {
    public Generale(Ufficiale superiore, int salary) {
        super(superiore, salary);
    }

    @Override
    public void doCheck(int salary) {
        if (this.getSalary() > salary) {
            System.out.println("dal generale in su prendono più di " + salary + " euro");
        } else {
            this.goNext(salary);
        }
    }
}
