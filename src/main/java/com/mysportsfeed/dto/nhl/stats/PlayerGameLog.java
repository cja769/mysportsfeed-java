package com.mysportsfeed.dto.nhl.stats;

import com.mysportsfeed.dto.nhl.common.Player;
import com.mysportsfeed.dto.nhl.common.Stat;
import lombok.Data;

import java.util.List;

@Data
public class PlayerGameLog {

    private Player player;

    private String team;

    private List<Stat> stats;

    private String game;
}
