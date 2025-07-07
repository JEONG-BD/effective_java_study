package org.effective.chapter02.item11.hashcode;

import java.util.Objects;

public final class PhoneNumber {
    private final short areaCode, prefix, lineNum;

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

    @Override
    public int hashCode() {
        return 42;
        //return Objects.hash(areaCode, prefix, lineNum);
    }
}
