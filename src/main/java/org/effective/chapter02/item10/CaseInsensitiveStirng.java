package org.effective.chapter02.item10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CaseInsensitiveStirng {
    private final String s;
    public CaseInsensitiveStirng(String s) {
        this.s = Objects.requireNonNull(s);
    }
    /*
    * equals 규악
    * 반사성 A.equals(A) == true
    * 대칭성 A.equals(B) == B.equals(A
    * 추이성 A.equals(B) && B.equals(C), A.equals(C)
    * 일관성 A.equals(B) == A.equals(B)
    * Not Null A.equals(null) == false
    *
    * */
    // 권장 하지 않는다.
    @Override
    public boolean equals(Object o){
        if(o instanceof CaseInsensitiveStirng) {
            return s.equalsIgnoreCase(((CaseInsensitiveStirng) o).s);
        }
        if(o instanceof String){
            return s.equalsIgnoreCase((String) o);
        }
        return false;
    }



    public static void main(String[] args) {
        CaseInsensitiveStirng cis = new CaseInsensitiveStirng("Polish");
        String polish = "polish";
        System.out.println(cis.equals(polish));
        System.out.println("===대칭성===");
        System.out.println("cis.equals(polish) = " + cis.equals(polish));
        System.out.println("polish.equals(cis) = " + polish.equals(cis));
        List<CaseInsensitiveStirng> list = new ArrayList<>();

        System.out.println(list.contains(polish));
    }


}
