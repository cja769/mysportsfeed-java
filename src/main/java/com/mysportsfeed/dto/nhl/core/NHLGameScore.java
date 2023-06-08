package com.mysportsfeed.dto.nhl.core;

import com.mysportsfeed.dto.common.GameScore;
import com.mysportsfeed.dto.nhl.common.PeriodSummary;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class NHLGameScore extends GameScore {

    private String currentPeriod;

    private String currentPeriodSecondsRemaining;

    private Integer awayShots;

    private Integer homeShots;

    private PeriodSummary periodSummary;

}
