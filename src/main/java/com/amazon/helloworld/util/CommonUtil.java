package com.amazon.helloworld.util;

public final class CommonUtil {

    private CommonUtil(){

    }
    public static String maskAccountNumber(String accNumber){
        return "***********"+accNumber.substring(accNumber.length()-4);
    }
    
}
