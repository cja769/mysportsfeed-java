package com.mysportsfeeds.response.nhl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeeds.response.nhl.common.NHLTeamGameLogs;
import lombok.Data;

@Data
public class NHLTeamGameLogResponse {

    @JsonProperty("teamgamelogs")
    private NHLTeamGameLogs teamGameLogs;
}
