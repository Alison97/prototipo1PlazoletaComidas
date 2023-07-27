package org.example.foodCourt;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private int id;
    private String nit;
    private String businessName;
    private String email;
    private String address;
    private String webSite;
    private Menu menu;
    private boolean delivery;
    private List<Employee> employees;

    public Restaurant(int id, String nit, String businessName, String email, String address, String webSite, boolean delivery) {
        this.id = id;
        this.nit = nit;
        this.businessName = businessName;
        this.email = email;
        this.address = address;
        this.webSite = webSite;
        this.delivery = delivery;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}

