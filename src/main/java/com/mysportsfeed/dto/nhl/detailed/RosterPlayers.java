package com.mysportsfeed.dto.nhl.detailed;

import lombok.Data;

import java.util.List;

@Data
public class RosterPlayers {

    private String lastUpdatedOn;

    private List<RosterPlayerEntry> playerentry;
}
