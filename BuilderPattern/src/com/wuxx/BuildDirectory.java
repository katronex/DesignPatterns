package com.wuxx;

/**
 * author wuxx
 * date 2021-9-5
 */
//direct the real step when building a house
public class BuildDirectory {
    HouseBuilder houseBuilder = null;

    //constructor injection
    public BuildDirectory(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //building progress
    public House constructHouse(){
         houseBuilder.step03();
         houseBuilder.step02();
         houseBuilder.step01();
         return  houseBuilder.buildHouse();
    }
}
