package com.mysportsfeed.response.nhl.component;

import lombok.Data;

import java.util.List;

@Data
public class NHLPlayerStatEntry {

    private NHLPlayer player;

    private String team;

    private List<NHLStat> stats;
}
