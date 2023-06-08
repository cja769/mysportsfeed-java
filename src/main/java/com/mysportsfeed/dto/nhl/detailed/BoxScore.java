package com.mysportsfeed.dto.nhl.detailed;

import com.mysportsfeed.dto.nhl.common.Game;
import com.mysportsfeed.dto.nhl.common.PeriodSummary;
import lombok.Data;

@Data
public class BoxScore {

    private String lastUpdatedOn;

    private Game game;

    private PeriodSummary periodSummary;

    private AwayTeam awayTeam;

    private HomeTeam homeTeam;
}
