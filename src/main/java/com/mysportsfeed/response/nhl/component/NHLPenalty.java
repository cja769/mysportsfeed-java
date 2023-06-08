package com.mysportsfeed.response.nhl.component;

import lombok.Data;

@Data
public class NHLPenalty {

    private String time;

    private String teamAbbreviation;

    // TODO don't know structure
    private Object penalizedPlayer;

    private String severity;

    private String type;
}
