package org.effective.chapter02.item13.inheritance;

/*
* 일반적으로 상속용 클래스에 Cloneable 인터페이스 사용을 권장하지 않는다.
* 해당 클래스는 확장하려는 개발자에게 많은 부담을 주기 때문이다.
* */
public abstract class Shape implements Cloneable {

    private int area;

    public abstract int getArea();

    /*
    * 부담을 덜기 위해서 기본 clone 구현체를 제공하여 Cloneable 구현 여부를 서브 클래스가 선택 가능하다.
    * */
    //@Override
    //protected Object clone() throws CloneNotSupportedException {
    //    return super.clone();
    //}


    /*
    * Cloneable 구현을 막는 것도 가능하다.
    * */
    @Override
    protected final Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
