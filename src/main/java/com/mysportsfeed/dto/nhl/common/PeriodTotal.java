package com.mysportsfeed.dto.nhl.common;

import lombok.Data;

@Data
public class PeriodTotal {

    private Integer awayScore;

    private Integer homeScore;

    private Integer awayShots;

    private Integer homeShots;
}
