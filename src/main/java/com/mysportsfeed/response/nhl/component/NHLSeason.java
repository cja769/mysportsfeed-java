package com.mysportsfeed.response.nhl.component;

import lombok.Data;

import java.util.List;

@Data
public class NHLSeason {

    private NHLDetail details;

    private List<NHLStat> supportedPlayerStats;

    private List<NHLStat> supportedTeamStats;
}
