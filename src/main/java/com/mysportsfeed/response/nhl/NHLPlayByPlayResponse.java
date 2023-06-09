package com.mysportsfeed.response.nhl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeed.response.nhl.common.NHLGame;
import com.mysportsfeed.response.nhl.common.NHLPlayer;
import lombok.Data;

import java.util.List;

@Data
public class NHLPlayByPlayResponse {

    @JsonProperty("gameplaybyplay")
    private NHLPlayByPlay gamePlayByPlay;

    @Data
    public static class NHLPlayByPlay {
        private String lastUpdatedOn;
        private NHLGame game;
        private List<NHLPlay> play;

        @Data
        public static class NHLPlay {

            private Integer period;
            private String time;
            private NHLFaceoff faceoff;
            private NHLShot shot;
            private NHLHit hit;
            private NHLGoal goal;
            private NHLPlayByPlayPenalty penalty;
            private NHLGoalieChange goalieChange;
            private NHLPenaltyShot penaltyShot;
            private Object shootoutAttempt; // TODO couldn't find an example in the scrambled data

            @Data
            public static class NHLFaceoff {
                private NHLPlayer awayPlayer;
                private NHLPlayer homePlayer;
                private String wonBy;
            }

            @Data
            public static class NHLShot {
                private String teamAbbreviation;
                private NHLPlayer shooter;
            }

            @Data
            public static class NHLHit {
                private String teamAbbreviation;
                private NHLPlayer player;
            }

            @Data
            public static class NHLGoal {

                private String specialTeam;
                private String teamAbbreviation;
                private NHLPlayer goalScorer;
                @JsonProperty("assist1Player")
                private NHLPlayer assist1Player;
                @JsonProperty("assist2Player")
                private NHLPlayer assist2Player;
            }

            @Data
            public static class NHLGoalieChange {

                private String teamAbbreviation;
                private NHLPlayer incomingGoalie;
                private NHLPlayer outgoingGoalie;
            }

            @Data
            public static class NHLPenaltyShot {

                private String teamAbbreviation;
                private NHLPlayer shooter;
                private String outcome;
            }

            @Data
            public static class NHLPlayByPlayPenalty {

                private String teamAbbreviation;
                private NHLPlayer penalizedPlayer;
                private String severity;
                private Integer durationMinutes;
                private String type;
            }

        }
    }
}
