package com.mysportsfeeds.response.nhl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeeds.response.nhl.common.NHLGame;
import com.mysportsfeeds.response.common.Player;
import com.mysportsfeeds.response.common.Team;
import lombok.Data;

import java.util.List;

@Data
public class NHLDailyDfsResponse {

    @JsonProperty("dailydfs")
    private NHLDailyDfs dailyDfs;

    @Data
    public static class NHLDailyDfs {
        private String lastUpdatedOn;
        private List<NHLDfsEntry> dfsEntries;

        @Data
        public static class NHLDfsEntry {

            private String dfsType;
            private List<NHLDfsRow> dfsRows;

            @Data
            public static class NHLDfsRow {

                private Player player;
                private Team team;
                private NHLGame game;
                private String salary;
                private Double fantasyPoints;
            }
        }
    }
}
