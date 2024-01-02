package com.mysportsfeeds.response.nhl.common;

import com.mysportsfeeds.response.common.References.GameReference;
import lombok.Data;

import java.util.List;

@Data
public class NHLSchedule {

    private GameReference schedule;
    private NHLScheduleGameScore score;

    @Data
    public static class NHLScheduleGameScore {
        private Integer currentPeriod;
        private Integer currentPeriodSecondsRemaining;
        private Integer currentIntermission;
        private Integer awayScoreTotal;
        private Integer awayShotsTotal;
        private Integer homeScoreTotal;
        private Integer homeShotsTotal;
        private List<NHLScheduleGameScorePeriod> periods;

        @Data
        public static class NHLScheduleGameScorePeriod {
            private Integer periodNumber;
            private Integer awayScore;
            private Integer awayShots;
            private Integer homeScore;
            private Integer homeShots;
        }
    }

}
