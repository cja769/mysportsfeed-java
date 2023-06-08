package com.mysportsfeed.dto.nhl.detailed;

import lombok.Data;

@Data
public class Play {

    private Integer period;

    private String time;

    private Faceoff faceoff;

    private Shot shot;

    private Hit hit;

    private Goal goal;

    private Penalty penalty;

    private GoalieChange goalieChange;

    private PenaltyShot penaltyShot;
}
