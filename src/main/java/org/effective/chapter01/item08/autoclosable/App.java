package org.effective.chapter01.item08.autoclosable;

public class App {
    public static void main(String[] args) {

        try(AutoCloseableIsGood good = new AutoCloseableIsGood()) {
            // 자원 정리
        }
    }
}
