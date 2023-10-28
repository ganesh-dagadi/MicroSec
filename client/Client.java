package com.client;

import com.api.AuthenticationHandler;
import com.api.AuthenticationHandlerBuilder;
import com.api.UserIdentificationService;

class UserIdentifierConfig implements UserIdentificationService{
    @Override
    public AuthenticationHandler getAuthenticationStrategy(){
        return AuthenticationHandlerBuilder.getBuilder().initBuilder().withEmail().withPassword()
        .or().withPhone().withOTP().or().none()
        .build();
    }
}

public class Client {
   
    public static void main(String[] args){
         UserIdentifierConfig config = new UserIdentifierConfig();
        AuthenticationHandler handler =  config.getAuthenticationStrategy();
        handler.registerUser();
    }
}
    
