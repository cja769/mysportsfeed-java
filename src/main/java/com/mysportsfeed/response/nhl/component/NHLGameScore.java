package com.mysportsfeed.response.nhl.component;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class NHLGameScore {

    private NHLGameEntry game;

    @JsonProperty("isUnplayed")
    private boolean unplayed;

    @JsonProperty("isInProgress")
    private boolean inProgress;

    @JsonProperty("isCompleted")
    private boolean completed;

    private Integer awayScore;

    private Integer homeScore;

    private String currentPeriod;

    private String currentPeriodSecondsRemaining;

    private Integer awayShots;

    private Integer homeShots;

    private NHLPeriodSummary periodSummary;

}
