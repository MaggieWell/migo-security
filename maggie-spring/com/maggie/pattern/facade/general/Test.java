package com.maggie.pattern.facade.general;


public class Test {
    //客户
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.doA();
        facade.doB();
        facade.doC();

    }


}
