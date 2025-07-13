package org.effective.chapter02.item14;

import java.math.BigDecimal;

public class CompareToConvention {

    public static void main(String[] args) {
        BigDecimal n1 = BigDecimal.valueOf(23134134);
        BigDecimal n2 = BigDecimal.valueOf(11231230);
        BigDecimal n3 = BigDecimal.valueOf(55534552);
        BigDecimal n4 = BigDecimal.valueOf(11231230);

        //반사성
        System.out.println("n1.compareTo(n1) = " + n1.compareTo(n1));

        // 대칭성
        int result = sgn(n1.compareTo(n2));
        System.out.println(result);
        System.out.println(n2.compareTo(n1));

        // 추이성
        // n3
        System.out.println("n3.compareTo(n1) > 0 = " + (n3.compareTo(n1) > 0));
        System.out.println("n1.compareTo(n2) > 0 = " + (n1.compareTo(n2) > 0));
        System.out.println("n3.compareTo(n2) > 0 = " + (n3.compareTo(n2) > 0));

        //일관성
        System.out.println("n4.compareTo(n2) = " + n4.compareTo(n2));
        System.out.println("n2.compareTo(n1) = " + n2.compareTo(n1));
        System.out.println("n4.compareTo(n1) = " + n4.compareTo(n1));
    }

    private static int sgn(int value) {
        return Integer.compare(value, 0);
    }
}
