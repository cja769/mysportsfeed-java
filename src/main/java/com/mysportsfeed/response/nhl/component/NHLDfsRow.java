package com.mysportsfeed.response.nhl.component;

import lombok.Data;

@Data
public class NHLDfsRow {

    // TODO don't know structure
    private Object player;

    // TODO don't know structure
    private Object team;

    private NHLGame game;

    private String salary;

    private Double fantasyPoints;
}
