package model.admin;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;

public class Restaurant {
    private long id;
    private String name;
    private String location;
    private CuisineType cuisineType;
    HashMap<String, HashMap<String, LocalTime>> opencloseTiming;
    private boolean isActive;
    private List<MenuItem> menu;

    public Restaurant(long id, String name, String location, CuisineType cuisineType, HashMap<String, HashMap<String, LocalTime>> opencloseTiming, boolean isActive, List<MenuItem> menu) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.cuisineType = cuisineType;
        this.opencloseTiming = opencloseTiming;
        this.isActive = isActive;
        this.menu = menu;
    }
}
