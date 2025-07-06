package org.effective.chapter02.item10.inheritance;

import org.effective.chapter02.item10.Point;

public class SmellPoint extends Point {
    private String smell;

    public SmellPoint(int x, int y) {
        super(x, y);
    }

    public SmellPoint(int x, int y, String smell) {
        super(x, y);
        this.smell = smell;
    }

    public boolean equals(Object o){
        if(!(o instanceof Point)){
            return false;
        }

        if(!(o instanceof SmellPoint)){
            return o.equals(this);
        }

        return super.equals(o) && ((SmellPoint)o).smell.equals(smell);
    }
}
