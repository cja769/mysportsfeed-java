package com.mysportsfeed.dto.nhl.stats;

import lombok.Data;

import java.util.List;

@Data
public class TeamGameLogList {

    private String lastUpdatedOn;

    private List<TeamGameLog> gamelogs;
}
