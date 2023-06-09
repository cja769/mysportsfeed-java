package com.mysportsfeeds.response.nhl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeeds.response.nhl.common.NHLPlayerGameLogs;
import lombok.Data;

@Data
public class NHLPlayerGameLogResponse {

    @JsonProperty("playergamelogs")
    private NHLPlayerGameLogs playerGameLogs;
}
