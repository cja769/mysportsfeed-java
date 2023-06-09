package com.mysportsfeeds.response.nhl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeeds.response.nhl.NHLConferenceTeamStandingsResponse.NHLConferenceTeamStandings;
import lombok.Data;

@Data
public class NHLPlayoffTeamStandingsResponse {

    @JsonProperty("playoffteamstandings")
    private NHLConferenceTeamStandings playoffTeamStandings;

}
