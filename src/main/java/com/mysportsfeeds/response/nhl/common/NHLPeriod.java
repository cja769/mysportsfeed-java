package com.mysportsfeeds.response.nhl.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class NHLPeriod {

    @JsonProperty("@number")
    private Integer period;
    private Integer awayScore;
    private Integer homeScore;
    private Integer awayShots;
    private Integer homeShots;
    private NHLScoringList scoring;
    private NHLPenaltyList penalties;

    @Data
    public static class NHLScoringList {

        private List<NHLGoalScored> goalScored;

        @Data
        public static class NHLGoalScored {
            private String time;
            private String teamAbbreviation;
            private NHLDetailedPlayer goalScorer;
            @JsonProperty("assist1Player")
            private NHLDetailedPlayer assist1Player;
            @JsonProperty("assist2Player")
            private NHLDetailedPlayer assist2Player;
        }
    }

    @Data
    public static class NHLPenaltyList {

        private List<NHLPenalty> penalty;

        @Data
        public static class NHLPenalty {

            private String time;
            private String teamAbbreviation;
            private NHLDetailedPlayer penalizedPlayer;
            private String severity;
            private Integer durationMinutes;
            private String type;
        }
    }

}
