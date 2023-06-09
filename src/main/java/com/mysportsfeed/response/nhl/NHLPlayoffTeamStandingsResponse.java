package com.mysportsfeed.response.nhl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeed.response.nhl.NHLConferenceTeamStandingsResponse.NHLConferenceTeamStandings;
import lombok.Data;

@Data
public class NHLPlayoffTeamStandingsResponse {

    @JsonProperty("playoffstandings")
    private NHLConferenceTeamStandings playoffTeamStandings;

}
