package com.mysportsfeed.response.nhl.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class NHLPlayer {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("LastName")
    private String lastName;
    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("JerseyNumber")
    private Integer jerseyNumber;
    @JsonProperty("Position")
    private String position;
    private String dfsSourceId;
}
