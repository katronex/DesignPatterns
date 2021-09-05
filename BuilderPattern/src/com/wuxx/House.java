package com.wuxx;
/**
 * author wuxx
 * date 2021-9-5
 */

//product
public class House {
    private String component01;
    private String component02;
    private String component03;


    public House() {
    }

    public House(String component01, String component02, String component03) {
        this.component01 = component01;
        this.component02 = component02;
        this.component03 = component03;
    }

    public String getComponent01() {
        return component01;
    }

    public void setComponent01(String component01) {
        this.component01 = component01;
    }

    public String getComponent02() {
        return component02;
    }

    public void setComponent02(String component02) {
        this.component02 = component02;
    }

    public String getComponent03() {
        return component03;
    }

    public void setComponent03(String component03) {
        this.component03 = component03;
    }
}
