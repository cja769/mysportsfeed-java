package com.mysportsfeeds.response.nhl;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class NHLCurrentSeasonResponse {
    @JsonProperty("currentseason")
    private NHLCurrentSeason currentSeason;

    @Data
    public static class NHLCurrentSeason {

        private String lastUpdatedOn;
        private List<NHLSeason> season;

        @Data
        public static class NHLSeason {

            private NHLDetail details;
            private List<NHLSupportedPlayerStat> supportedPlayerStats;
            private List<NHLSupportedTeamStat> supportedTeamStats;

            @Data
            public static class NHLDetail {

                private String name;
                private String slug;
                @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd")
                private Date startDate;
                @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd")
                private Date endDate;
                private String intervalType;
            }

            @Data
            public static class NHLSupportedTeamStat {
                private NHLSupportedStat teamStat;
            }

            @Data
            public static class NHLSupportedPlayerStat {
                private NHLSupportedStat playerStat;
            }

            @Data
            public static class NHLSupportedStat {
                private String category;
                private String name;
                private String abbreviation;
            }
        }
    }
}
