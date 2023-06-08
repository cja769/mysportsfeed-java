package com.mysportsfeed.response.nhl.component;

import lombok.Data;

import java.util.List;

@Data
public class NHLPlayerGameLog {

    private NHLPlayer player;

    private String team;

    private List<NHLStat> stats;

    private String game;
}
