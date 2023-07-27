package org.example.foodCourt;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Owner extends Person {
    private List<Restaurant> restaurants = new ArrayList<Restaurant>();

    public Owner(int id, String name, String lastName, Date dateOfBirth, long phone, String email, String city, String neighborhood, String address, Restaurant restaurants) {
        super(id, name, lastName, dateOfBirth, phone, email, city, neighborhood, address);
    }

    public void asignRestaurant(Restaurant restaurant){
        this.restaurants.add(restaurant);
    }
}
