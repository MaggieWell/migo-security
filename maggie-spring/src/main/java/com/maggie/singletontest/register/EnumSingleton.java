package com.maggie.singletontest.register;

/**
 * Description:
 * author:MaggieHao
 * Date:2019-05-13
 * Time:22:31
 */

public enum EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }


}