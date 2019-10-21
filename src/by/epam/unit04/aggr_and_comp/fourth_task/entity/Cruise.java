package by.epam.unit04.aggr_and_comp.fourth_task.entity;

public class Cruise extends Tour{
    public Cruise(int cost, int numbOfDays) {
        super(cost, numbOfDays);
        this.setTourType("Cruise");
    }

    @Override
    public String toString() {
        return "Tour type:" + this.getTourType()
                + super.toString();
    }
}
