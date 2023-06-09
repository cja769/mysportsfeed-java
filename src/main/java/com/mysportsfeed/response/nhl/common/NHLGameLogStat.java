package com.mysportsfeed.response.nhl.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class NHLGameLogStat {
    @JsonProperty("@category")
    private String category;
    @JsonProperty("@abbreviation")
    private String abbreviation;
    @JsonProperty("#text")
    private Double value;
}
