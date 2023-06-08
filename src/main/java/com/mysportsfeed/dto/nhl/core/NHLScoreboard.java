package com.mysportsfeed.dto.nhl.core;

import lombok.Data;

@Data
public class NHLScoreboard {

    private String lastUpdatedOn;

    private NHLGameScore gameScore;
}
