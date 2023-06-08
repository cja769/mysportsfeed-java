package com.mysportsfeed.dto.nhl.detailed;

import com.mysportsfeed.dto.nhl.common.Player;
import lombok.Data;

@Data
public class Hit {

    private String teamAbbreviation;

    private Player player;
}
