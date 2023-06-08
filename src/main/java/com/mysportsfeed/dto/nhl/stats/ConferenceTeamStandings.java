package com.mysportsfeed.dto.nhl.stats;

import lombok.Data;

@Data
public class ConferenceTeamStandings {

    private String lastUpdatedOn;

    private Conference conference;
}
