package com.AuthStrategies;

import com.api.AuthenticationHandlerBuilder;

public abstract class AbstractAuthStrategy {
    protected AuthenticationHandlerBuilder builder;
    protected AbstractAuthStrategy(AuthenticationHandlerBuilder builder){
        this.builder = builder;
    }
    public abstract AuthenticationHandlerBuilder withPassword();
    public abstract AuthenticationHandlerBuilder withOTP();
    public abstract Boolean registerUser();
}
