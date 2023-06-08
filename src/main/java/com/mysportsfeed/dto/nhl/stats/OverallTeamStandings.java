package com.mysportsfeed.dto.nhl.stats;

import lombok.Data;

import java.util.List;

@Data
public class OverallTeamStandings {

    private String lastUpdatedOn;

    List<Standing> teamstandingsentry;
}
