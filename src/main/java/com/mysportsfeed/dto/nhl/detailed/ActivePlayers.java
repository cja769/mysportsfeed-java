package com.mysportsfeed.dto.nhl.detailed;

import lombok.Data;

import java.util.List;

@Data
public class ActivePlayers {

    private String lastUpdatedOn;

    private List<PlayerEntry> playerentry;
}
