package com.mysportsfeed.response.nhl.component;

import lombok.Data;

@Data
public class NHLGoalieChange {

    private String teamAbbreviation;

    private NHLPlayer incomingGoalie;

    private NHLPlayer outgoingGoalie;
}
