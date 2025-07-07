package org.effective.chapter01.item08.finalizer_attack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    @DisplayName("일반 계정으로 계좌를 만들고 송금을 시도하면 성공한다")
    public void 일반_계정 () throws Exception{
        //given
        Account account = new Account("광덕");
        account.transfer(BigDecimal.valueOf(10.4), "hello");
        //when

        //then
    }

    @Test
    @DisplayName("차단 계정으로 계좌를 만드는 것에 실패한다")
    public void 차단_계정 () throws Exception{
        //given
        //Account account = new Account("푸틴");
        //account.transfer(BigDecimal.valueOf(10.4), "hello");

        //when
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Account("푸틴");
        });
        //then
    }
    @Test
    @DisplayName("상속된 계좌로 계좌를 만들고 송금을 시도하면 성공한다.")
    public void 차단_계정_시도 () throws Exception{
        //given
        Account account = null;
        try {
            account = new BrokenAccount("푸틴");
        }catch (Exception exception){
            System.out.println("GO GO GO GO");
        }
        System.gc();
        Thread.sleep(3000L);
        account.transfer(BigDecimal.valueOf(10.4), "hello");

    }

}