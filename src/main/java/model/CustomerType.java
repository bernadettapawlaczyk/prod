package model;

public enum CustomerType {
    SILVER ("silver"),
    GOLD ("gold"),
    PLATINIUM("platinium");

    private String name;

    CustomerType(String name){
        this.name = name;
    }
}
