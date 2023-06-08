package com.mysportsfeed.response.nhl.component;

import lombok.Data;

@Data
public class NHLPlayByPlayPenalty {

    private String teamAbbreviation;

    private NHLPlayer penalizedPlayer;

    private String severity;

    private Integer durationMinutes;

    private String type;
}
