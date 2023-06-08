package com.mysportsfeed.response.nhl.component;

import lombok.Data;

import java.util.List;

@Data
public class NHLRosterPlayers {

    private String lastUpdatedOn;

    private List<NHLRosterPlayerEntry> playerentry;
}
