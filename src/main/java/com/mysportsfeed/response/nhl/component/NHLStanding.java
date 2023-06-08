package com.mysportsfeed.response.nhl.component;

import lombok.Data;

import java.util.List;

@Data
public class NHLStanding {

    // TODO don't know structure
    private Object team;

    private Integer rank;

    private List<NHLStat> stats;
}
