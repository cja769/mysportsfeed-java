package com.mysportsfeed.response.nhl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeed.response.nhl.common.NHLPlayerStats;
import lombok.Data;

@Data
public class NHLDailyPlayerStatsResponse {
    @JsonProperty("dailyplayerstats")
    private NHLPlayerStats dailyPlayerStats;
}
