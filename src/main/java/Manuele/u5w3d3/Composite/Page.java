package Manuele.u5w3d3.Composite;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Page implements Written {
    private String content;

    public Page(String s) {
        this.content = s;
    }

    @Override
    public void print() {
        System.out.println(content);
    }

    @Override
    public int countPage() {
        return 1;
    }
}
