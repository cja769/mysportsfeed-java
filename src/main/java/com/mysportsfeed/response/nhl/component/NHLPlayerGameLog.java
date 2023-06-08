package com.mysportsfeed.response.nhl.component;

import lombok.Data;

import java.util.List;

@Data
public class NHLPlayerGameLog {

    // TODO don't know structure
    private Object player;

    // TODO don't know structure
    private Object team;

    private List<NHLStat> stats;

    // TODO don't know structure
    private Object game;
}
