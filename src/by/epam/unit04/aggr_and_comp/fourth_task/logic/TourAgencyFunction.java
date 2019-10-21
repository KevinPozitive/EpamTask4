package by.epam.unit04.aggr_and_comp.fourth_task.logic;

import by.epam.unit04.aggr_and_comp.fourth_task.entity.Tour;
import by.epam.unit04.aggr_and_comp.fourth_task.entity.TourAgency;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TourAgencyFunction {
    public Tour findTour(List<Tour> tourList, String tourType){
        for(Tour tour : tourList){
            if(tour.getTourType()==tourType){
                return tour;
            }
        }
        return null;
    }
    public TourAgency sortOnCost(TourAgency tourAgency){
        Collections.sort(tourAgency.getTours(), Comparator.comparing(Tour::getCost));
        return tourAgency;
    }
}
