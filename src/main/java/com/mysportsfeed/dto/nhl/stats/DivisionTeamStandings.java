package com.mysportsfeed.dto.nhl.stats;

import lombok.Data;

import java.util.List;

@Data
public class DivisionTeamStandings {

    private String lastUpdatedOn;

    private List<Division> division;
}
