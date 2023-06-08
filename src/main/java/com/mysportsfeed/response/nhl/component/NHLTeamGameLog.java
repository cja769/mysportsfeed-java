package com.mysportsfeed.response.nhl.component;

import lombok.Data;

import java.util.List;

@Data
public class NHLTeamGameLog {

    // TODO don't know structure
    private Object game;

    // TODO don't know structure
    private Object team;

    private List<NHLStat> stats;
}
