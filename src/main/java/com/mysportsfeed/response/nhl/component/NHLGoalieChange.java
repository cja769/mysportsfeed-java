package com.mysportsfeed.response.nhl.component;

import lombok.Data;

@Data
public class NHLGoalieChange {

    private String teamAbbreviation;

    // TODO don't know structure
    private Object incomingGoalie;

    // TODO don't know structure
    private Object outgoingGoalie;
}
