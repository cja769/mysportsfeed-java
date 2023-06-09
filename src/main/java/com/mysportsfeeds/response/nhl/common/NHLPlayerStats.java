package com.mysportsfeeds.response.nhl.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class NHLPlayerStats {
    private String lastUpdatedOn;
    @JsonProperty("playerstatsentry")
    private List<NHLPlayerStatEntry> playerStatsEntries;

    @Data
    public static class NHLPlayerStatEntry {

        private NHLDetailedPlayer player;
        private NHLTeam team;
        private NHLStats stats;

    }

}
