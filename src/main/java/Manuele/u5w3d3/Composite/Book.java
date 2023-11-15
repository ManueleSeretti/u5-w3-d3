package Manuele.u5w3d3.Composite;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class Book implements Written {
    private List<Written> sectionList;
    private double price;

    @Override
    public void print() {
        for (Written written : this.sectionList) {
            written.print();
        }

    }

    @Override
    public int countPage() {
        int countPage = 0;
        for (Written written : this.sectionList) {
            countPage = countPage + written.countPage();
        }
        System.out.println(countPage);
        return countPage;
    }
}
