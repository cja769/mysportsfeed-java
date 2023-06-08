package com.mysportsfeed.dto.nhl.stats;

import lombok.Data;

import java.util.List;

@Data
public class PlayerGameLogList {

    private String lastUpdatedOn;

    private List<PlayerGameLog> gamelogs;
}
