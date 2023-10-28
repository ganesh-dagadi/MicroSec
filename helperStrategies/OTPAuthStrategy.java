package com.helperStrategies;

public class OTPAuthStrategy extends AbstractHelperStrategy {
    public Boolean verify(){
        System.out.println("verifying otp");
        return true;
    } 
}
