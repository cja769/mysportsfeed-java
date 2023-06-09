package com.mysportsfeeds.response.nhl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeeds.response.nhl.common.NHLDetailedPlayer;
import com.mysportsfeeds.response.nhl.common.NHLGame;
import com.mysportsfeeds.response.nhl.common.NHLPeriodSummary;
import com.mysportsfeeds.response.nhl.common.NHLStats;
import lombok.Data;

import java.util.List;

@Data
public class NHLBoxScoreResponse {

    @JsonProperty("gameboxscore")
    private NHLBoxScore gameBoxScore;

    @Data
    public static class NHLBoxScore {
        private String lastUpdatedOn;
        private NHLGame game;
        private NHLPeriodSummary periodSummary;
        private NHLAwayTeam awayTeam;
        private NHLHomeTeam homeTeam;

        @Data
        public static class NHLAwayTeam {
            private NHLStats awayTeamStats;
            private NHLPlayerEntryPlayer awayPlayers;
        }

        @Data
        public static class NHLHomeTeam {

            private NHLStats homeTeamStats;
            private NHLPlayerEntryPlayer homePlayers;

        }

        @Data
        public static class NHLPlayerEntryPlayer {
            private List<NHLPlayerEntry> playerEntry;

            @Data
            public static class NHLPlayerEntry {

                private NHLStats stats;
                private NHLDetailedPlayer player;
            }
        }
    }
}
