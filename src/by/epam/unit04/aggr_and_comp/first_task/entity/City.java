package by.epam.unit04.aggr_and_comp.first_task.entity;

import java.util.List;
import java.util.Objects;

public class City {
    private String nameCity;
    public City(String nameCity) {
        this.nameCity = nameCity;
    }
    public String getNameCity() {
        return nameCity;
    }
    @Override
    public int hashCode() {
        return Objects.hash(nameCity);
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj){return true;}
        if(obj == null||getClass()!=obj.getClass()){
            return false;
        }
        City city = (City) obj;
        return Objects.equals(nameCity,city.nameCity);
    }
    @Override
    public String toString() {
        return "City { name city:" +
                nameCity + "}";
    }
}
