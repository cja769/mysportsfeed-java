package com.mysportsfeeds.response.nhl.common;

import lombok.Data;

@Data
public class NHLStanding {

    private NHLTeam team;
    private Integer rank;
    private NHLStats stats;
}
