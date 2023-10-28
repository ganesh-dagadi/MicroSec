package com.AuthStrategies;

import com.api.AuthenticationHandlerBuilder;
import com.helperStrategies.AbstractHelperStrategy;
import com.helperStrategies.OTPAuthStrategy;
import com.helperStrategies.PasswordAuthStratgy;

public class PhoneNumberAuthStrategy extends AbstractAuthStrategy{
     public PhoneNumberAuthStrategy(AuthenticationHandlerBuilder builder) {
        super(builder);
    }

    public AbstractHelperStrategy helperStrategy;

    @Override
    public AuthenticationHandlerBuilder withPassword(){
       this.helperStrategy = new PasswordAuthStratgy();
       return builder;
    }

     @Override
    public AuthenticationHandlerBuilder withOTP(){
        this.helperStrategy = new OTPAuthStrategy();
        return builder;
    }

    @Override
    public Boolean registerUser(){
        System.out.println("Registering user with phone number");
        helperStrategy.verify();
        return true;
    }
}
