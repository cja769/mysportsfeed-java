package com.mysportsfeed.dto.nhl.detailed;

import com.mysportsfeed.dto.nhl.common.Player;
import com.mysportsfeed.dto.nhl.common.Stat;
import lombok.Data;

import java.util.List;

@Data
public class PlayerEntry {

    private List<Stat> stats;

    private Player player;
}
