package org.effective.chapter02.item13.clone_use_constructor;

public class Item implements Cloneable{
    private String name;

    // clone를 사용하지 않고 생성자로 return을 한다.

    //@Override
    //protected Item clone() {
    //    Item item = new Item();
    //    item.name = this.name;
    //    return item;
    //}
    //
    @Override
    protected Item clone(){
        Item result = null;
        try {
            result = (Item) super.clone();
            return result;

        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
