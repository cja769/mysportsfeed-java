package com.mysportsfeeds.response.nhl.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class NHLTeam {
    @JsonProperty("ID")
    private String id;
    @JsonProperty("City")
    private String city;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Abbreviation")
    private String abbreviation;
}
