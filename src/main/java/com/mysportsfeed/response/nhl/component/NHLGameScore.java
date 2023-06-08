package com.mysportsfeed.response.nhl.component;

import com.mysportsfeed.response.common.GameScore;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class NHLGameScore extends GameScore {

    private String currentPeriod;

    private String currentPeriodSecondsRemaining;

    private Integer awayShots;

    private Integer homeShots;

    private NHLPeriodSummary periodSummary;

}
