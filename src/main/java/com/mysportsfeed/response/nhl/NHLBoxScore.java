package com.mysportsfeed.response.nhl;

import com.mysportsfeed.response.nhl.component.NHLAwayTeam;
import com.mysportsfeed.response.nhl.component.NHLGame;
import com.mysportsfeed.response.nhl.component.NHLHomeTeam;
import com.mysportsfeed.response.nhl.component.NHLPeriodSummary;
import lombok.Data;

@Data
public class NHLBoxScore {

    private String lastUpdatedOn;

    private NHLGame game;

    private NHLPeriodSummary periodSummary;

    private NHLAwayTeam awayTeam;

    private NHLHomeTeam homeTeam;
}
