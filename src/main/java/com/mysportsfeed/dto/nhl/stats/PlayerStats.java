package com.mysportsfeed.dto.nhl.stats;

import lombok.Data;

import java.util.List;

@Data
public class PlayerStats {

    private String lastUpdatedOn;
    private List<PlayerStatEntry> playerstatsentry;
}
