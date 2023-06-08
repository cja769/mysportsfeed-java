package com.mysportsfeed.response.nhl.component;

import lombok.Data;

@Data
public class NHLPlayByPlayPenalty {

    private String teamAbbreviation;

    // TODO don't know structure
    private Object penalizedPlayer;

    private String severity;

    private Integer durationMinutes;

    private String type;
}
