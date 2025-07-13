package org.effective.chapter02.item14.inheritance;

import java.util.Comparator;
import java.util.TreeSet;

public class NamePoint extends Point{

    final private String name;

    public NamePoint(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }

    public static void main(String[] args) {
        NamePoint p1 = new NamePoint(1, 0, "effective");
        NamePoint p2 = new NamePoint(1, 0, "java");

        TreeSet<NamePoint> points = new TreeSet<>(new Comparator<NamePoint>() {

            @Override
            public int compare(NamePoint o1, NamePoint o2) {
                int result = Integer.compare(o1.getX(), o2.getX());
                if (result == 0) {
                    result = Integer.compare(o1.getY(), o2.getY());
                }
                if (result == 0) {
                    result = p1.name.compareTo(p2.name);
                }
                return result;
            }
        });

        points.add(p1);
        points.add(p2);
        System.out.println("points = " + points);
    }
}
