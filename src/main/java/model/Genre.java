package model;

public enum Genre {
    ACTION ("Action"),
    BIOGRAPHICAL ("Biographical"),
    CATASTROPHIC ("Catastrophic"),
    COMEDY ("Comedy"),
    DOCUMENTARY ("Documentary"),
    DRAMA ("Drama"),
    FANTASY ("Fantasy"),
    HISTORICAL ("Historical"),
    HORROR ("Horror"),
    KIDS ("Kids"),
    ROMANCE ("Romance"),
    SCIFI ("SciFi"),
    THRILLER ("Thriller"),
    WESTERN ("Western");

    private String name;

    Genre(String name){
        this.name = name;
    }
}
