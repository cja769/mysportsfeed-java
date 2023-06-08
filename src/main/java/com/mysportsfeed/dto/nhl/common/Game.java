package com.mysportsfeed.dto.nhl.common;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import lombok.Data;

import java.util.Date;

@Data
public class Game {

    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd")
    private Date date;

    private String time;

    private String awayTeam;

    private String homeTeam;
}
