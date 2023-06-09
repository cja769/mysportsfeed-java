package com.mysportsfeed.response.nhl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeed.response.nhl.common.NHLGame;
import com.mysportsfeed.response.nhl.common.NHLPlayer;
import com.mysportsfeed.response.nhl.common.NHLTeam;
import lombok.Data;

import java.util.List;

@Data
public class NHLGameLineupResponse {

    @JsonProperty("gamestartinglineup")
    private NHLGameLineup gameStartingLinup;
    @Data
    public static class NHLGameLineup {
        private String lastUpdatedOn;
        private NHLGame game;
        private List<NHLTeamLineup> teamLineup;

        @Data
        public static class NHLTeamLineup {

            private NHLStarter expected;

            private NHLStarter actual;

            private NHLTeam team;

            @Data
            public static class NHLStarter {

                @JsonProperty("starter")
                private List<NHLStarterPlayer> starters;

                @Data
                public static  class NHLStarterPlayer {

                    private NHLPlayer player;
                    private String position;
                }
            }
        }
    }
}
