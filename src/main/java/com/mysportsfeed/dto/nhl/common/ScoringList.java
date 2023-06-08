package com.mysportsfeed.dto.nhl.common;

import lombok.Data;

import java.util.List;

@Data
public class ScoringList {

    private List<GoalScored> goalScored;
}
