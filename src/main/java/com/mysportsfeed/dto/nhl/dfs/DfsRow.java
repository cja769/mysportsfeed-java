package com.mysportsfeed.dto.nhl.dfs;

import com.mysportsfeed.dto.nhl.common.Game;
import lombok.Data;

@Data
public class DfsRow {

    private DfsPlayer player;

    private String team;

    private Game game;

    private String salary;

    private Double fantasyPoints;
}
