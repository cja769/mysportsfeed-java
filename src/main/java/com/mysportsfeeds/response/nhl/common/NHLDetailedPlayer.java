package com.mysportsfeeds.response.nhl.common;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

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
    @JsonProperty("BirthDate")
    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd")
    private Date birthDate;
    @JsonProperty("Age")
    private Integer age;
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
