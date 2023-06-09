package com.mysportsfeeds.response.nhl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeeds.response.nhl.common.NHLPlayerStats;
import lombok.Data;

@Data
public class NHLCumulativePlayerStatsResponse {

    @JsonProperty("cumulativeplayerstats")
    private NHLPlayerStats cumulativePlayerStats;
}
