package com.mysportsfeeds.response.nhl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeeds.response.nhl.common.NHLStanding;
import lombok.Data;

import java.util.List;

@Data
public class NHLConferenceTeamStandingsResponse {

    @JsonProperty("conferenceteamstandings")
    private NHLConferenceTeamStandings conferenceTeamStandings;

    @Data
    public static class NHLConferenceTeamStandings {
        private String lastUpdatedOn;
        private List<NHLConference> conference;

        @Data
        public static class NHLConference {

            @JsonProperty("@name")
            private String name;
            @JsonProperty("teamentry")
            private List<NHLStanding> teamEntries;
        }
    }
}
