package ua.edu.ucu.apps.lab7.items.flowers;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum FlowerType {
    @JsonProperty("Rose")
    ROSE,
    @JsonProperty("Chamomile")
    CHAMOMILE,
    @JsonProperty("Tulip")
    TULIP,
    @JsonProperty("Cactus")
    CACTUS
}
