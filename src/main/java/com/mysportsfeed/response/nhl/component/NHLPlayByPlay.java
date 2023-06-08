package com.mysportsfeed.response.nhl.component;

import lombok.Data;

import java.util.List;

@Data
public class NHLPlayByPlay {

    private String lastUpdatedOn;

    private NHLGame game;

    private List<NHLPlay> play;
}
