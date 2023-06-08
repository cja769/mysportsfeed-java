package com.mysportsfeed.response.nhl.component;

import lombok.Data;

@Data
public class NHLPeriodTotal {

    private Integer awayScore;

    private Integer homeScore;

    private Integer awayShots;

    private Integer homeShots;
}
