package com.mysportsfeeds.response.nhl.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeeds.response.common.DetailedPlayer;
import com.mysportsfeeds.response.common.Stats;
import com.mysportsfeeds.response.common.Team;
import lombok.Data;

import java.util.List;

@Data
public class NHLPlayerStats {
    private String lastUpdatedOn;
    @JsonProperty("playerstatsentry")
    private List<NHLPlayerStatEntry> playerStatsEntries;

    @Data
    public static class NHLPlayerStatEntry {

        private DetailedPlayer player;
        private Team team;
        private Stats stats;

    }

}
