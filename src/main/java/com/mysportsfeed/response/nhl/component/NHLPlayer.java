package com.mysportsfeed.response.nhl.component;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import lombok.Data;

import java.util.Date;

// TODO None of this was actually directly documented so the types and keys are guesses
@Data
public class NHLPlayer {

    private Integer jerseyNumber;

    private String height;

    private String weight;

    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd")
    private Date birthDate;

    private Integer age;

    private String birthCity;

    private String birthCountry;

    private String position;
}
