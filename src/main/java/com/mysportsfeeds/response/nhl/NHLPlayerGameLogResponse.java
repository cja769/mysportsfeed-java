package com.mysportsfeeds.response.nhl;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeeds.response.common.DetailedPlayer;
import com.mysportsfeeds.response.common.References;
import com.mysportsfeeds.response.common.Stats;
import com.mysportsfeeds.response.common.Team;
import com.mysportsfeeds.response.nhl.common.NHLGame;
import com.mysportsfeeds.response.nhl.common.NHLGameLogStat;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

@Data
public class NHLPlayerGameLogResponse {

    private String lastUpdatedOn;
    @JsonProperty("gamelogs")
    private List<NHLPlayerGameLog> gameLogs;
    private References references;

    @Data
    public static class NHLPlayerGameLog {

        private NHLPlayerGameLogGame game;
        private Team team;
        private NHLPLayerGameLogPlayer player;
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
