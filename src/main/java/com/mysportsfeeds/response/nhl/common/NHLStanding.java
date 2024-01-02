package com.mysportsfeeds.response.nhl.common;

import com.mysportsfeeds.response.common.Stats;
import com.mysportsfeeds.response.common.Team;
import lombok.Data;

@Data
public class NHLStanding {

    private Team team;
    private Integer rank;
    private Stats stats;
}
