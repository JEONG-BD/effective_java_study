package org.effective.chapter01.item03.field;

import java.io.Serializable;

public class Elvis implements IElvis, Serializable {

    // single object
    public static final Elvis INSTANCE = new Elvis();
    private static boolean created;

    //private Elvis() {
    //    if(created){
    //        throw new UnsupportedOperationException("can't be created by constructor");
    //    }
    //
    //    created = true;
    //}


    private Elvis() {
        // 직렬화를 위한 생성자
    }

    public void levelThenBuilding(){
        System.out.println("Whoa babby, I'm outta here");
    }


    public void sing(){
        System.out.println("sing ~~ sing ~~");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.levelThenBuilding();
    }
}
