package com.mysportsfeed.response.nhl.component;

import lombok.Data;

import java.util.List;

@Data
public class NHLStanding {

    private String team;

    private Integer rank;

    private List<NHLStat> stats;
}
