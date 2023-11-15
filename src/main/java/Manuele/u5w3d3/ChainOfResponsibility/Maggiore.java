package Manuele.u5w3d3.ChainOfResponsibility;

public class Maggiore extends Ufficiale {
    public Maggiore(Ufficiale superiore, int salary) {
        super(superiore, salary);
    }

    @Override
    public void doCheck(int salary) {
        if (this.getSalary() > salary) {
            System.out.println("dal maggiore in su prendono più di " + salary + " euro");
        } else {
            this.goNext(salary);
        }
    }
}
