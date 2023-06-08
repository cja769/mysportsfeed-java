package com.mysportsfeed.dto.nhl.detailed;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeed.dto.nhl.common.Player;
import lombok.Data;

@Data
public class Goal {

    private String specialTeam;

    private String teamAbbreviation;

    private Player goalScorer;

    @JsonProperty("assist1Player")
    private Player assist1Player;

    @JsonProperty("assist2Player")
    private Player assist2Player;
}
