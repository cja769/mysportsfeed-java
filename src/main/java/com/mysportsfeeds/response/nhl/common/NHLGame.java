package com.mysportsfeeds.response.nhl.common;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import lombok.Data;

import java.util.Date;

@Data
public class NHLGame {
    private String id;
    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd")
    private Date date;
    private String time;
    private NHLTeam awayTeam;
    private NHLTeam homeTeam;
}
