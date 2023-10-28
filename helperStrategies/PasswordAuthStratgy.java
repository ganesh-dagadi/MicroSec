package com.helperStrategies;


public class PasswordAuthStratgy extends AbstractHelperStrategy {
    @Override
    public Boolean verify(){
        System.out.println("Verifying password");
        return true;
    }    
}
