package model.admin;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;

public class FastFoodRestaurant extends Restaurant{
    boolean driveThru;

    public FastFoodRestaurant(long id, String name, String location, CuisineType cuisineType, HashMap<String, HashMap<String, LocalTime>> opencloseTiming, boolean isActive, List<MenuItem> menu, boolean driveThru){
        super(id, name, location, cuisineType, opencloseTiming, isActive,menu);
        this.driveThru = driveThru;
    }
}
