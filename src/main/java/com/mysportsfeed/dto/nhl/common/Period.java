package com.mysportsfeed.dto.nhl.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Period {

    @JsonProperty("@number") // TODO I don't know what periodSummary.period.@number means
    private Integer period;

    private Integer awayScore;

    private Integer homeScore;

    private Integer awayShots;

    private Integer homeShots;

    private ScoringList scoring;

    private PenaltyList penalties;

    private List<PeriodTotal> periodTotals;

}
