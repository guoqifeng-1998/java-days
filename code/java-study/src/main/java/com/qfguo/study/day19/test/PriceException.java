package com.qfguo.study.day19.test;

public class PriceException extends Exception{
    private String msg;
    public PriceException(String msg){
        super(msg);
    }

}
