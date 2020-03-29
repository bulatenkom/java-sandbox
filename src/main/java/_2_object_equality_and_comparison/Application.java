package _2_object_equality_and_comparison;

import _2_object_equality_and_comparison.models.Monster;
import _2_object_equality_and_comparison.models.Unit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Application {

    public static void main(String[] args) {
        Unit unit = new Unit();
        unit.print();

        List<Unit> units = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            units.add(new Unit());
        }
        units.set(0, new Unit());
        units.set(3, new Unit());
        System.out.println("before sort = " + units.stream().map(Unit::getId).collect(toList()));

        Collections.sort(units); //OR units.sort((Comparator) null);
        System.out.println("after sort = " + units.stream().map(Unit::getId).collect(toList()));

        Monster m1 = new Monster(1L, "monster1");
        Monster m2 = new Monster(1L, "monster1");

        System.out.println("m1 = " + m1);
        System.out.printf("%x\n", m1.hashCode());
        System.out.println(m1.hashCode());
        System.out.println("m2 = " + m2);
        System.out.printf("%x\n", m2.hashCode());
        System.out.println(m2.hashCode());

        System.out.println(m1 == m2);
        System.out.println(m1.equals(m2));
    }
}
