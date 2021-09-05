package com.wuxx;

public class BuildDirectorMachel {
    private HouseBuilder houseBuilder = null;

    public  BuildDirectorMachel(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse(){
        houseBuilder.step01();
        houseBuilder.step02();
        houseBuilder.step03();
        return houseBuilder.buildHouse();
    }
}
