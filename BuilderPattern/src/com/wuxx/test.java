package com.wuxx;

/**
 * author wuxx
 * date 2021-9-5
 */
public class test
{
    public static void main(String[] args) {
        //the object you want building
        SpecifyHouseBuilder specifyHouseBuilder = new SpecifyHouseBuilder();

        //Directer
        BuildDirectory buildDirectory = new BuildDirectory(specifyHouseBuilder);
        BuildDirectorMachel buildDirectorMachel = new BuildDirectorMachel(specifyHouseBuilder);


        House house = buildDirectory.constructHouse();
        House house1 = buildDirectorMachel.constructHouse();
    }
}
