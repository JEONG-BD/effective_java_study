package org.effective.chapter02.item13.clone_use_constructor;

public class SubItem extends Item implements Cloneable{

    private String name;

    @Override
    protected SubItem clone() {
        // 실패

        return (SubItem) super.clone();
    }

    public static void main(String[] args) {
        SubItem item = new SubItem();
        SubItem clone = (SubItem) item.clone();
        System.out.println(clone != null);
        System.out.println(clone.getClass() == item.getClass());
        System.out.println(clone.equals(item));
    }

}
