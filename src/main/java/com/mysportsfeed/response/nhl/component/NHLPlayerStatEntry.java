package com.mysportsfeed.response.nhl.component;

import lombok.Data;

import java.util.List;

@Data
public class NHLPlayerStatEntry {

    // TODO don't know structure
    private Object player;

    private String team;

    private List<NHLStat> stats;
}
