package com.mysportsfeed.dto.nhl.detailed;

import com.mysportsfeed.dto.nhl.common.Player;
import lombok.Data;

@Data
public class StarterPlayer {
    private Player player;

    private String position;
}
