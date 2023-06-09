package com.mysportsfeed.response.nhl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeed.response.nhl.common.NHLGame;
import com.mysportsfeed.response.nhl.common.NHLPlayer;
import com.mysportsfeed.response.nhl.common.NHLTeam;
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
