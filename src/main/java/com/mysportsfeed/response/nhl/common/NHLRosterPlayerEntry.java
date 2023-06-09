package com.mysportsfeed.response.nhl.common;

import lombok.Data;

@Data
public class NHLRosterPlayerEntry {
    private NHLDetailedPlayer player;
    private NHLTeam team;
}
