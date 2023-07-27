package org.example.foodCourt;

import java.util.Date;

public class Admin extends Person {


    public Admin(int id, String name, String lastName, Date dateOfBirth, long phone, String email, String city, String neighborhood, String address) {
        super(id, name, lastName, dateOfBirth, phone, email, city, neighborhood, address);
    }

    public Restaurant createRestaurant (){
        Restaurant restaurant = new Restaurant(1,"1152461961","Ali S.A","nopi@correo.com","cra 4 # 12 -108","ali.com.co", false);
        return (restaurant);
    }

    public Owner createOwner (Restaurant restaurant){
        Owner owner = new Owner(1,"Alison","Duque",new Date("13/02/1997"),320760514,"nopi@correo.com","Ipiales","San Felipe","cra 4 # 12 -108",restaurant);
        return (owner);
    }

    public void createOwnerAndRestaurant (){
        Restaurant restaurant = this.createRestaurant();
        this.createOwner(restaurant);
    }

    public void addNewRestaurant (Restaurant restaurant, Owner owner) {
        owner.asignRestaurant(restaurant);
    }

}
