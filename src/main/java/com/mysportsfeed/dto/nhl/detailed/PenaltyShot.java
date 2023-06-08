package com.mysportsfeed.dto.nhl.detailed;

import com.mysportsfeed.dto.nhl.common.Player;
import lombok.Data;

@Data
public class PenaltyShot {

    private String teamAbbreviation;

    private Player shooter;

    private String outcome;
}
