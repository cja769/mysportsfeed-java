package com.mysportsfeed.response.nhl.component;

import lombok.Data;

@Data
public class NHLHit {

    private String teamAbbreviation;

    private NHLPlayer player;
}
