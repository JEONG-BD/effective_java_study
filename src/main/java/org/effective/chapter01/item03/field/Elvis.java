package org.effective.chapter01.item03.field;

public class Elvis implements IElvis {

    // single object
    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {
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
