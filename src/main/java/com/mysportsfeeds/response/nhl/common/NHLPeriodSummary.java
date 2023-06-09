package com.mysportsfeeds.response.nhl.common;

import lombok.Data;

import java.util.List;

@Data
public class NHLPeriodSummary {

    private List<NHLPeriod> period;
    private NHLPeriodTotal periodTotals;

    @Data
    public static class NHLPeriodTotal {

        private Integer awayScore;
        private Integer homeScore;
        private Integer awayShots;
        private Integer homeShots;
    }
}
