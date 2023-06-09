package com.mysportsfeeds.response.nhl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeeds.response.nhl.common.NHLGame;
import com.mysportsfeeds.response.nhl.common.NHLPeriodSummary;
import lombok.Data;

@Data
public class NHLScoreboardResponse {

    private NHLScoreboard scoreboard;

    @Data
    public static class NHLScoreboard {

        private String lastUpdatedOn;

        private NHLGameScore gameScore;

        @Data
        public static class NHLGameScore {

            private NHLGame game;

            @JsonProperty("isUnplayed")
            private boolean unplayed;

            @JsonProperty("isInProgress")
            private boolean inProgress;

            @JsonProperty("isCompleted")
            private boolean completed;

            private Integer awayScore;

            private Integer homeScore;

            private String currentPeriod;

            private String currentPeriodSecondsRemaining;

            private Integer awayShots;

            private Integer homeShots;

            private NHLPeriodSummary periodSummary;

        }
    }
}
