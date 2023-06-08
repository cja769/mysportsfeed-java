package com.mysportsfeed.dto.common;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import lombok.Data;

import java.util.Date;

@Data
public class GameEntry {
    private String id;

    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd")
    private Date date;

    private String time;

    private String awayTeam;

    private String homeTeam;

    private String location;
}
