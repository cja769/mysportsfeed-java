package com.mysportsfeed.response.nhl.component;

import lombok.Data;

import java.util.List;

@Data
public class NHLHomeTeam {

    private List<NHLStat> homeTeamStats;

    private List<NHLPlayerEntryPlayer> homePlayers;


}
