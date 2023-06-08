package com.mysportsfeed.response.nhl.component;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class NHLGoalScored {

    private String time;

    private String teamAbbreviation;

    // TODO don't know structure
    private Object goalScorer;

    // TODO don't know structure
    @JsonProperty("assist1Player")
    private Object assist1Player;

    // TODO don't know structure
    @JsonProperty("assist2Player")
    private Object assist2Player;
}
