package by.epam.unit04.aggr_and_comp.fourth_task.entity;

import java.util.Objects;

public class Tour {
    private int cost;
    private int numbOfDays;
    private String tourType;

    public Tour(int cost, int numbOfDays) {
        this.cost = cost;
        this.numbOfDays = numbOfDays;
        this.tourType = tourType;
    }

    public void setTourType(String tourType) {
        this.tourType = tourType;
    }

    public int getCost() {
        return cost;
    }
    public int getNumbOfDays() {
        return numbOfDays;
    }

    public String getTourType() {
        return tourType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost,numbOfDays);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){return true;}
        if(obj == null || getClass()!=obj.getClass()){return false;}
        Tour tour = (Tour) obj;
        return numbOfDays == tour.numbOfDays &&
                cost ==tour.cost &&
                Objects.equals(tourType,tour.tourType);
    }

    @Override
    public String toString() {
        return "Tour: how long: " + numbOfDays +
                "how mach: " + cost +
                "which type:" + tourType;
    }
}
