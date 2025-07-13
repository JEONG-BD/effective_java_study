package org.effective.chapter02.item14;

import java.util.Objects;

public class PhoneNumber implements Cloneable, Comparable<PhoneNumber>{

    private final short areaCode, prefix, lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "지역코드");
        this.prefix   = rangeCheck(prefix,   999, "프리픽스");
        this.lineNum  = rangeCheck(lineNum, 9999, "가입자 번호");
        System.out.println("constructor is called");
    }


    private static short rangeCheck(int val, int max, String arg) {
        if (val < 0 || val > max)
            throw new IllegalArgumentException(arg + ": " + val);
        return (short) val;
    }

    @Override
    public boolean equals(Object o) {
        if( o == this)
            return true;
        if (!(o instanceof PhoneNumber that))
            return false;

        PhoneNumber pn = (PhoneNumber) o;
        return pn.areaCode == areaCode && pn.prefix == prefix && pn.lineNum == lineNum;
    }

    @Override public int hashCode() {
        int result = Short.hashCode(areaCode);
        result = 31 * result + Short.hashCode(prefix);
        result = 31 * result + Short.hashCode(lineNum);
        return result;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public int compareTo(PhoneNumber pn) {
        int result = Short.compare(areaCode, pn.areaCode);
        if (result == 0)  {
            result = Short.compare(prefix, pn.prefix);
            if (result == 0)
                result = Short.compare(lineNum, pn.lineNum);
        }
        return result;
    }

    //@Override
    //public int compareTo(PhoneNumber o) {
    //    return 0;
    //}
}
