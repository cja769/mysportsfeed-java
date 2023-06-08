package com.mysportsfeed.response.nhl.component;

import lombok.Data;

@Data
public class NHLShot {

    private String teamAbbreviation;

    private NHLPlayer shooter;
}
