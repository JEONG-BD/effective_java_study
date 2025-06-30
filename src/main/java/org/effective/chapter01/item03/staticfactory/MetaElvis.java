package org.effective.chapter01.item03.staticfactory;

public class MetaElvis<T> {

    private static final MetaElvis<Object> INSTANCE = new MetaElvis();

    private MetaElvis() {
    }

    @SuppressWarnings("unchecked")
    public static <E> MetaElvis<E> getInstance() {
        return (MetaElvis<E>) INSTANCE;
    }

    public void say(T t){
        System.out.println(t);
    }

    public void leaveBuilding(){
        System.out.println("Whoa baby, I'm outta here!");
    }

    public static void main(String[] args) {
        MetaElvis<String> elvis1 = MetaElvis.getInstance();
        MetaElvis<Integer> elvis2 = MetaElvis.getInstance();
    }
}
