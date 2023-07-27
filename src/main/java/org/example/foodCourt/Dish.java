package org.example.foodCourt;

public class Dish {
    private int id;
    private String dishDetail;
    private int price;

    public Dish(int id, String dishDetail, int price) {
        this.id = id;
        this.dishDetail = dishDetail;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDishDetail() {
        return dishDetail;
    }

    public void setDishDetail(String dishDetail) {
        this.dishDetail = dishDetail;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
