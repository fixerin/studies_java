package com.company.devices;

public class Device {
    public String model;
    protected String weight;
    String producer;
    public Integer productionYear;
    private Integer price;

    public Device(String model, String weight, String producer, Integer productionYear, Integer price) {
        this.model = model;
        this.weight = weight;
        this.producer = producer;
        this.productionYear = productionYear;
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}
