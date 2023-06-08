package com.mysportsfeed.response.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeed.response.nhl.component.NHLGameEntry;
import lombok.Data;

@Data
public class GameScore {

    private NHLGameEntry game;

    @JsonProperty("isUnplayed")
    private boolean unplayed;

    @JsonProperty("isInProgress")
    private boolean inProgress;

    @JsonProperty("isCompleted")
    private boolean completed;

    private Integer awayScore;

    private Integer homeScore;
}
