package org.effective.chapter01.item02.illegalargumentexception;

import java.time.LocalDate;

public class Order {

    public void updateDeliveryDate(LocalDate deliveryDate) throws  IllegalArgumentException{
        if(deliveryDate == null){
            throw  new NullPointerException("deliveryDate can't be null");
        }

        if(deliveryDate.isBefore(LocalDate.now())){
            // IllegalArgumentException에 충분한 예외를 던져야 한다.

            throw new IllegalArgumentException("deliveryDate cat't be earlier than" + LocalDate.now());
        }
    }
}
