package by.epam.unit04.aggr_and_comp.first_task.logic;

import by.epam.unit04.aggr_and_comp.first_task.entity.Area;
import by.epam.unit04.aggr_and_comp.first_task.entity.Region;
import by.epam.unit04.aggr_and_comp.first_task.entity.State;

public class Square {
    public double getSquare(State state){
        double square = 0;
        for(Region region: state.getRegionList()){
            for(Area area: region.getAreaList()){
                square +=area.getAreaSquare();
            }
        }
        return square;
    }
}
