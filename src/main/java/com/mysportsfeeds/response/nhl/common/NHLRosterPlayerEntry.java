package com.mysportsfeeds.response.nhl.common;

import com.mysportsfeeds.response.common.DetailedPlayer;
import com.mysportsfeeds.response.common.Team;
import lombok.Data;

@Data
public class NHLRosterPlayerEntry {
    private DetailedPlayer player;
    private Team team;
}
