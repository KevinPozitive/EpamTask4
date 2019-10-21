package by.epam.unit04.aggr_and_comp.first_task.logic;

import by.epam.unit04.aggr_and_comp.first_task.entity.Area;
import by.epam.unit04.aggr_and_comp.first_task.entity.City;
import by.epam.unit04.aggr_and_comp.first_task.entity.Region;
import by.epam.unit04.aggr_and_comp.first_task.entity.State;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        City city = new City("AAA");
        Area area1 = new Area("BBB", city,123);
        Area area3 = new Area("CCC", city,456);
        Area area2 = new Area("DDD", city,789);
        List<Area> areaList = new ArrayList<>();
        areaList.add(area1);
        areaList.add(area2);
        areaList.add(area3);
        Region region1 = new Region("EEE",areaList,city);
        Region region2 = new Region("FFF",areaList,city);
        List<Region> regionList = new ArrayList<>();
        regionList.add(region1);
        regionList.add(region2);
        State state = new State("State","MINSK",regionList);
        getCapitalName(state);
        getSquareOfState(state);
        getRegionCount(state);
        getRegionCapital(state);
    }

    private static void getRegionCapital(State state) {
        for(Region region:state.getRegionList()){
            System.out.println(region.getCapitalName().getNameCity());
        }
    }

    private static void getRegionCount(State state) {
        System.out.println("Region count: " +state.getRegionList().size());
    }

    private static void getSquareOfState(State state) {
        Square square = new Square();
        System.out.println("State square: " + square.getSquare(state));
    }

    private static void getCapitalName(State state) {
        System.out.println("Capital: " + state.getNameCapital());
    }
}
