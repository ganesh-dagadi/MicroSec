package com.api;
import java.util.ArrayList;
import java.util.List;

import com.AuthStrategies.AbstractAuthStrategy;
public class AuthenticationHandler {
    private final List<AuthenticationStrategyChain> authHandlers = new ArrayList<>();
    public void addAuthStrategyChain(AuthenticationStrategyChain chain){
        this.authHandlers.add(chain);
    }

    public void registerUser(){
        for(AuthenticationStrategyChain chain : authHandlers){
            for(AbstractAuthStrategy authStrategy : chain.getChain()){
                if(authStrategy.registerUser()) return;
            }
        }
    }
}