package com.mysportsfeed.dto.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GameScore {

    private GameEntry game;

    @JsonProperty("isUnplayed")
    private boolean unplayed;

    @JsonProperty("isInProgress")
    private boolean inProgress;

    @JsonProperty("isCompleted")
    private boolean completed;

    private Integer awayScore;

    private Integer homeScore;
}
