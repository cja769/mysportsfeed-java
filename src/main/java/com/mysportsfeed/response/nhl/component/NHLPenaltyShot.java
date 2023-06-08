package com.mysportsfeed.response.nhl.component;

import lombok.Data;

@Data
public class NHLPenaltyShot {

    private String teamAbbreviation;

    // TODO don't know structure
    private Object shooter;

    private String outcome;
}
