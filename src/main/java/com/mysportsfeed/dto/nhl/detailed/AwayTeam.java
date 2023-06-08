package com.mysportsfeed.dto.nhl.detailed;

import com.mysportsfeed.dto.nhl.common.Stat;
import lombok.Data;

import java.util.List;

@Data
public class AwayTeam {

    private List<Stat> awayTeamStats;

    private List<PlayerEntryPlayer> awayPlayers;


}
