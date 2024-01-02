package com.mysportsfeeds.response.nhl;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysportsfeeds.response.common.References.StatReference;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class NHLCurrentSeasonResponse {

    private String lastUpdatedOn;
    private List<NHLSeason> seasons;

    @Data
    public static class NHLSeason {

        private String name;
        private String slug;
        @JsonFormat(pattern = "yyyy-MM-dd")
        private Date startDate;
        @JsonFormat(pattern = "yyyy-MM-dd")
        private Date endDate;
        private String seasonInterval;
        private List<StatReference> supportedPlayerStats;
        private List<StatReference> supportedTeamStats;
        private Object notes; // I don't know the structure

    }
}
