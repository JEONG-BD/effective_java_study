package org.effective.chapter01.item01;
/**
 *  이 클래스의 인스턴스는 #getInstance()를 통해 생성한다.
 * @see #getInstance()
 *
 */

public class Settings {
    private boolean useAutoSteering;

    private boolean useABs;

    private Difficulty difficulty;

    private Settings() {
    }

    private static final Settings SETTINGS = new Settings();

    public static Settings getInstance() {
        return SETTINGS;
    }

    public static void main(String[] args) {
        System.out.println(new Settings());
        System.out.println(new Settings());
        System.out.println(new Settings());
        System.out.println(new Settings());


    }
}
