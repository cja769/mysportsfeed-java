package com.mysportsfeed.response.nhl.component;

import lombok.Data;

import java.util.List;

@Data
public class NHLAwayTeam {

    private List<NHLStat> awayTeamStats;

    private List<NHLPlayerEntryPlayer> awayPlayers;


}
