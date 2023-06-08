package com.mysportsfeed.response.nhl.component;

import lombok.Data;

@Data
public class NHLPenaltyShot {

    private String teamAbbreviation;

    private NHLPlayer shooter;

    private String outcome;
}
