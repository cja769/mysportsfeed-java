package com.mysportsfeed.response.nhl.component;

import lombok.Data;

import java.util.List;

@Data
public class NHLPlayerEntry {

    private List<NHLStat> stats;

    // TODO don't know structure
    private Object player;
}
