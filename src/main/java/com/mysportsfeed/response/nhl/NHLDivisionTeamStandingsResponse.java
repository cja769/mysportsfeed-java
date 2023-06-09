package com.mysportsfeed.response.nhl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeed.response.nhl.common.NHLStanding;
import lombok.Data;

import java.util.List;

@Data
public class NHLDivisionTeamStandingsResponse {

    @JsonProperty("divisionteamstandings")
    private NHLDivisionTeamStandings divisionTeamStandings;

    @Data
    public static class NHLDivisionTeamStandings {
        private String lastUpdatedOn;
        private List<NHLDivision> division;

        @Data
        public static class NHLDivision {

            @JsonProperty("@name")
            private String name;
            @JsonProperty("teamentry")
            private List<NHLStanding> teamEntries;
        }
    }
}
