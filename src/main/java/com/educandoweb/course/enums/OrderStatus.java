package com.educandoweb.course.enums;

import com.educandoweb.course.entities.Order;

import java.security.InvalidParameterException;

public enum OrderStatus {

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5),
    ;

    private int code;

    private OrderStatus(int code) {
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    public static OrderStatus valueOf(int i){
        for (OrderStatus value: OrderStatus.values()) {
            if(i == value.getCode()){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid code");
    }

}
