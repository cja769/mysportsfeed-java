package com.mysportsfeed.response.nhl;

import com.mysportsfeed.response.nhl.component.NHLStanding;
import lombok.Data;

import java.util.List;

@Data
public class NHLOverallTeamStandings {

    private String lastUpdatedOn;

    List<NHLStanding> teamstandingsentry;
}
