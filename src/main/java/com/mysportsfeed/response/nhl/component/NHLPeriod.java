package com.mysportsfeed.response.nhl.component;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class NHLPeriod {

    // TODO I don't know what periodSummary.period.@number means
//    @JsonProperty("@number")
//    private Integer period;

    private Integer awayScore;

    private Integer homeScore;

    private Integer awayShots;

    private Integer homeShots;

    private NHLScoringList scoring;

    private NHLPenaltyList penalties;

    private List<NHLPeriodTotal> periodTotals;

}
