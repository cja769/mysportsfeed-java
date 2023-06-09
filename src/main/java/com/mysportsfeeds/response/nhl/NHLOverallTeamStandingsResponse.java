package com.mysportsfeeds.response.nhl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeeds.response.nhl.common.NHLStanding;
import lombok.Data;

import java.util.List;

@Data
public class NHLOverallTeamStandingsResponse {

    @JsonProperty("overallteamstandings")
    private NHLOverallTeamStandings overallTeamStandings;

    @Data
    public static class NHLOverallTeamStandings {
        private String lastUpdatedOn;
        @JsonProperty("teamstandingsentry")
        List<NHLStanding> teamStandings;
    }
}
