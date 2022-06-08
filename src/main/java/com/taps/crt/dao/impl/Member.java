package com.taps.crt.dao.impl;

import com.taps.crt.dao.Account;

public class Member extends Account {

    private Integer totalVehicleReserverd;


    @Override
    public boolean resetPassword() {
        return false;
    }
}
