package com.mysportsfeeds.response.nhl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeeds.response.nhl.common.NHLGame;
import com.mysportsfeeds.response.common.Player;
import com.mysportsfeeds.response.common.Team;
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

            private Team team;

            @Data
            public static class NHLStarter {

                @JsonProperty("starter")
                private List<NHLStarterPlayer> starters;

                @Data
                public static  class NHLStarterPlayer {

                    private Player player;
                    private String position;
                }
            }
        }
    }
}
