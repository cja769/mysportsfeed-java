package com.mysportsfeed.response.nhl.component;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class NHLGoalScored {

    private String time;

    private String teamAbbreviation;

    private NHLPlayer goalScorer;

    @JsonProperty("assist1Player")
    private NHLPlayer assist1Player;

    @JsonProperty("assist2Player")
    private NHLPlayer assist2Player;
}
