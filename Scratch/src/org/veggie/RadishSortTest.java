package org.veggie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

class RadishSortTest {
    public static void main(String[] args) {
        List<Radish> radishes = new ArrayList<>();

        radishes.add(new Radish("Red", 2.1, 1.0, 0));


        System.out.println("sort by natural order (size)");
        radishes.sort(null);
        dump(radishes);
        System.out.println();

        System.out.println("sort by color via RadishColorComparator");
        radishes.sort(new Comparator<Radish>() {
            @Override
            public int compare(Radish r1, Radish r2) {
                return r1.getColor().compareTo(r2.getColor());
            }
        });
        //radishes.sort(new RadishColorComparator());
        dump(radishes);
        System.out.println();

        System.out.println("sort by guyOnTop via RadishGuysOnTopComparator");
        radishes.sort(new Comparator<Radish>() {
            @Override
            public int compare(Radish r1, Radish r2) {
                return Integer.compare(r1.getGuysOnTop(), r2.getGuysOnTop());
            }
        });
        //radishes.sort(new RadishGuysOnTopComparator());
        dump(radishes);
        System.out.println();

        System.out.println("Sort by tailLength via anonymous class");
        radishes.sort(new Comparator<Radish>() {
            @Override
            public int compare(Radish r1, Radish r2) {
                return Double.compare(r1.getTailLength(), r2.getTailLength());
            }
        });
        dump(radishes);
        System.out.println();
    }

    private static void dump(List<Radish> radishes){
        for (Radish radish : radishes){
            System.out.println(radish);
        }
    }
}