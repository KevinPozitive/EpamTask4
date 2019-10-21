package by.epam.unit04.aggr_and_comp.fourth_task.entity;

import java.util.List;
import java.util.Objects;

public class TourAgency {
    List<Tour> tours;

    public List<Tour> getTours() {
        return tours;
    }

    public TourAgency(List<Tour> tours) {
        this.tours = tours;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tours);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){return true;}
        if(obj == null||getClass()!=obj.getClass()){return false;}
        TourAgency tourAgency = (TourAgency)obj;
        return Objects.equals(tours,tourAgency.tours);
    }

    @Override
    public String toString() {
        return "Tour Agency tours:" + tours;
    }
}
