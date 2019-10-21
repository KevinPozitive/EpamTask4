package by.epam.unit04.aggr_and_comp.first_task.entity;

import java.util.List;
import java.util.Objects;

public class Area {
    private String nameArea;
    private String areaCenter;
    private double areaSquare;

    public Area(String nameArea, City areaCenterCity, double areaSquare) {
        this.nameArea = nameArea;
        this.areaCenter = areaCenter;
        this.areaSquare = areaSquare;
    }
    public String getNameArea() {
        return nameArea;
    }
    public String getAreaCenter() {
        return areaCenter;
    }
    public double getAreaSquare() {
        return areaSquare;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameArea,areaCenter,areaSquare);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){return true;}
        if(obj == null||getClass()!=obj.getClass()){return false;}
        Area area = (Area) obj;
        return Double.compare(area.areaSquare, areaSquare) == 0 &&
                Objects.equals(nameArea, area.nameArea) &&
                Objects.equals(areaCenter, area.areaCenter);
    }

    @Override
    public String toString() {
        return "Area {" +
                "name area: " + nameArea +
                " area center: " + areaCenter +
                " area square: " + areaSquare +
                "}";
    }
}
