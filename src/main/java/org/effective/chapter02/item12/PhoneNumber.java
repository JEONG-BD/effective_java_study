package org.effective.chapter02.item12;

import java.util.Objects;

public class PhoneNumber {
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


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PhoneNumber that)) return false;
        return areaCode == that.areaCode && prefix == that.prefix && lineNum == that.lineNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, prefix, lineNum);
    }

    //@Override
    //public String toString() {
    //    return "PhoneNumber{" +
    //            "areaCode=" + areaCode +
    //            ", prefix=" + prefix +
    //            ", lineNum=" + lineNum +
    //            '}';
    //}

    @Override
    public String toString() {
        return String.format("%03d-%03d-%04d", areaCode, prefix, lineNum);
    }

    //
    public static PhoneNumber of(String phoneNumberString){
        String[] split = phoneNumberString.split("-");
        // 입력 값도 검중
        PhoneNumber phoneNumber = new PhoneNumber(Integer.parseInt(split[0]),
                Integer.parseInt(split[1]),
                Integer.parseInt(split[2]));
        return phoneNumber;
    }

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber(111, 222, 333);
        System.out.println("phone number " + phoneNumber);
    }
}
