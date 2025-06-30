package org.effective.chapter01.item03.field;

public class Concert {

    private boolean lightOn;

    private boolean mainStateOpen;

    //private Elvis elvis;
    private IElvis elvis;

    public Concert(IElvis elvis) {
        this.elvis = elvis;

    }

    public void perform(){
        mainStateOpen = true;
        lightOn = true;
        // 대역을 세울 수가 없다. = 테스트가 어렵다
        elvis.sing();
    }

    public boolean isLightOn(){
        return lightOn;
    }

    public boolean isMainStateOpen(){
        return mainStateOpen;
    }
}
