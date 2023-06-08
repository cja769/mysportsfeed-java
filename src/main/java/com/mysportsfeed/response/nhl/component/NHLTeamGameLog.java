package com.mysportsfeed.response.nhl.component;

import lombok.Data;

import java.util.List;

@Data
public class NHLTeamGameLog {

    private String game;

    private String team;

    private List<NHLStat> stats;
}
