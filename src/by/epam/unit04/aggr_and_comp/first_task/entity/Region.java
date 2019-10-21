package by.epam.unit04.aggr_and_comp.first_task.entity;

import java.util.List;
import java.util.Objects;

public class Region {
    private String nameRegion;
    private List<Area> areaList;
    private City regionCenterCity;

    public Region(String nameRegion, List<Area> areaList, City capitalName) {
        this.nameRegion = nameRegion;
        this.areaList = areaList;
        this.regionCenterCity = capitalName;
    }
    public String getNameRegion() {
        return nameRegion;
    }
    public List<Area> getAreaList() {
        return areaList;
    }
    public City getCapitalName() {
        return regionCenterCity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameRegion,areaList,regionCenterCity);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){return true;}
        if(obj == null||getClass()!=obj.getClass()){return false;}
        Region region = (Region) obj;
        return Objects.equals(nameRegion,region.nameRegion)&&
                Objects.equals(areaList,region.areaList)&&
                Objects.equals(regionCenterCity,region.regionCenterCity);
    }

    @Override
    public String toString() {
        return "Region { region name:" + nameRegion +
                "list area:" + areaList +
                "region center:" + regionCenterCity + "}";
    }
}
