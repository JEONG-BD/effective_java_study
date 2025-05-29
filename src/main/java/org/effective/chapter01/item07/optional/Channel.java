package org.effective.chapter01.item07.optional;

import java.util.Optional;

public class Channel {

    private int numOfSubscribes;

    public Optional<MemberShip> defaultMemberShipOptional(){
        if(this.numOfSubscribes < 2000){
            return Optional.empty();
        }else {
            return Optional.of(new MemberShip());
        }
    }

    public MemberShip defaultMemberShipNull(){
        if(this.numOfSubscribes < 2000){
            return null;
        }else {
            return new MemberShip();
        }
    }

}
