package com.mysportsfeed.dto.nhl.detailed;

import com.mysportsfeed.dto.nhl.common.Player;
import lombok.Data;

@Data
public class Penalty {

    private String teamAbbreviation;

    private Player penalizedPlayer;

    private String severity;

    private Integer durationMinutes;

    private String type;
}
