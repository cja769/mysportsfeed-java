package com.mysportsfeed.response.nhl.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class NHLTeamGameLogs {

    private String lastUpdatedOn;
    @JsonProperty("gamelogs")
    private List<NHLTeamGameLog> gameLogs;

    @Data
    public static class NHLTeamGameLog {

        private NHLGame game;
        private NHLTeam team;
        /**
         * The key is the full name of the stat
         */
        private Map<String, NHLGameLogStat> stats;
    }

}
