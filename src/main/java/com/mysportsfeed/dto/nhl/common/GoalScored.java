package com.mysportsfeed.dto.nhl.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GoalScored {

    private String time;

    private String teamAbbreviation;

    private Player goalScorer;

    @JsonProperty("assist1Player")
    private Player assist1Player;

    @JsonProperty("assist2Player")
    private Player assist2Player;
}
