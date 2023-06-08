package com.mysportsfeed.response.nhl.component;

import lombok.Data;

@Data
public class NHLDfsRow {

    private NHLDfsPlayer player;

    private String team;

    private NHLGame game;

    private String salary;

    private Double fantasyPoints;
}
