package com.wuxx;

/**
 * author wuxx
 * date 2021-9-5
 */
public abstract class HouseBuilder {
    protected House house = new House();

    //building details
    public abstract void step01();
    public abstract void step02();
    public abstract void step03();

    public House buildHouse(){
        return house;
    }
}
