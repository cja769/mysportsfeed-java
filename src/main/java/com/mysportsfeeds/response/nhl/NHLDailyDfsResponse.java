package com.mysportsfeeds.response.nhl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeeds.response.nhl.common.NHLGame;
import com.mysportsfeeds.response.nhl.common.NHLPlayer;
import com.mysportsfeeds.response.nhl.common.NHLTeam;
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

                private NHLPlayer player;
                private NHLTeam team;
                private NHLGame game;
                private String salary;
                private Double fantasyPoints;
            }
        }
    }
}
