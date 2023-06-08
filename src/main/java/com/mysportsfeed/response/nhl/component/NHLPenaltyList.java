package com.mysportsfeed.response.nhl.component;

import lombok.Data;

import java.util.List;

@Data
public class NHLPenaltyList {

    private List<NHLPenalty> penalty;
}
