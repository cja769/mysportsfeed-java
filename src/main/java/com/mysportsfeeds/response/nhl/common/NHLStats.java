package com.mysportsfeeds.response.nhl.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Map;

@Data
public class NHLStats {
    @JsonProperty("GamesPlayed")
    private NHLStat gamesPlayed;
    /**
     * The full stat name is the key
     */
    private Map<String, NHLStat> stats;

    @Data
    public static class NHLStat {
        @JsonProperty("@abbreviation")
        private String abbreviation;
        @JsonProperty("#text")
        private Double value;
    }
}
