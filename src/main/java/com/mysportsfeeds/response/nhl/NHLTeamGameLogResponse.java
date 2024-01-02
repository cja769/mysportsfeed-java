package com.mysportsfeeds.response.nhl;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeeds.response.common.References;
import com.mysportsfeeds.response.common.Stats;
import com.mysportsfeeds.response.common.Team;
import com.mysportsfeeds.response.nhl.NHLPlayerGameLogResponse.NHLPlayerGameLog;
import com.mysportsfeeds.response.nhl.NHLPlayerGameLogResponse.NHLPlayerGameLog.NHLPLayerGameLogPlayer;
import com.mysportsfeeds.response.nhl.NHLPlayerGameLogResponse.NHLPlayerGameLog.NHLPlayerGameLogGame;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
public class NHLTeamGameLogResponse {

    private String lastUpdatedOn;
    @JsonProperty("gamelogs")
    private List<NHLPlayerGameLogResponse.NHLPlayerGameLog> gameLogs;
    private References references;

    @Data
    public static class NHLPlayerGameLog {

        private NHLPlayerGameLogGame game;
        private Team team;
        private Stats stats;

        @Data
        public static class NHLPlayerGameLogGame {
            private Integer id;
            @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
            private Timestamp startTime;
            private String awayTeamAbbreviation;
            private String homeTeamAbbreviation;
        }

        @Data
        public static class NHLPLayerGameLogPlayer {
            private Integer id;
            private String firstName;
            private String lastName;
            private String position;
            private Integer jerseyNumber;
        }
    }
}
