package org.effective.chapter01.item07.optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ChannelTest {

    @Test
    @DisplayName("Optional를 사용해서 NullPointerException을 피한다.")
    void npe(){
        Channel channel = new Channel();
        //Optional<MemberShip> memberShip = channel.defaultMemberShipOptional();
        //memberShip.ifPresent(MemberShip::hello);
        //
        Optional<MemberShip> optional = channel.defaultMemberShipOptional();
        MemberShip memberShip = optional.get();
        memberShip.hello();
    }
    @Test
    @DisplayName("Null을 사용해서 NullPointerException을 발생시킨다.")
    void npe2(){
        Channel channel = new Channel();
        MemberShip memberShip = channel.defaultMemberShipNull();
        if(memberShip != null){
            memberShip.equals(new MemberShip());
        }
    }

}