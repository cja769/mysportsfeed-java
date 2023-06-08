package com.mysportsfeed.dto.nhl.common;

import lombok.Data;

@Data
public class Penalty {

    private String time;

    private String teamAbbreviation;

    private Player penalizedPlayer;

    private String severity;

    private String type;
}
