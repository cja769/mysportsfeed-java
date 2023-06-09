package com.mysportsfeeds.response.nhl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeeds.response.nhl.common.*;
import com.mysportsfeeds.response.nhl.common.NHLPlayerStats.NHLPlayerStatEntry;
import lombok.Data;

import java.util.List;

@Data
public class NHLCumulativePlayerStatsResponse {

    @JsonProperty("cumulativeplayerstats")
    private NHLCumulativePlayerStats cumulativePlayerStats;

    @Data
    public static class NHLCumulativePlayerStats {
        private String lastUpdatedOn;
        @JsonProperty("playerstatsentry")
        private List<NHLCumulativePlayerStatEntry> playerStatsEntries;

        @Data
        public static class NHLCumulativePlayerStatEntry {

            private NHLDetailedPlayer player;
            private NHLTeam team;
            private NHLStats stats;

        }

    }
}
