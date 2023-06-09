package com.mysportsfeeds.response.nhl.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class NHLPlayerGameLogs {

    private String lastUpdatedOn;
    @JsonProperty("gamelogs")
    private List<NHLPlayerGameLog> gameLogs;

    @Data
    public static class NHLPlayerGameLog {

        private NHLGame game;
        private NHLTeam team;
        private NHLDetailedPlayer player;
        /**
         * The key is the full name of the stat
         */
        private Map<String, NHLGameLogStat> stats;
    }

}
