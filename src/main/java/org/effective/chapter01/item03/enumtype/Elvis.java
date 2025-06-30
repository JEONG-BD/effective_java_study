package org.effective.chapter01.item03.enumtype;

public enum Elvis {
    INSTANCE;

    public void leaveTheBuilding(){
        System.out.println("기다려주세요.");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }
}
