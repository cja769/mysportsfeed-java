package com.mysportsfeeds.response.nhl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeeds.response.nhl.common.NHLDetailedPlayer;
import com.mysportsfeeds.response.nhl.common.NHLGame;
import com.mysportsfeeds.response.nhl.common.NHLPeriodSummary;
import com.mysportsfeeds.response.nhl.common.NHLStats.NHLStat;
import lombok.Data;

import java.util.List;
import java.util.Map;

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
            /**
             * The key is the full name of the stat
             */
            private Map<String, NHLStat> awayTeamStats;
            private List<NHLPlayerEntryPlayer> awayPlayers;
        }

        @Data
        public static class NHLHomeTeam {

            /**
             * The key is the full name of the stat
             */
            private Map<String, NHLStat> homeTeamStats;
            private List<NHLPlayerEntryPlayer> homePlayers;

        }

        @Data
        public static class NHLPlayerEntryPlayer {
            private NHLPlayerEntry playerEntry;

            @Data
            public static class NHLPlayerEntry {

                /**
                 * The key is the full name of the stat
                 */
                private Map<String, NHLStat> stats;
                private NHLDetailedPlayer player;
            }
        }
    }
}
