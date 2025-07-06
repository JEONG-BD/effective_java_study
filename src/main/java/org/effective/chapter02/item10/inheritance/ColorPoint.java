package org.effective.chapter02.item10.inheritance;

import org.effective.chapter02.item10.Color;
import org.effective.chapter02.item10.Point;

import java.util.Objects;

public class ColorPoint extends Point {

    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    // 대칭성이 깨찜
    //@Override
    //public boolean equals(Object o) {
    //    if (!(o instanceof ColorPoint))
    //        return false;
    //    return super.equals(o) && ((ColorPoint) o).color == color;
    //}

    // 추이성이 깨짐
    @Override
    public boolean equals(Object o){
        if(!(o instanceof  Point)){
            return false;
        }
        // Danger!!!
        if(!(o instanceof  ColorPoint)){
            return o.equals(this);
        }

        return super.equals(o) && ((ColorPoint) o).color == color;
    }

    public static void main(String[] args) {
        // 대칭성 위배
        //Point p = new Point(1, 2);
        //ColorPoint cp = new ColorPoint(1, 2, Color.RED);
        //System.out.println("p.equals(cp) = " + p.equals(cp));
        //System.out.println("cp.equals(p) = " + cp.equals(p));
        // 추이성 위배
        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);
        System.out.printf("%s %s %s%n", p1.equals(p2), p2.equals(p1), p1.equals(p3));
    }


}
