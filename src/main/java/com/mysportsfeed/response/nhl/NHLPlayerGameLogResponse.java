package com.mysportsfeed.response.nhl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeed.response.nhl.common.NHLPlayerGameLogs;
import lombok.Data;

@Data
public class NHLPlayerGameLogResponse {

    @JsonProperty("playergamelogs")
    private NHLPlayerGameLogs playerGameLogs;
}
