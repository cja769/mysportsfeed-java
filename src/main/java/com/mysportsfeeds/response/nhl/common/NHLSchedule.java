package com.mysportsfeeds.response.nhl.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class NHLSchedule {

    private String lastUpdatedOn;
    @JsonProperty("gameentry")
    private List<NHLGame> gameEntries;

}
