package com.mysportsfeed.dto.nhl.detailed;

import com.mysportsfeed.dto.nhl.common.Player;
import lombok.Data;

@Data
public class GoalieChange {

    private String teamAbbreviation;

    private Player incomingGoalie;

    private Player outgoingGoalie;
}
