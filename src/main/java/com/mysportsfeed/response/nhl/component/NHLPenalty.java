package com.mysportsfeed.response.nhl.component;

import lombok.Data;

@Data
public class NHLPenalty {

    private String time;

    private String teamAbbreviation;

    private NHLPlayer penalizedPlayer;

    private String severity;

    private String type;
}
