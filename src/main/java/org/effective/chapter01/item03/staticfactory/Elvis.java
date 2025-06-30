package org.effective.chapter01.item03.staticfactory;

// 정적 팩토리 메서드 방식의 싱글턴
public class Elvis implements Singer {
    private static final Elvis INSTANCE = new Elvis();

    //동일한 인스턴스를 얻는다
    public static Elvis getInstance(){
        return INSTANCE;
    }

    // 새로운 인스턴스를 얻는다
    public static Elvis getInstance2(){
        return INSTANCE;
    }

    private Elvis() {
        // private 생성자
    }

    public void leaveTheBuilding(){
        System.out.println("Whoa baby, I'm outta here!");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.getInstance();
        elvis.leaveTheBuilding();
    }

    @Override
    public void sing() {
        System.out.println("My Way~~~");
    }
}
