package ua.edu.ucu.apps.lab7.items.flowers;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum FlowerColor {
    @JsonProperty("Blue")
    BLUE,
    @JsonProperty("Red")
    RED,
    @JsonProperty("White")
    WHITE
}
