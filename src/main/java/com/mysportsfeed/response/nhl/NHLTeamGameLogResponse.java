package com.mysportsfeed.response.nhl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeed.response.nhl.common.NHLTeamGameLogs;
import lombok.Data;

@Data
public class NHLTeamGameLogResponse {

    @JsonProperty("teamgamelogs")
    private NHLTeamGameLogs teamGameLogs;
}
