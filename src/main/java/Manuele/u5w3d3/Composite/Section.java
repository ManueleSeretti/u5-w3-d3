package Manuele.u5w3d3.Composite;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Section implements Written {
    private List<Written> pageList;
    private String sectionTitle;

    public Section(List<Written> l, String t) {
        this.pageList = l;
        this.sectionTitle = t;
    }

    @Override
    public void print() {
        System.out.println(this.sectionTitle);
        for (Written written : this.pageList) {
            written.print();
        }

    }

    @Override
    public int countPage() {
        int countPage = 0;
        for (Written written : this.pageList) {
            countPage = countPage + written.countPage();
        }
        return countPage;
    }
}
