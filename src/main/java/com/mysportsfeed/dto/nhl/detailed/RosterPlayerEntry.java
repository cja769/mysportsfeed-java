package com.mysportsfeed.dto.nhl.detailed;

import com.mysportsfeed.dto.nhl.common.Player;
import lombok.Data;

@Data
public class RosterPlayerEntry {

    private Player player;

    private String team;
}
