package com.mysportsfeed.response.nhl.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class NHLDetailedPlayer extends NHLPlayer {

    @JsonProperty("Height")
    private String height;
    @JsonProperty("Weight")
    private String weight;
    @JsonProperty("BirthCity")
    private String birthCity;
    @JsonProperty("BirthCountry")
    private String birthCountry;
    @JsonProperty("IsRookie")
    private Boolean rookie;
    private NHLDetailedPlayerExternalMapping externalMapping;

    @Data
    public static class NHLDetailedPlayerExternalMapping {
        @JsonProperty("Source")
        private String source;
        @JsonProperty("ID")
        private String id;
    }
}
