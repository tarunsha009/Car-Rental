package com.taps.crt.dao;

import com.taps.crt.dto.User;

import java.io.Serializable;

public abstract class Account implements Serializable {
    private static final long serialVersionUID = -1695857603430911245L;

    private Long id;
    private User user;
    private String password;

    public abstract boolean resetPassword();

}
