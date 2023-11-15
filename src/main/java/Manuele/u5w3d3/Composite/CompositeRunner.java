package Manuele.u5w3d3.Composite;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompositeRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        List<Written> pageList1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            pageList1.add(new Page("pagina numero " + i));
        }
        List<Written> pageList2 = new ArrayList<>();
        for (int i = 10; i < 20; i++) {
            pageList2.add(new Page("pagina numero " + i));
        }
        List<Written> pageList3 = new ArrayList<>();
        for (int i = 20; i < 30; i++) {
            pageList3.add(new Page("pagina numero " + i));
        }

        Written section1 = new Section(pageList1, "capitolo 1");

        Written section2 = new Section(pageList2, "capitolo 2");
        Written section3 = new Section(pageList3, "capitolo 3");

        List<Written> sectionList = new ArrayList<>();

        sectionList.add(section1);
        sectionList.add(section2);
        sectionList.add(section3);

        Book book = new Book();
        book.setSectionList(sectionList);

        book.countPage();
        book.print();

    }
}
