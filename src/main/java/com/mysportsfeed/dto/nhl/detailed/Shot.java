package com.mysportsfeed.dto.nhl.detailed;

import com.mysportsfeed.dto.nhl.common.Player;
import lombok.Data;

@Data
public class Shot {

    private String teamAbbreviation;

    private Player shooter;
}
