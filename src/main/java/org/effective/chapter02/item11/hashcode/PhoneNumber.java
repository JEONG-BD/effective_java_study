package org.effective.chapter02.item11.hashcode;

import org.effective.chapter02.item10.Point;

import java.util.Objects;

public final class PhoneNumber {
    private final short areaCode, prefix, lineNum;
    private Point point;
    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "area code");
        this.prefix = rangeCheck(prefix, 999, "prefix");
        this.lineNum = rangeCheck(lineNum, 9999, "line num");
    }

    private static short rangeCheck(int val, int max, String arg){
        if (val < 0 || val > max )
            throw new IllegalArgumentException(arg + " : " + val);
        return (short) val;
    }

    public boolean equals(Object o){
        if( o == this)
            return false;

        if(!(o instanceof PhoneNumber))
            return false;

        PhoneNumber phoneNumber = (PhoneNumber) o;
        return phoneNumber.lineNum == lineNum
                && phoneNumber.prefix == prefix
                && phoneNumber.areaCode == areaCode;
    }

    //@Override
    //public int hashCode() {
    //    return 42;
    //    //return Objects.hash(areaCode, prefix, lineNum);
    //}

    @Override
    public int hashCode(){
        // primitive
        int result = Short.hashCode(areaCode);
        result = 31 * result + Short.hashCode(prefix);
        result = 31 * result + Short.hashCode(lineNum);

        return result;
    }
}
