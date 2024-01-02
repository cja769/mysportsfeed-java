package com.mysportsfeeds.response.nhl.common;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.mysportsfeeds.response.common.Team;
import lombok.Data;

import java.util.Date;

@Data
public class NHLGame {

    @JsonAlias("ID")
    private String id;
    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd")
    private Date date;
    private String time;
    private Team awayTeam;
    private Team homeTeam;
    private String location;
    private String scheduleStatus;
    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd")
    private Date originalDate;
    private String originalTime;
    private String delayedOrPostponedReason;
}
