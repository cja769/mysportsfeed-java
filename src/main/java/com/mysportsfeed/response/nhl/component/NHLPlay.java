package com.mysportsfeed.response.nhl.component;

import lombok.Data;

@Data
public class NHLPlay {

    private Integer period;

    private String time;

    private NHLFaceoff faceoff;

    private NHLShot shot;

    private NHLHit hit;

    private NHLGoal goal;

    private NHLPlayByPlayPenalty penalty;

    private NHLGoalieChange goalieChange;

    private NHLPenaltyShot penaltyShot;
}
