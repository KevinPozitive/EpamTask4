package by.epam.unit04.aggr_and_comp.first_task.entity;

import java.util.List;
import java.util.Objects;

public class State {
    private String nameState;
    private String nameCapital;
    private List<Region> regionList;

    public State(String nameState, String nameCapital, List<Region> regionList) {
        this.nameState = nameState;
        this.nameCapital = nameCapital;
        this.regionList = regionList;
    }

    public String getNameState() {
        return nameState;
    }
    public String getNameCapital() {
        return nameCapital;
    }
    public List<Region> getRegionList() {
        return regionList;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameState, nameCapital,regionList);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){return true;}
        if(obj == null||getClass()!=obj.getClass()){
            return false;
        }
        State state = (State) obj;
        return Objects.equals(nameState, state.nameState) &&
                Objects.equals(nameCapital, state.nameCapital) &&
                Objects.equals(regionList, state.regionList);
    }

    @Override
    public String toString() {
        return "State { name state: " +
                nameState + " name capital: "+
                nameCapital + " regionList: "+
                regionList + " }";

    }
}
