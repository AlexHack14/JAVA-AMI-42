package ua.edu.lnu.classes;

import java.math.BigDecimal;

public class HouseholdAppliances {

    private String name;
    private BigDecimal price;
    private String type;

    public HouseholdAppliances() {
    }

    public HouseholdAppliances(String name, BigDecimal price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }
    public HouseholdAppliances(HouseholdAppliances householdAppliances) {
        this.name = householdAppliances.name;
        this.price = householdAppliances.price;
        this.type = householdAppliances.type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String show(){
        return "HouseholdAppliances{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "HouseholdAppliances{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}
